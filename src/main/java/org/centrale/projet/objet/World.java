/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.centrale.projet.objet;

import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

/**Classe pour créer le monde
 *
 * @author hugorufato et luanlopesf
 */
public class World {

    /**Déclaration des archers
     *
     */
    private Archer robin,guillaumeT;

    /**Déclaration du paysan
     *
     */
    private Paysan peon;

    /**Déclaration des lapins
     *
     */
    private Lapin bugs1,bugs2;

    /**Déclaration du guerrier
     *
     */
    private Guerrier grosBill;

    /**Déclaration du loup
     *
     */
    private Loup wolfie;

    /**Déclaration des potions
     *
     */
    private PotionSoin potion1,potion2,potion3,potion4;

    /**List avec des archers
     *
     */
    private ArrayList<Archer> archers;

    /**List avec des paysans
     *
     */
    private ArrayList<Paysan> paysans;

    /**List avec des lapins
     *
     */
    private ArrayList<Lapin> lapins;

    /**List avec des guerriers
     *
     */
    private ArrayList<Guerrier> guerriers;

    /**List avec des loups
     *
     */
    private ArrayList<Loup> loups;

    /**List avec des cretures
     *
     */
    private ArrayList<Creature> creatures;

    /**List avec des personnages
     *
     */
    private LinkedList<Personnage> personnages;

    /**Variables de test
     *
     */
    private int countvie,nombreProt;
    
    /**Grille du monde
     * 
     */
    private ElemJeu[][] grille;

    /**Constructor pour atribuer des objets
     *
     */
    public World() {
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
        nombreProt = 100;
        grille = new ElemJeu[50][50];

    }

    /**Méthode pour créer des éléments du jeu et faire des tests
     *
     */
    public void creerMondeAlea() {

        Random aleat = new Random();
        int nombre = aleat.nextInt(100);
        for (int i = 0; i < nombre; i++) {
            archers.add(new Archer());
        }
        nombre = aleat.nextInt(100);
        for (int i = 0; i < nombre; i++) {
            paysans.add(new Paysan());
        }
        nombre = aleat.nextInt(100);
        for (int i = 0; i < nombre; i++) {
            lapins.add(new Lapin());
        }
        nombre = aleat.nextInt(100);
        for (int i = 0; i < nombre; i++) {
            guerriers.add(new Guerrier());
        }
        nombre = aleat.nextInt(100);
        for (int i = 0; i < nombre; i++) {
            loups.add(new Loup());
        }

        ////////////////////////////////////////
        for (int i = 0; i < archers.size(); i++) {
            creatures.add(archers.get(i));
        }
        for (int i = 0; i < paysans.size(); i++) {
            creatures.add(paysans.get(i));
        }
        for (int i = 0; i < guerriers.size(); i++) {
            creatures.add(guerriers.get(i));
        }

        for (int i = 0; i < creatures.size(); i++) {
            countvie = creatures.get(i).getptVie() + countvie;
        }
        ///////////////////////////////////////////
        //TEST TEMPS

        System.out.println("Mesure de temps avec " + nombreProt + " personnages");
        for (int i = 0; i < nombreProt / 4; i++) {
            personnages.add(new Archer());
            personnages.add(new Paysan());
            personnages.add(new Guerrier());
            personnages.add(new Archer());
        }
        countvie = 0;
        long debut = System.nanoTime();
        for (int i = 0; i < personnages.size(); i++) {
            countvie = personnages.get(i).getptVie() + countvie;
        }
        long fin = System.nanoTime();
        System.out.println("temps boucle basée sur la taille: " + (fin - debut) + "ns");
        debut = System.nanoTime();
        for (Personnage p : personnages) {
            countvie = p.getptVie() + countvie;
        }
        fin = System.nanoTime();
        System.out.println("temps boucle basée sur les itérateurs: " + (fin - debut) + "ns");

    }
    ///////////////////////////////////////////////////////////////
    
    public void CreerMondeAlea(int taille){
    
    this.grille = new ElemJeu[taille][taille];
    
//Creation
    Random aleat = new Random();
        
        int nA = aleat.nextInt(taille*taille);
        int nP = aleat.nextInt(taille*taille);
        int nL = aleat.nextInt(taille*taille);
        int nG = aleat.nextInt(taille*taille);
        int nLo = aleat.nextInt(taille*taille);
        
        while((nA+nP+nL+nG+nLo)>(taille*taille)){
        nA = aleat.nextInt(taille*taille);
        nP = aleat.nextInt(taille*taille);
        nL = aleat.nextInt(taille*taille);
        nG = aleat.nextInt(taille*taille);
        nLo = aleat.nextInt(taille*taille);
        }
        
        
                
        for (int i = 0; i < nA; i++) {
            archers.add(new Archer());
        }
        
        for (int i = 0; i < nP; i++) {
            paysans.add(new Paysan());
        }
        
        for (int i = 0; i < nL; i++) {
            lapins.add(new Lapin());
        }
        
        for (int i = 0; i < nG; i++) {
            guerriers.add(new Guerrier());
        }
        
        for (int i = 0; i < nLo; i++) {
            loups.add(new Loup());
        }
    
    //Placement
        //Archers
         int k=0;
         while(k <nA){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(grille[x][y]==null){
            archers.get(k).getpos().setPosition(x,y);
            grille[x][y]=archers.get(k);
            k++;
            }
            
        }
         //Paysans
         k=0;
         while(k <nP){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(grille[x][y]==null){
            paysans.get(k).getpos().setPosition(x,y);
            grille[x][y]=paysans.get(k);
            k++;
            }
            
        }
         //Lapins
         k=0;
         while(k <nL){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(grille[x][y]==null){
            lapins.get(k).getpos().setPosition(x,y);
            grille[x][y]=lapins.get(k);
            k++;
            }
            
        }
         //Guerriers
         k=0;
         while(k <nG){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(grille[x][y]==null){
            guerriers.get(k).getpos().setPosition(x,y);
            grille[x][y]=guerriers.get(k);
            k++;
            }
            
        }
         //Loups
         k=0;
         while(k <nLo){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(grille[x][y]==null){
            loups.get(k).getpos().setPosition(x,y);
            grille[x][y]=loups.get(k);
            k++;
            }
            
        }
        System.out.println(nA+" "+nP+" "+nL+" "+nG+" "+nLo);
        System.out.println(taille*taille);
    
    
    }

    /**Tour de jeu
     *
     */
    public void TourDeJeu() {
        
     

    }

    /**Afficher le monde
     *
     */
    public void afficheWorld() {
     for (int i = 0; i < this.grille.length; i++) {
            for (int j = 0; j < this.grille[i].length; j++) {
                if (this.grille[i][j] == null) {
                    System.out.print(0+ " ");
                } else {
                    System.out.print(this.grille[i][j] + " ");
                }
            }
            System.out.println(); 
        }
    }
    
        
        
        
    }


