package com.meet.response;

import com.meet.model.User_Role;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private User_Role role;

}
