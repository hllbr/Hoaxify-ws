package com.hoaxifySecond.ws.hoax.vm;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@Data
public class HoaxSubmitVM {

    @Size(min = 1,max = 1000)
    private String content;

    private long attachmentId;

}
