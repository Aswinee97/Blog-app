package com.blog.repository;

import com.blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository  extends JpaRepository<Post,Long> {
    Optional<Post> findByUrl(String url);
}
