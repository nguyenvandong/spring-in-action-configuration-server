package com.spring.in.action.rest;

import com.spring.in.action.model.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author DONGNV - 10/13/2019
 */

@RestController
public class HealthcheckRest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    private MongoTemplate mongoTemplate;

    public HealthcheckRest(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping("/healthcheck")
    public ResponseEntity<?> healthcheck() {
        logger.info("Healthcheck success: {}", new Date());
        return new ResponseEntity<>("Healthcheck success", HttpStatus.OK);
    }

    @GetMapping("/get-all-properties")
    public ResponseEntity<List<Properties>> getAllProperties() {
        logger.info("get_all_properties: {}", new Date());
        List<Properties> properties = mongoTemplate.findAll(Properties.class);
        return new ResponseEntity<>(properties, HttpStatus.OK);
    }

}
