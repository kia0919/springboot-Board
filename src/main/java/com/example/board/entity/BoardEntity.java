package com.example.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name="board")
@Table(name ="board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer board_number;
    private String title;
    private String contents;
    private String imageUrl;
    private Integer view_count;
    private Integer comment_count;
    private Integer favorite_count;
    private String write_Datetime;
    private String writerEmail;    
}
