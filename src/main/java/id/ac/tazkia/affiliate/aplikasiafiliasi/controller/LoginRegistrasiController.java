package id.ac.tazkia.affiliate.aplikasiafiliasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginRegistrasiController {

    @GetMapping("/login/login")
    public void loginUser() {

    }

    @GetMapping("/register/register")
    public void registrasiUser(){

    }
}

