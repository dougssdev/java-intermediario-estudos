package org.example.roupas;

public class Blusa {

    private String tamanho;

    public Blusa(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Essa blusa tem o tamanho: " + tamanho;
    }
}
