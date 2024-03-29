package com.shoppingwebsite.database.api.Database.API.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderVsProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    UUID productId;
    UUID orderId;
}
