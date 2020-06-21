package com.cryfish.myalomatika;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServerController {

    @RequestMapping("/")
    String home() {
        return "Server is available";
    }

    @RequestMapping("/getNumbers")
    Integer[] getNumbers() {
        return new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    }
}
