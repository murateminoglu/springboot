package de.murat.springboot.repository;

import de.murat.springboot.entity.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
