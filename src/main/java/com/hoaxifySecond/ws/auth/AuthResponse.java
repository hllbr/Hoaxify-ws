package com.hoaxifySecond.ws.auth;

import com.hoaxifySecond.ws.user.vm.UserVM;
import lombok.Data;

@Data
public class AuthResponse {

    private String token;

    private UserVM user;
}
