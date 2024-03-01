package com.shoppingwebsite.database.api.Database.API.repository;

import com.shoppingwebsite.database.api.Database.API.models.ACL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ACLRepo extends JpaRepository<ACL, UUID> {
}
