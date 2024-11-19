package com.vinicius.batalha_espacial.service;

import org.springframework.stereotype.Service;

import com.vinicius.batalha_espacial.model.Nave;

@Service
public class BatalhaService {
    private final Nave naveJogador = new Nave();

    public String atacar(){
        int dano = (int) (Math.random() * 20 +1); //Gera dano aleatório entre 1 e 20
        naveJogador.receberDano(dano);
        return "Você atacou a nave inimiga! Dano causado: " + dano + ". Vida restante: " + naveJogador.getVida();
    }

    public String defender(){
        int recuperacao = (int) (Math.random() * 15 + 1); //Gera recuperação aleatória entre 1 e 15
        naveJogador.recuperarVida(recuperacao);
        return "Você se defendeu! Vida recuperada: " + recuperacao + ". Vida atual é: " + naveJogador.getVida();
    }

    public int getVidaNaveJogador() {
        return naveJogador.getVida();
    }
}
