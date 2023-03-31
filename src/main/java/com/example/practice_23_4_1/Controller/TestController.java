package com.example.practice_23_4_1.Controller;

import com.example.practice_23_4_1.DTO.ReqBoardDTO;
import com.example.practice_23_4_1.DTO.ReqSignUpDTO;
import com.example.practice_23_4_1.Entity.Account;
import com.example.practice_23_4_1.Service.AccountService;
import com.example.practice_23_4_1.Service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    AccountService accountService;
    BoardService boardService;
    public TestController(AccountService accountService, BoardService boardService) {
        this.accountService = accountService;
        this.boardService = boardService;
    }

    @GetMapping("/api/v1/req")
    public ResponseEntity<?> getController() {
        return ResponseEntity.ok().body("success");
    }

    @PostMapping("/api/v1/signup")
    public ResponseEntity<?> getSignUpController(@RequestBody ReqSignUpDTO reqSignUpDTO) {
        return ResponseEntity.ok().body(accountService.saveAccount(reqSignUpDTO));
    }

    @PostMapping("/api/v1/post")
    public ResponseEntity<?> reqBoardController(@RequestBody ReqBoardDTO reqBoardDTO) {
        return ResponseEntity.ok().body(boardService.savePost(reqBoardDTO));
    }
}
