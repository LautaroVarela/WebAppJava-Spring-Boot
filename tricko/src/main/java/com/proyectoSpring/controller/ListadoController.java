package com.proyectoSpring.controller;

import java.util.List;
import com.proyectoSpring.domain.Card;
import com.proyectoSpring.service.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

    
    private final CardService cardService;
    
    
    public ListadoController(CardService cardService){
    
        this.cardService=cardService;
    }
    
    @RequestMapping("/")
    public String ListadoCards(Model model) {
        List<Card> destacados = cardService.buscarDestacados();
        model.addAttribute("cards", destacados);
        
        return "listado";
    }
    
}
