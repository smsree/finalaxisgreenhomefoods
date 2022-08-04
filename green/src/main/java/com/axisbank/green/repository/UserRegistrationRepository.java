package com.axisbank.green.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.axisbank.green.model.UserRegistration;
@Repository
public interface UserRegistrationRepository extends MongoRepository<UserRegistration, String> {

}

