package com.example.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.response.board.GetLatestListReponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardCountroller {

    private final BoardService boardService;

    @GetMapping("/latest-list")
    public ResponseEntity<GetLatestListReponseDto> getLatestList() {
        return null;
    }

}
