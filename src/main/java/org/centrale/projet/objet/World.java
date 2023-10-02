/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.projet.objet;
import java.util.Random; 
import java.util.ArrayList;

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
    public PotionSoin potion1,potion2,potion3,potion4;
    public ArrayList<Archer> archers;
    public ArrayList<Paysan> paysans;
    public ArrayList<Lapin> lapins;
    public ArrayList<Guerrier> guerriers;
    public ArrayList<Loup> loups;
    
    
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
        potion1 = new PotionSoin();
        potion2 = new PotionSoin();
        potion3 = new PotionSoin();
        potion4 = new PotionSoin();
        
        archers = new ArrayList();
        paysans = new ArrayList();
        lapins = new ArrayList();
        
        
        
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

