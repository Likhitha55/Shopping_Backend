package com.Shopping_Backend.Front_API.DTO.RequestDTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestProductDTO {
    String productName;
    int price;
    int qunatity;
    UUID sellerId;
    String productType;
}
