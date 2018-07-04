package com.greenfox.aze.reddit.redditapp.contollers;

import com.greenfox.aze.reddit.redditapp.models.*;
import com.greenfox.aze.reddit.redditapp.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
public class PostsController {

    private final PostServiceImpl postService;

    @Autowired
    public PostsController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public Object listingAllPosts() {
        return postService.getAllItem();
    }

    @PostMapping("/posts")
    public Object addingANewPost(@RequestBody Post newPost) {
        postService.addItem(newPost);
        return postService.findItemById(newPost.getId());
    }

    @PutMapping("/posts/{id}/upvote")
    public Object upVotePost(@PathVariable Long id) {
        postService.increaseScoreOfPost(id);
        return postService.findItemById(id);
    }

    @PutMapping("/posts/{id}/downvote")
    public Object downVotePost(@PathVariable Long id) {
        postService.decreaseScoreOfPost(id);
        return postService.findItemById(id);
    }
}
