package com.spring.in.action.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author DONGNV - 10/13/2019
 */

@RestController
public class HealthcheckRest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @GetMapping("/healthcheck")
    public ResponseEntity<?> healthcheck() {
        logger.info("Healthcheck success: {}", new Date());
        return new ResponseEntity<>("Healthcheck success", HttpStatus.OK);
    }

}
