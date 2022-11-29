package com.example.miniproyecto.categorias.teatros;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {TablasTeatro.class}, version = 1)
public abstract class BaseDatosTeatros extends RoomDatabase {
    public abstract LlamadasTablaTeatroDao teatrosDao();
}
