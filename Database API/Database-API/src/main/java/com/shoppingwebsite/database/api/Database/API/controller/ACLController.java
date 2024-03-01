package com.shoppingwebsite.database.api.Database.API.controller;

import com.shoppingwebsite.database.api.Database.API.DTO.RequestBody.AddAccessDTO;
import com.shoppingwebsite.database.api.Database.API.DTO.ResponseBody.ACLConfigDTO;
import com.shoppingwebsite.database.api.Database.API.models.ACL;
import com.shoppingwebsite.database.api.Database.API.repository.ACLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/validate")
    public ResponseEntity<ACLConfigDTO> isAccessAvailable(@RequestParam String requester, @RequestParam String operation){
        ACL acl = aclRepository.getConfiguration(requester,operation);
        if(acl!=null){
            return new ResponseEntity<>(new ACLConfigDTO(true), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new ACLConfigDTO(false), HttpStatus.OK);
        }
    }
}