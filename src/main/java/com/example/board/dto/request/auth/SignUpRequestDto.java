package com.example.board.dto.request.auth;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto {
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]*@([-.]?[a-zA-Z0-9])*\\.[a-zA-Z]{2,4}$")
    private String Email;
    
    @NotBlank
    @Length(min = 8, max = 20)//길이 제한
    private String password;
    
    @NotBlank
    private String nickName;
    
    @NotBlank
    @Pattern(regexp = "^[0-9]{10,12}$")    // 숫자만 지정
    private String telNumber;
    
    @NotBlank
    private String address;
    

    private String addressDetail;


    public String patchNickName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'patchNickName'");
    }
}
