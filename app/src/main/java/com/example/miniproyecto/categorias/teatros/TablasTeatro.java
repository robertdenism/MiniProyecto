package com.example.miniproyecto.categorias.teatros;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;


@Entity(tableName = "Tablas_Teatro")
public class TablasTeatro {
    @PrimaryKey
    @NotNull
    public String uid;

    @ColumnInfo(name = "TituloOcio")
    public String tituloOcio;

    @ColumnInfo(name = "CategoriaOcio")
    public String categoriaOcio;

    @ColumnInfo(name = "DescripcionOcio")
    public String descripciopnOcio;

    @ColumnInfo(name = "DireccionOcio")
    public String direccionaOcio;

    public TablasTeatro() {
        uid = UUID.randomUUID().toString();
    }
}
