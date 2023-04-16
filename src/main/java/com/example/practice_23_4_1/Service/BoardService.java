package com.example.practice_23_4_1.Service;

import com.example.practice_23_4_1.DTO.ReqPostDTO;
import com.example.practice_23_4_1.Entity.Account;
import com.example.practice_23_4_1.Entity.Board;
import com.example.practice_23_4_1.Entity.Post;
import com.example.practice_23_4_1.Repository.AccountRepository;
import com.example.practice_23_4_1.Repository.BoardRepository;
import com.example.practice_23_4_1.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final PostRepository postRepository;
    private final AccountRepository accountRepository;
    private final BoardRepository boardRepository;

    public Long savePost(ReqPostDTO reqPostDTO) {

        Account referenceById = accountRepository.getReferenceById(reqPostDTO.getId());
/*        Post post = Post.builder()
                .title(reqPostDTO.getTitle())
                .content(reqPostDTO.getContent())
                .account(accountRepository.findById(reqPostDTO.getId()).get())
                .build();*/
        Post post = Post.builder()
                .title(reqPostDTO.getTitle())
                .content(reqPostDTO.getContent())
                .account(referenceById)
                .build();
        postRepository.save(post);
        return post.getId();
    }

    public Post loadPost(Long postNum){
        return postRepository.getReferenceById(postNum);
    }

    public Board resBoard(String BoardName) {

        return boardRepository.findByBoardName(BoardName).orElseThrow(
                ()->new IllegalArgumentException("게시판이 존재하지 않습니다.")
        );

    }
}
