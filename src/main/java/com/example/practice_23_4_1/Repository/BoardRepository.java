package com.example.practice_23_4_1.Repository;

import com.example.practice_23_4_1.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Optional<Board> findByBoardName(String boardName);
}
