/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.projet.objet;
import java.util.Random; 
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author luanl
 */
public class World {
    
    private Archer robin,guillaumeT;
    private Paysan peon;
    private Lapin bugs1,bugs2;
    private Guerrier grosBill;
    private Loup wolfie;
    private PotionSoin potion1,potion2,potion3,potion4;
    private ArrayList<Archer> archers;
    private ArrayList<Paysan> paysans;
    private ArrayList<Lapin> lapins;
    private ArrayList<Guerrier> guerriers;
    private ArrayList<Loup> loups;
    private ArrayList<Creature> creatures;
    private LinkedList<Personnage> personnages;
    private int countvie,nombreProt;
    
  
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
        guerriers = new ArrayList();
        loups = new ArrayList();
        creatures = new ArrayList();
        personnages = new LinkedList();
        countvie = 0;
        nombreProt = 1000000;
        
        
        
    }
    
    public void creerMondeAlea(){
        
        Random aleat = new Random();
        int nombre = aleat.nextInt(100);
           for(int i=0;i<nombre;i++){
             archers.add(new Archer());
           }
        nombre = aleat.nextInt(100);
           for(int i=0;i<nombre;i++){
             paysans.add(new Paysan());
           }
        nombre = aleat.nextInt(100);
           for(int i=0;i<nombre;i++){
             lapins.add(new Lapin());
           }
        nombre = aleat.nextInt(100);
           for(int i=0;i<nombre;i++){
             guerriers.add(new Guerrier());
           }
        nombre = aleat.nextInt(100);
           for(int i=0;i<nombre;i++){
             loups.add(new Loup());
           }
           
           ////////////////////////////////////////
//         for(int i=0;i<archers.size();i++){
//         creatures.add(archers.get(i));
//         }
//         for(int i=0;i<paysans.size();i++){
//         creatures.add(paysans.get(i));
//         }
//         for(int i=0;i<guerriers.size();i++){
//         creatures.add(guerriers.get(i));
//         }
//         
//         for(int i=0;i<creatures.size();i++){
//         countvie = creatures.get(i).getptVie()+countvie;
//         }
          ///////////////////////////////////////////
         //TEST TEMPS
         
//         System.out.println("Mesure de temps avec "+nombreProt+" personnages");
//         for(int i=0;i<nombreProt/4;i++){
//             personnages.add(new Archer());
//             personnages.add(new Paysan());
//             personnages.add(new Guerrier());
//             personnages.add(new Archer());
//         }
//         countvie=0;
//         long debut = System.nanoTime();
//         for(int i=0;i<personnages.size();i++){
//         countvie = personnages.get(i).getptVie()+countvie;
//         }
//         long fin = System.nanoTime();
//         System.out.println("temps boucle basée sur la taille: "+(fin-debut)+"ns");
//         debut = System.nanoTime();
//         for(Personnage p:personnages){
//         countvie = p.getptVie()+countvie;
//         }
//         fin = System.nanoTime();
//         System.out.println("temps boucle basée sur les itérateurs: "+(fin-debut)+"ns"); 
         
    }
        public void TourDeJeu(){
            
        
        }
        
        public void afficheWorld(){
        
        }

}

