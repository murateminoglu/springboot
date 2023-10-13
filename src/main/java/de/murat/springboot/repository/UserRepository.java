package de.murat.springboot.repository;

import de.murat.springboot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {

}
