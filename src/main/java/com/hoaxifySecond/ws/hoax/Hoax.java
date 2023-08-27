package com.hoaxifySecond.ws.hoax;

import com.hoaxifySecond.ws.file.FileAttachment;
import com.hoaxifySecond.ws.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "hoaxes")
public class Hoax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 1000)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "hoax",cascade = CascadeType.REMOVE)
    private FileAttachment fileAttachment;

}
