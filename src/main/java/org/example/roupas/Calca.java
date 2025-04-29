package org.example.roupas;

public class Calca {

    private int cintura;

    public Calca(int cintura) {
        this.cintura = cintura;
    }

    public int getCintura() {
        return cintura;
    }

    public void setCintura(int cintura) {
        this.cintura = cintura;
    }

    @Override
    public String toString() {
       return "Essa calça tem a cintura: " + cintura;
    }
}
