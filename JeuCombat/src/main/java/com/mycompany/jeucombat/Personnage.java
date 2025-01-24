/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeucombat;

/**
 *
 * @author mathi
 */
public abstract class Personnage {
    int level = 1;
    int ptDeVie;
    String name ;
    String type;
    String arme;
    int dégat ;
     
   public abstract void Attack(Joueur ennemi); 
}
