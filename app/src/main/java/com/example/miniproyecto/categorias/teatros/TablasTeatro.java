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

    @ColumnInfo(name = "TituloTeatro")
    public String tituloTeatro;

    @ColumnInfo(name = "CategoriaTeatro")
    public String categoriaTeatro;

    @ColumnInfo(name = "DescripcionTeatro")
    public String descripciopnTeatro;

    @ColumnInfo(name = "DireccionTeatro")
    public String direccionaTeatro;

    public TablasTeatro() {

        uid = UUID.randomUUID().toString();
    }
}
