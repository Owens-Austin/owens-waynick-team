/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zeldapokemon;

import byui.cit260.zeldaPokemon.model.Player;

/**
 *
 * @author user
 */
public class ZeldaPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Player playerOne = new Player(); 
       
       playerOne.setName("Fred Flintstone"); //nice choice of name
       playerOne.setStats(7.00);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
    }
    
}
