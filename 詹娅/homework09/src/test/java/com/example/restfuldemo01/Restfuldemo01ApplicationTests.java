package com.example.restfuldemo01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class Restfuldemo01ApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new
                BCryptPasswordEncoder();
        for (int i = 0; i < 1; i++) {
            System.out.println(bCryptPasswordEncoder.encode("24876021"));
        }
    }


}
