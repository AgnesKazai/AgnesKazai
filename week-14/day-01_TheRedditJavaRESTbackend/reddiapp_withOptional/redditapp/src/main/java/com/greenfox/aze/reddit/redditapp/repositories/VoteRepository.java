package com.greenfox.aze.reddit.redditapp.repositories;

import com.greenfox.aze.reddit.redditapp.models.Post;
import com.greenfox.aze.reddit.redditapp.models.User;
import com.greenfox.aze.reddit.redditapp.models.Vote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends CrudRepository<Vote, Long> {

    Vote findByPostAndUser(Post post, User user);
}
