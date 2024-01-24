package com.tothenew.beach.joblisting.service;

import com.tothenew.beach.joblisting.model.Post;

import java.util.List;

public interface PostService {

    public Post savePost(Post post);

    public Post getPost(String profile);

    public List<Post> getAllPosts();

    public List<Post> searchPost(String text);

}
