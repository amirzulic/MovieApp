package com.example.filmovi2021final.film

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import java.util.concurrent.Flow

@Dao
interface FilmoviDatabaseDao {


    //evo da lakse skontas, @Insert govori da ubacujemo u tabelu
    //saljemo parametar koji je tipa kao entitet koji smo napravili
    @Insert
    fun insertFilm(film: FilmPodaci)

    @Update
    fun updateFilm(film: FilmPodaci)

    //saljemo kljuc, a vrati mi FilmPodaci, ako nema stavi ? , mozda je null
    /*@Query("SELECT * FROM lista_filmova¸WHERE id= :key")
    fun get(key: Long) : FilmPodaci?*/


    @Query("DELETE FROM lista_filmova")
    fun delete()

    @Query("SELECT * FROM lista_filmova ORDER BY id_filma DESC")
    fun getAll() : List<FilmPodaci>?



    /*@Query("SELECT * FROM lista_filmova WHERE ime_filma LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): FilmPodaci*/



}