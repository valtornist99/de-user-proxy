package com.docker.extended.user_proxy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserFilter userFilter;

    @PostMapping("/set/docker_extended_user_name")
    public ResponseEntity<Void> SetUserName(@RequestParam String userName) {
        log.info("New user name: " + userName);
        userFilter.setUserName(userName);
        return ResponseEntity.ok().build();
    }
}
