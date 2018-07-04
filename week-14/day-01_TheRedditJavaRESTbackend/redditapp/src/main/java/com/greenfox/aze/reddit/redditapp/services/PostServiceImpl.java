package com.greenfox.aze.reddit.redditapp.services;

import com.greenfox.aze.reddit.redditapp.models.Post;
import com.greenfox.aze.reddit.redditapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements GenericService<Post> {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void addItem(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> getAllItem() {
        return postRepository.findAll();
    }

    @Override
    public void deleteItem(Post post) {
        postRepository.delete(post);

    }

    @Override
    public void updateItem(Post post) {
        postRepository.save(post);
    }

    @Override
    public Post findItemById(Long id) {
        return postRepository.findById(id).get();
    }


    public void increaseScoreOfPost(Long id) {
        Optional<Post> post = postRepository.findById(id);
        post.get().setVote(1);
        post.get().setScore(post.get().getScore() + post.get().getVote());
        postRepository.save(post.get());
    }

    public void decreaseScoreOfPost(Long id) {
        Optional<Post> post = postRepository.findById(id);
        post.get().setVote(-1);
        post.get().setScore(post.get().getScore() + post.get().getVote());
        postRepository.save(post.get());
    }
}
