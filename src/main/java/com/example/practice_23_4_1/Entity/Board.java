package com.example.practice_23_4_1.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

    @ManyToOne
    private Account account;

    @Builder
    public Board(Long id, String title, String content, Account account) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.account = account;
    }
}
