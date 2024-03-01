package com.shoppingwebsite.database.api.Database.API.DTO.RequestBody;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductReqBody {
    String productName;
    int price;
    int quantity;
    String productType;
    UUID sellerId;
}
