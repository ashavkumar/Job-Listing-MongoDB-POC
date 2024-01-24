package com.tothenew.beach.joblisting.service;

import com.tothenew.beach.joblisting.model.Post;
import com.tothenew.beach.joblisting.repository.PostRepository;
import com.tothenew.beach.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private SearchRepository searchRepository;

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public Post getPost(String profile) {
        if (postRepository.findById(profile).isPresent()) {
            return postRepository.findById(profile).get();
        } else {
            return null;
        }
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public List<Post> searchPost(String text) {
        return searchRepository.findByText(text);
    }

}
