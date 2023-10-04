/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author ADM
 */
public class Guerrier extends Personnage {
    private int pageAt,degAt,distA;
    private Point2D position;
    
    
    public Guerrier(String n,int pV,int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p, int nbF){
        super(n,pV,dA,pPar,paAtt,paPar,dMax,p);
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();
    }
    
    
   public Guerrier(Guerrier g){
   
        super((Personnage)g);
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();        
       
   }
   public Guerrier(){
     super();
     this.setNom("Guerrier");
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();
   }
  
     //COMBATTRE
    public void combattre(Creature c){
        
    //type de combat
    
    //Contact
        if(position.distance(c.getpos())==1){
            System.out.println("ATAQUE CONTACT");
            Random naleat = new Random();
            int rand1 = naleat.nextInt(100);
            if(rand1<=pageAt){
            //Attaque réussie
            System.out.println("ATAQUE RÉUSSIE");
              int rand2 = naleat.nextInt(100);
              if(rand2>c.getpagePar()){
              c.setptVie(c.getptVie()-degAt);
              }
              else{
              System.out.println("DÉFENCE");  
              c.setptVie(c.getptVie()-degAt+c.getptPar());
              }

            }
            else{
            //Ataque ratée
            System.out.println("ATAQUE RATÉE");
            }
      }
    
    
    //À distance
        else if(position.distance(c.getpos())>1 && position.distance(c.getpos())<distA){
            
            System.out.println("ATAQUE À DISTANCE");
            Random naleat = new Random();
            int rand1 = naleat.nextInt(100);
            if(rand1<=pageAt){
            //Attaque réussie
             c.setptVie(c.getptVie()-degAt);
             System.out.println("ATAQUE RÉUSSIE");
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
       
       
}

