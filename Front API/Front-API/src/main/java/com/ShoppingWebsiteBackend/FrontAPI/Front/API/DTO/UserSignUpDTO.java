package com.ShoppingWebsiteBackend.FrontAPI.Front.API.DTO;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserSignUpDTO {
    UUID id;
    String name;
    String email;
    String password;
    Long contactNumber;
    String address;
    String type;
}
