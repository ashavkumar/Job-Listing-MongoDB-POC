package com.tothenew.beach.joblisting.repository;

import com.tothenew.beach.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
