package com.example.board.dto.response.board;

import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.board.item.BoardListItem;

import lombok.Getter;

@Getter
public class GetLatestListReponseDto extends ResponseDto {
    private List<BoardListItem> latestList;

    public GetLatestListReponseDto(String code, String message, List<BoardListItem> LatestList) {
        super(code, message);
        this.latestList = latestList;
    }
}
