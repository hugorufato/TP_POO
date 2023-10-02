/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;
/**
 *
 * @author ADM
 */
public class Personnage extends Creature {
    
   private String nom;
   private int distAttMax;
   
public Personnage(String n,int pV,int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
   super(pV,dA,pPar,paAtt,paPar,p);
   this.nom = n;
   this.distAttMax = dMax;
   }
public Personnage(Personnage perso){
   super((Creature) perso);
   this.nom = perso.nom;
   this.distAttMax = perso.distAttMax;

}
public Personnage(){
   super();
   this.nom = "Personnage_vide";
   this.distAttMax = 5;
}


//Set functions
public void setNom(String n){
nom = n;
}
public void setdistAttMax(int datt){
distAttMax = datt;
}



//Get functions
public String getNom(){
return nom;
}
public int getdistAttMax(){
return distAttMax;
}

    


//AFFICHE
public void affiche(){
System.out.println("Personnage: "+nom);
afficheG();
System.out.println("DistAttMax = "+distAttMax);
}


}
