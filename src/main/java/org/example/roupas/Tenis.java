package org.example.roupas;

public class Tenis {

    private int tamanho;


    public Tenis(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Esse tênis tem o tamanho: " + tamanho;
    }
}
