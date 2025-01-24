/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.jeucombat;
import java.util.Random;
/**
 *
 * @author mathi
 */
public class Joueur {
     
     Personnage role ;
     
    public Joueur(){
        /*Random rand = new Random();
        int choix = rand.nextInt(3);
        switch(choix){
            case 0 -> {
                role = new Guerrier();    
            }
            case 1 -> {
                role = new Mage();
              }
                
            case 2 -> { 
                role = new Archer();
            }
            default -> System.out.println("erreur dans le choix de personnage.");
                
        }*/
     Random rand = new Random();
     Personnage[] roledisponible = {new Guerrier(), new Mage(), new Archer()};
     role = roledisponible[rand.nextInt(roledisponible.length)]; 
    }
}
