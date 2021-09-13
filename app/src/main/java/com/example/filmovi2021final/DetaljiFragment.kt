package com.example.filmovi2021final

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.filmovi2021final.databinding.FragmentDetaljiBinding


class DetaljiFragment : Fragment(R.layout.fragment_detalji) {



    private lateinit var binding: FragmentDetaljiBinding

    private val BASE_URL = "http://api.themoviedb.org"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*val binding = FragmentDetaljiBinding.bind(view)



        val film = args.film

        binding.detaljiNaslovFilma.text = film.title
        binding.detaljiGodinaIzdanja.text = film.release
        binding.detaljiRadnjaFilma.text = film.overview*/





    }




}