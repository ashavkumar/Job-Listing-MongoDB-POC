package com.tothenew.beach.joblisting.repository;

import com.tothenew.beach.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
