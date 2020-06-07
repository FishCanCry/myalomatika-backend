package com.cryfish.myalomatika;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServerController {

    @RequestMapping("/")
    String home() {
        return "Test";
    }
}
