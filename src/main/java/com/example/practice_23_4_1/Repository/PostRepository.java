package com.example.practice_23_4_1.Repository;

import com.example.practice_23_4_1.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
