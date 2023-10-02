/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.projet.objet;
import java.util.Random; 

/**
 *
 * @author luanl
 */
public class World {
    
    public Archer robin,guillaumeT;
    public Paysan peon;
    public Lapin bugs1,bugs2;
    public Guerrier grosBill;
    public Loup wolfie;
    
    public World(){
        robin = new Archer();
        robin.setNom("Robin");
        guillaumeT = new Archer(robin);
        guillaumeT.setNom("GuillaumeT");
        peon = new Paysan();
        peon.setNom("Peon");
        bugs1 = new Lapin();
        bugs2 = new Lapin();
        grosBill = new Guerrier();
        wolfie = new Loup();
        
        
        
        
        
        
        
    }
    
    public void creerMondeAlea(){
        
        Random generateurAleatoire = new Random();
        int rX = generateurAleatoire.nextInt(100);
        int rY = generateurAleatoire.nextInt(100);

        robin.getpos().setPosition(rX,rY);
        
        while(rX == robin.getpos().getX() && rY == robin.getpos().getY()){
        rX = generateurAleatoire.nextInt(100);
        rY = generateurAleatoire.nextInt(100);
        }
        peon.getpos().setPosition(rX,rY);
        
         while(rX == robin.getpos().getX() && rY == robin.getpos().getY() || rX == peon.getpos().getX() && rY == peon.getpos().getY() ){
        rX = generateurAleatoire.nextInt(100);
        rY = generateurAleatoire.nextInt(100);
    }
        bugs1.getpos().setPosition(rX,rY);
        
        
   }
    
        public void creerMondeAlea(int taille){
        
        Random generateurAleatoire = new Random();
        int rX = generateurAleatoire.nextInt(taille);
        int rY = generateurAleatoire.nextInt(taille);

        robin.getpos().setPosition(rX,rY);
        
        while(rX == robin.getpos().getX() && rY == robin.getpos().getY()){
        rX = generateurAleatoire.nextInt(taille);
        rY = generateurAleatoire.nextInt(taille);
        }
        peon.getpos().setPosition(rX,rY);
        
         while(rX == robin.getpos().getX() && rY == robin.getpos().getY() || rX == peon.getpos().getX() && rY == peon.getpos().getY() ){
        rX = generateurAleatoire.nextInt(taille);
        rY = generateurAleatoire.nextInt(taille);
    }
        bugs1.getpos().setPosition(rX,rY);
   }
        
        
        public void TourDeJeu(){
        
        }
        
        public void afficheWorld(){
        
        }

}
