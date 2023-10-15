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
    
    /**List avec des objets
     *
     */
    private ArrayList<Objet> objets;

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
        objets = new ArrayList();
        countvie = 0;
        nombreProt = 100;
        grille = new ElemJeu[50][50];
        

    }


    
    public void CreerMondeAlea(int taille){

    if(taille<=2){
    System.out.println("ERROR - TAILLE DU MONDE DOIT ETRE >= 2");
    }
    else{
            
    this.grille = new ElemJeu[taille][taille];
    
//Creation
    Random aleat = new Random();
        
        int nA = aleat.nextInt(taille);
        int nP = aleat.nextInt(taille);
        int nL = aleat.nextInt(taille);
        int nG = aleat.nextInt(taille);
        int nLo = aleat.nextInt(taille);
        int npotion = aleat.nextInt(2,taille);
        int nepee = aleat.nextInt(2,taille);
        
        while((nA+nP+nL+nG+nLo)>(taille*taille-5)){
        nA = aleat.nextInt(taille*taille);
        nP = aleat.nextInt(taille*taille);
        nL = aleat.nextInt(taille*taille);
        nG = aleat.nextInt(taille*taille);
        nLo = aleat.nextInt(taille*taille);
        }
        
        
                
        for (int i = 0; i < nA; i++) {
            this.archers.add(new Archer());
        }
        
        for (int i = 0; i < nP; i++) {
            this.paysans.add(new Paysan());
        }
        
        for (int i = 0; i < nL; i++) {
            this.lapins.add(new Lapin());
        }
        
        for (int i = 0; i < nG; i++) {
            this.guerriers.add(new Guerrier());
        }
        
        for (int i = 0; i < nLo; i++) {
            this.loups.add(new Loup());
        }
        
        for (int i = 0; i < npotion; i++) {
            this.objets.add(new PotionSoin());
        }
        
        for (int i = 0; i < nepee; i++) {
            this.objets.add(new Epee());
        }
        
        /////// Ajouter en creature
        for (int i = 0; i < this.archers.size(); i++) {
            this.creatures.add(this.archers.get(i));
        }
        for (int i = 0; i < this.paysans.size(); i++) {
            this.creatures.add(this.paysans.get(i));
        }
        for (int i = 0; i < this.guerriers.size(); i++) {
            this.creatures.add(this.guerriers.get(i));
        }
        for (int i = 0; i < this.lapins.size(); i++) {
            this.creatures.add(this.lapins.get(i));
        }
        for (int i = 0; i < this.loups.size(); i++) {
            this.creatures.add(this.loups.get(i));
        }
        
    
    //Placement
        //Archers
         int k=0;
         while(k <nA){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.archers.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.archers.get(k);
            k++;
            }
            
        }
         //Paysans
         k=0;
         while(k <nP){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.paysans.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.paysans.get(k);
            k++;
            }
            
        }
         //Lapins
         k=0;
         while(k <nL){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.lapins.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.lapins.get(k);
            k++;
            }
            
        }
         //Guerriers
         k=0;
         while(k <nG){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.guerriers.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.guerriers.get(k);
            k++;
            }
            
        }
         //Loups
         k=0;
         while(k <nLo){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.loups.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.loups.get(k);
            k++;
            }
            
        }
         
        // Objets
        k=0;
         while(k <(npotion+nepee)){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.objets.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.objets.get(k);
            k++;
            }
            
        }
        
//        System.out.println(nA+" "+nP+" "+nL+" "+nG+" "+nLo);
//        System.out.println(this.creatures.size());
    
    }
    }

    public void modGrille(int x, int y, ElemJeu element){
    this.grille[x][y] = element;
    }
    
    public ElemJeu verifierGrille(int x,int y){
    return this.grille[x][y];
    }
    
    
    
    
    
    
    
    
    
    /**Tour de jeu
     *
     */
 public void TourDeJeu() {
    
     
     
     
     
     
    // Deplacement
    for (int i = 0; i < this.creatures.size(); i++) {
        int k = 0;
        Point2D p = new Point2D();
        p.setPosition(this.creatures.get(i).getpos().getX(), this.creatures.get(i).getpos().getY());
        this.creatures.get(i).deplace();

        while (k < 8) {
            // Verifica se a criatura está fora dos limites da grade.
                this.creatures.get(i).deplace();
                while (this.creatures.get(i).getpos().getX() < 0 || this.creatures.get(i).getpos().getX() > this.grille.length-1  ||
                        this.creatures.get(i).getpos().getY() < 0 || this.creatures.get(i).getpos().getY() > this.grille.length-1 ) {

                    this.creatures.get(i).getpos().setPosition(p.getX(), p.getY());
                    this.creatures.get(i).deplace();
                }     

                        
                        
                if (this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] != null) {
                    if(this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] instanceof Objet o
                            && this.creatures.get(i) instanceof Personnage f) {
                            f.useitem(o);
                            this.grille[p.getX()][p.getY()] = null;
                            this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] = this.creatures.get(i);
                            k=8;
                    }
                    else{
                    this.creatures.get(i).getpos().setPosition(p.getX(), p.getY());}
                    
                } else {
                    this.grille[p.getX()][p.getY()] = null;
                    this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] = this.creatures.get(i);
//                    System.out.println("coloquei o: ["+p.getX()+";"+p.getY()+"] no: ["+this.creatures.get(i).getpos().getX()+";"+this.creatures.get(i).getpos().getY()+"] na iteração "+i);
                    k=8;
                    }

            k++;
        }
    }  
    
    //COMBATTRE
    
    
    
}
        
    /**Placer un personnage dans le monde
     *
     */
 
    public void Placer(Personnage p){
        Random aleat = new Random();
        int k=0;
        while(k <1){
            int x = aleat.nextInt(this.grille.length);
            int y = aleat.nextInt(this.grille.length);
            if(this.grille[x][y]==null){
            p.getpos().setPosition(x,y);
            this.grille[x][y]=p;
            k++;
            }
    }
    }
        

    /**Afficher le monde
     *
     */
    public void afficheWorld() {
    int numRows = this.grille[0].length;
    int numCols = this.grille.length;

    // Encontre o comprimento máximo do nome na matriz para definir o tamanho da célula
    int maxNomeLength = 1; // Tamanho mínimo 1

    for (int row = 0; row < numRows; row++) {
        for (int col = 0; col < numCols; col++) {
            if (this.grille[row][col] != null) {
                int nomeLength = this.grille[row][col].toString().length();
                maxNomeLength = Math.max(maxNomeLength, nomeLength);
            }
        }
    }
    int cellSize = maxNomeLength + 2; // Tamanho da célula

    // Imprime a parte superior da grade
    for (int row = numRows - 1; row >= 0; row--) {
        System.out.printf("%-" + maxNomeLength + "d  ", row); // Número da linha (eixo Y) com espaços para alinhar
        for (int col = 0; col < numCols; col++) {
            if (this.grille[row][col] == null) {
                System.out.printf("%-" + cellSize + "s", "0"); // Imprime "0" nas posições nulas
            } else {
                String nome = this.grille[row][col].toString();
                System.out.printf("%-" + cellSize + "s", nome); // Nome no quadrado com espaços para alinhar
            }
        }
        System.out.println();
    }
    System.out.println();
    System.out.printf("%-" + cellSize + "s", "");
    // Imprime o marcador "Y" no canto superior esquerdo, após o último número da matriz
    for (int col = 0; col < numCols; col++) {
        System.out.printf("%-" + cellSize + "s", col);
    }
    
}








}
    
        
    


