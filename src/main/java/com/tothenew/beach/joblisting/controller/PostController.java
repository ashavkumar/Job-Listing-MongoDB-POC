package com.tothenew.beach.joblisting.controller;

import com.tothenew.beach.joblisting.model.Post;
import com.tothenew.beach.joblisting.repository.PostRepository;
import com.tothenew.beach.joblisting.repository.SearchRepository;
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
    private PostRepository postRepository;
    @Autowired
    private SearchRepository searchRepository;

    @GetMapping("/greeting")
    public String getMessage() {
        return "Let's connect in evening!!";
    }

    @PostMapping("/post")
    public Post savePost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @GetMapping("/getPost/{profile}")
    public Post getPost(@PathVariable String profile) {
        System.out.println("Profile: " + profile);
        if (postRepository.findById(profile).isPresent()) {
            return postRepository.findById(profile).get();
        } else {
            return null;
        }
    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> searchPost(@PathVariable String text) {
        return searchRepository.findByText(text);
    }

}
