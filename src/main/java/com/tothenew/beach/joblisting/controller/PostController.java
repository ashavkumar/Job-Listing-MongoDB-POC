package com.tothenew.beach.joblisting.controller;

import com.tothenew.beach.joblisting.model.Post;
import com.tothenew.beach.joblisting.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/greeting")
    public String getMessage() {
        return "Let's connect in evening!!";
    }

    @PostMapping("/post")
    public Post savePost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/getPost/{profile}")
    public Post getPost(@PathVariable String profile) {
        return postService.getPost(profile);
    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{text}")
    public List<Post> searchPost(@PathVariable String text) {
        return postService.searchPost(text);
    }

}
