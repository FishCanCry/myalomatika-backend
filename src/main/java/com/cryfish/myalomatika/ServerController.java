package com.cryfish.myalomatika;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ServerController {

    private static final Logger log = Logger.getLogger(ServerController.class);

    @RequestMapping("/")
    String home() {
        return "Server is available";
    }

    @RequestMapping("/getNumbers")
    String[] getNumbers(@RequestParam("level") int level,
                         @RequestParam("digit") int digit,
                         @RequestParam("count") int count,
                         @RequestParam("combo") boolean combo) {

        log.info("Level: " + level);
        log.info("Digit: " + digit);
        log.info("Count: " + count);
        log.info("Combo: " + combo);

        return NumbersGenerator.generateJson(level, digit, count, combo);
    }
}
