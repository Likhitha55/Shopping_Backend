package com.shoppingwebsite.database.api.Database.API.repository;

import com.shoppingwebsite.database.api.Database.API.models.PortalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PortalUserRepo extends JpaRepository<PortalUser, UUID> {
}
