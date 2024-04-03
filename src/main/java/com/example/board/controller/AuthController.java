package com.example.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth") // 경로 지정
// 초기화 되지않은 final필드나 생성자 생성해줌,
// 새로운 코드를 추가할 때 다시 생성자를 만들지 않아도 됨.
@RequiredArgsConstructor    
public class AuthController {
    // 생성자 주입에 대한 코드 생성
    private final AuthService authService;
    // HTTP의 Post 메서드로 /api/v1/auth/sign-up 로 들어오는 경로를 post 처리,
    // Post메서드는 데이터를 노출하지 않으면서 요청을 하기에, 회원가입같은 경우에 사용하기 좋다.
    @PostMapping("/sign-up")
    // ResponseEntity<ResponseDto>: Client에게 응답을 반환,ResponseEntity 을 반환, ResponseEntity는 HTTP응답 상태, 코드 등을 포함
    // @RequestBody: Client부터 전송된 HTTP요청의 내용을 자바 객체로 변환,
    // SignUpRequestDto객체로 자동 변환한다.
    // @Valid: 객체의 유효성 검사로 SignUpRequestDto이 유효한지 검사, 오류 시 오류 응답을 반환
    public ResponseEntity<ResponseDto> signUp(@RequestBody @Valid SignUpRequestDto requestBody
    ) {
        //ResponseEntity<ResponseDto>: 사용자의 가입 요청 처리
        ResponseEntity<ResponseDto> response = authService.signUp(requestBody);
        return response;
    }

}