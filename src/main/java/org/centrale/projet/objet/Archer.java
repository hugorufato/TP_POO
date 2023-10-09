/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 * 
 * @author 
 * @param 
 */
public class Archer extends Personnage {
    private int nbFleches;
  
    public Archer(String n,int pV,int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p, int nbF){
        super(n,pV,dA,pPar,paAtt,paPar,dMax,p);
        this.nbFleches = nbF;
    }
    
    
   public Archer(Archer a){
   
        super((Personnage)a);
        this.nbFleches = a.nbFleches;
   }
   public Archer(){
        super();
        this.setNom("Archer");
        this.nbFleches = 10;
        
   }
   public int getnbFleches(){
   return nbFleches;
   }

       //COMBATTRE
    public void combattre(Creature c){
        
    //type de combat
    
    //Contact
        if(this.getpos().distance(c.getpos())==1){
             System.out.println("ATAQUE CONTACT");
            Random naleat = new Random();
            int rand1 = naleat.nextInt(100);
            if(rand1<=this.getpageAtt()){
            //Attaque réussie
            System.out.println("ATAQUE RÉUSSIE");
              int rand2 = naleat.nextInt(100);
              if(rand2>c.getpagePar()){
              c.setptVie(c.getptVie()-this.getdegAtt());
              }
              else{
              System.out.println("DÉFENCE");   
              c.setptVie(c.getptVie()-this.getdegAtt()+c.getptPar());
              }

            }
            else{
            //Ataque ratée
            System.out.println("ATAQUE RATÉE");
            }
      }
    
    
    //À distance
        else if(this.getpos().distance(c.getpos())>1 && this.getpos().distance(c.getpos())<this.getdistAttMax()){
        System.out.println("ATAQUE À DISTANCE");
            Random naleat = new Random();
            int rand1 = naleat.nextInt(100);
            if(nbFleches>=1){
            nbFleches = nbFleches-1;
            if(rand1<=this.getpageAtt()){
            //Attaque réussie
            System.out.println("ATAQUE RÉUSSIE");
             c.setptVie(c.getptVie()-this.getdistAttMax());
            }
            else{
            //Ataque ratée
            System.out.println("ATAQUE RATÉE");
            }
            }
            else{
            System.out.println("Impossible d'attaquer");
    }
  }
        else{
    System.out.println("Impossible d'attaquer");
    }
}
}
