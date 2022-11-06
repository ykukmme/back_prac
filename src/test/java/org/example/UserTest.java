package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화한다")
    @Test
    void passwordTest() {
        User user = new User();

        user.initPassword(()-> "abcdefgh");

        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화 되지 않는다")
    @Test
    void passwordTest2() {
        User user = new User();

        user.initPassword(()->"ab");

        assertThat(user.getPassword()).isNull();
    }


}