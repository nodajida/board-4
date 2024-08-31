package com.sparta.board13.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class BoardSaveResponseDto {

    private final Long id;
    private final String title;
    private final String contents;


    public BoardSaveResponseDto(Long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }
}

