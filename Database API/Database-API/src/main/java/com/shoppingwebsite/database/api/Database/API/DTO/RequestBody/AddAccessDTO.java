package com.shoppingwebsite.database.api.Database.API.DTO.RequestBody;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AddAccessDTO {
    String requester;
    String operation;
}
