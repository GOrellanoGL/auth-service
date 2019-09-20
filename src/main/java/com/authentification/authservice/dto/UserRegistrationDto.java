package com.authentification.authservice.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class UserRegistrationDto implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotNull
    @NotBlank
    private String username;
    @NotNull
    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
