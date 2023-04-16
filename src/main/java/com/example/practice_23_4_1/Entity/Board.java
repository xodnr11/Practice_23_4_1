package com.example.practice_23_4_1.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String boardName;

    @OneToMany(mappedBy = "board")
    private List<Post> post;

    @Builder
    public Board(Long id, String boardName, List<Post> post) {
        this.id = id;
        this.boardName = boardName;
        this.post = post;
    }
}
