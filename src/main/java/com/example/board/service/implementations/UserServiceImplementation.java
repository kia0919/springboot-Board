package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.user.GetUserResponseDto;
import com.example.board.entity.UserEntity;
import com.example.board.repository.UserRepository;
import com.example.board.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    
    @Override
    public ResponseEntity<? super GetUserResponseDto> getUser(String email) {
        
        try {
            // 1. User 테이블에서 email에 해당하는 유저 조회
            // SELECT * FROM  user WHERE email = :email
            // findByEmail(email)  위의 sql문을 query문으로 한것
            // (email -> (true, false) / (조회 결과 인스턴스) )
            UserEntity UserEntity = userRepository.findByEmail(email);  //해당 email은 프라이머리 키
        } catch (Exception exception) {
            // 1-1. 조회 처리 중 데이터베이스관련 예외가 발생하면 데이터베이스 에러 응답처리
            exception.printStackTrace();
            return ResponseDto.databaseError();  //어떤 예외가 발생했는지 출력까지 해줌
        }


        
        // 2-1. 조회 결과에 따라 반환 결정.
        // 1) false이면 존재하지 않는 유저 응답처리 X, (반환을 true, false로 했기 때문에 true가 나오면 true에 대해 무한 검색함)
        // 2) null 이면 존재하지 않는 유저 응답처리

        // 3. 조회 결과 데이터를 성공 응답
        // 


    }
    
}