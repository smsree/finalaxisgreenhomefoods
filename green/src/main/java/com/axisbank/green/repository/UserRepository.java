package com.axisbank.green.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.axisbank.green.model.*;
@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
