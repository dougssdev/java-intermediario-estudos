package org.example.roupas;

import java.util.ArrayList;
import java.util.List;

public class KitRoupas <T>{

    List<T> kitDeRoupas = new ArrayList<>();

    public KitRoupas() {
        this.kitDeRoupas = kitDeRoupas;
    }

    public void adicionarRoupas(T roupa){
        kitDeRoupas.add(roupa);
    }

    public void mostrarKitDeRoupas(){
        for(T roupa : kitDeRoupas){
            System.out.println(roupa);
        }
    }
}
