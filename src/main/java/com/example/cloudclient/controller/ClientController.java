package com.example.cloudclient.controller;

import com.example.cloudclient.config.ClientConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api")
public class ClientController {

    private final ClientConfig clientConfig;

    @GetMapping("/config")
    @CacheEvict
    public ResponseEntity<String> config() {
        log.info("clientconfig : {}",clientConfig);
        return ResponseEntity.ok(clientConfig.toString());
    }

}
