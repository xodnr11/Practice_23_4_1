package com.example.practice_23_4_1.Service;

import com.example.practice_23_4_1.DTO.ReqBoardDTO;
import com.example.practice_23_4_1.Entity.Account;
import com.example.practice_23_4_1.Entity.Board;
import com.example.practice_23_4_1.Repository.AccountRepository;
import com.example.practice_23_4_1.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final AccountRepository accountRepository;

    public Long savePost(ReqBoardDTO reqBoardDTO) {

        Board board = Board.builder()
                .title(reqBoardDTO.getTitle())
                .content(reqBoardDTO.getContent())
                .account(accountRepository.findById(reqBoardDTO.getId()).get())
                .build();

        boardRepository.save(board);
        return board.getId();

    }
}
