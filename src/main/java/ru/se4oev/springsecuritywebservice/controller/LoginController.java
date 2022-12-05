package ru.se4oev.springsecuritywebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by karpenko on 05.12.2022.
 * Description:
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login() {
        return "html/login";
    }

}
