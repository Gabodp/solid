/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3isp.bien;

import _3isp.mal.*;

/**
 *
 * @author Palacios
 */
public class PokemonFuego extends Pokemon implements EntrenamientoPokemon,EntrenamientoFuego{


    @Override
    public void aprenderAtaqueFuego() {
        this.getMovimientos().add("Fuego");
    }

    @Override
    public void aprenderAtaqueCorte() {
        this.getMovimientos().add("Corte");
    }
    
}
