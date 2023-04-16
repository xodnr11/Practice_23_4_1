package com.example.practice_23_4_1.Controller;

import com.example.practice_23_4_1.DTO.ReqPostDTO;
import com.example.practice_23_4_1.DTO.ReqSignUpDTO;
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

    //회원가입
    @PostMapping("/api/v1/signup")
    public ResponseEntity<?> getSignUpController(@RequestBody ReqSignUpDTO reqSignUpDTO) {
        return ResponseEntity.ok().body(accountService.saveAccount(reqSignUpDTO));
    }

    //게시글 저장
    @PostMapping("/api/v1/post")
    public ResponseEntity<?> reqPostController(@RequestBody ReqPostDTO reqPostDTO) {
        return ResponseEntity.ok().body(boardService.savePost(reqPostDTO));
    }

    //게시판 조회
    @PostMapping("api/v1/board")
    public ResponseEntity<?> resBoardController(@RequestBody String boardName) {
        return ResponseEntity.ok().body(boardService.resBoard(boardName));
    }

    //게시글 조회
    @PostMapping("api/v1/view")
    public ResponseEntity<?> resPostController(@RequestBody Long postNum) {
        return ResponseEntity.ok().body(boardService.loadPost(postNum));
    }
}
