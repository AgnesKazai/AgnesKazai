package com.greenfox.aze.reddit.redditapp.repositories;

import com.greenfox.aze.reddit.redditapp.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByUsername(String name);


}
