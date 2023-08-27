package com.hoaxifySecond.ws;

import com.hoaxifySecond.ws.hoax.HoaxService;
import com.hoaxifySecond.ws.user.User;
import com.hoaxifySecond.ws.user.UserService;
import com.hoaxifySecond.ws.hoax.vm.HoaxSubmitVM;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class WsApplication {

    public static void main(String[] args) {

        SpringApplication.run(WsApplication.class, args);

    }

    @Bean
    @Profile("dev")
    CommandLineRunner createInitialUsers(UserService userService, HoaxService hoaxService) {
        return (args) -> {
            try {
                userService.getByUsername("user1");
            } catch (Exception e) {
                for (int i = 1; i < 20; i++) {
                    User user = new User();
                    user.setUsername("user" + i);
                    user.setDisplayName("displayName" + i);
                    user.setPassword("P4ssword$");
                    userService.save(user);
                    for (int j = 0; j <= 19; j++) {
                        HoaxSubmitVM hoax = new HoaxSubmitVM();
                        hoax.setContent("HLLBR STUDIO " + j + " from  User " + i);
                        hoaxService.save(hoax, user);
                    }
                }
            }
        };
    }
}
