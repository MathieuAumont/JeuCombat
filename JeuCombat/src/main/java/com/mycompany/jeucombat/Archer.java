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
public class Archer extends Personnage{
    public Archer() {
        name = "Archer";
        ptDeVie = 30;
        type = "Archer";
        arme = "Arrow";
        dégat = 5;
    }
    @Override
    public void Attack(Joueur ennemi){
        Random rand = new Random();
        int choix = rand.nextInt(2);
        int headshot = 10;
        if(choix == 1)
        {
            ennemi.role.ptDeVie -= headshot;
        }else{
            ennemi.role.ptDeVie -= dégat;
        }
        System.out.println(name + " a afflige " + dégat + " a " + ennemi.role.name + "\n");
        
    }
}
