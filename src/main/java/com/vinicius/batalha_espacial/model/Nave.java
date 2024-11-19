package com.vinicius.batalha_espacial.model;

public class Nave {
    private int vida;

    public Nave(){
        this.vida = 100;
    }
    
    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void receberDano(int dano){
        this.vida -= dano;

        if(this.vida < 0){
            this.vida = 0;
        }
    }

    public void recuperarVida(int valor){
        this.vida += valor;
        
        if(this.vida > 100){
            this.vida = 100;
        }
    }
}
