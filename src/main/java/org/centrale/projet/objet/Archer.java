/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

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
     this.nbFleches = 0;
   }
   
}
