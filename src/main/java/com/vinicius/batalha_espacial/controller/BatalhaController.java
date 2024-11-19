package com.vinicius.batalha_espacial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.batalha_espacial.service.BatalhaService;

@RestController
@RequestMapping("/batalha")
public class BatalhaController {

    @Autowired
    private BatalhaService BatalhaService;


    @GetMapping("/inicio")
    public String inicio() {
        return "Bem-vindo ao jogo Batalha Espacial";
    }

    @GetMapping("/atacar")
    public String atacar() {
        return BatalhaService.atacar();
    }

    @GetMapping("/defender")
    public String defender() {
        return BatalhaService.defender();
    }

    @GetMapping("/status")
    public String status(){
        return "Vida atual da nave: " + BatalhaService.getVidaNaveJogador();
    }
}
