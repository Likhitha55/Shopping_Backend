package com.shoppingwebsite.database.api.Database.API.controller;

import com.shoppingwebsite.database.api.Database.API.DTO.RequestBody.AddAccessDTO;
import com.shoppingwebsite.database.api.Database.API.models.ACL;
import com.shoppingwebsite.database.api.Database.API.repository.ACLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db/acl")
public class ACLController {
    @Autowired
    ACLRepo aclRepository;
    @PostMapping("/add-access")
    public void registerAccess(@RequestBody AddAccessDTO addAccessDTO){
        ACL acl = new ACL();
        acl.setRequester(addAccessDTO.getRequester());
        acl.setOperation(addAccessDTO.getOperation());
        aclRepository.save(acl);
    }
}
