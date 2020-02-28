package com.proyectoSpring.service;


import com.proyectoSpring.domain.Card;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class CardService {

    public List<Card> buscarDestacados() {
        List<Card> destacados = new ArrayList<>();

        Card obra = new Card();
        obra.setNombre("Clowns");
        obra.setDescripcion("Collage manual con rostros, pintura y retocado grafico con Photoshop");
        obra.setImagenUrl("images/01.jpg");
        destacados.add(obra);
        
        obra = new Card();
        obra.setNombre("Hands 02");
        obra.setDescripcion("Collage compuesto y retocado grafico con Photoshop");
        obra.setImagenUrl("images/03.jpg");
        destacados.add(obra);
        
        obra = new Card();
        obra.setNombre("Monstruos");
        obra.setDescripcion("Collage y retocado grafico con Photoshop");
        obra.setImagenUrl("images/07.jpg");
        destacados.add(obra);
        
        obra = new Card();
        obra.setNombre("Miedo");
        obra.setDescripcion("Collage y retocado grafico con Photoshop");
        obra.setImagenUrl("images/08.jpg");
        destacados.add(obra);
        
        return destacados;
        
        
    }

}
