/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeucombat;

/**
 *
 * @author mathi
 */
public class Guerrier extends Personnage{
    
    public Guerrier() {
        name = "Guerrier";
        ptDeVie = 50;
        type = "Guerrier";
        arme = "Tomahawk";
        dégat = 10;
    }
    
    
    @Override
    public void Attack(Joueur ennemi){
        ennemi.role.ptDeVie -= dégat;
        System.out.println(name + " a afflige " + dégat + " a " + ennemi.role.name + "\n");
        
    }
}
