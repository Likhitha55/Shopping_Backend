package com.shoppingwebsite.database.api.Database.API.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class PortalUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    UUID id;
    String name;
    String email;
    String password;
    Long contactNumber;
    String address;
    String type;
}
