package com.example.demoss18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger log =
            LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/demo")
    public String demo() {
        log.debug("This is a DEBUG log message");
        log.info("This is an INFO log message");
        log.warn("This is a WARN log message");

        return "Actuator Log Level Demo";
    }
}
