package com.example.miniproyecto;

import java.io.Serializable;

public class ListadoOcios implements Serializable {
    private String categoria;

    public ListadoOcios(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
