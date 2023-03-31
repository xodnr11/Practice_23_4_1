package com.example.practice_23_4_1.Repository;

import com.example.practice_23_4_1.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
