package org.example;

import org.example.roupas.Blusa;
import org.example.roupas.Calca;
import org.example.roupas.KitRoupas;
import org.example.roupas.Tenis;

public class Main {
    public static void main(String[] args) {
        KitRoupas<Object> roupas = new KitRoupas<>();

        roupas.adicionarRoupas(new Blusa("P"));
        roupas.adicionarRoupas(new Calca(38));
        roupas.adicionarRoupas(new Tenis(41));

        System.out.println("O kit de roupas tem o seguinte tamanho:");
        roupas.mostrarKitDeRoupas();

    }
}