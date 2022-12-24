package com.example.demo.user.service;

import com.example.demo.user.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired UserService service;

    @Test
    @DisplayName("로그인이 성공하면 회원데이터가 리턴된다.")
    void loginTest2() {
        // given
        String email = "apple@gmail.com";
        String password = "12345";
        // when
        UserEntity user = service.validateLogin(email, password);
        // then
        assertNotNull(user);
        assertEquals(email, user.getEmail());
    }

}
//런서버 돌리면 가입된 회원이 아닙니다라고 나와야함.
//테스트 성공 여부를 위해 일부러 실패 상황을 만듬
