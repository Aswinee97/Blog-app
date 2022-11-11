package com.blog.services;

import com.blog.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAllPosts();
    void createPost(PostDto postDto);

    PostDto findPostById(Long postId);

    void updatePost(PostDto post);

    PostDto findPostByUrl(String postUrl);
}
