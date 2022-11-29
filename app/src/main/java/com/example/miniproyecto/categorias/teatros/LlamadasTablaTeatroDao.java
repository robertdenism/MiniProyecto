package com.example.miniproyecto.categorias.teatros;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LlamadasTablaTeatroDao {
    @Query("SELECT * FROM Tablas_Teatro")
    List<TablasTeatro> getAll();

    @Query("SELECT * FROM Tablas_Teatro WHERE uid IN (:userIds)")
    List<TablasTeatro> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM Tablas_Teatro WHERE TituloOcio LIKE :first AND " +
            "DireccionOcio LIKE :last LIMIT 1")
    TablasTeatro findByName(String first, String last);

    @Insert
    void insertAll(TablasTeatro... teatros);

    @Delete
    void delete(TablasTeatro teatro);

}
