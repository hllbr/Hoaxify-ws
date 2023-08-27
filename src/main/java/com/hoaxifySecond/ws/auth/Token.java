package com.hoaxifySecond.ws.auth;

import com.hoaxifySecond.ws.user.User;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tokens")
public class Token {

    @Id
    private String token;

    @ManyToOne
    private User user;

}
