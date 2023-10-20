/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.centrale.projet.objet;


import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

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
    
    /**List avec des Nuages
     *
     */
    private ArrayList<NuageToxique> Nuages;

    /**List avec des cretures
     *
     */
    private ArrayList<ElemJeu> creatures;
    
    /**Déclaration des nourritures
     *
     */
    private Nourriture miel1,biere1,miel2,miel3,biere2,biere3;
    
    /**List des nourritures
     *
     */
    private ArrayList<Nourriture> nourritures;
    
    
    /**List avec des objets
     *
     */
    private ArrayList<Objet> objets;

    
    /**Grille du monde
     * 
     */
    private ElemJeu[][] grille;
    
     /**Collection  des Objets utilisables
     * 
     */
    private Collection<Utilisable> effets;
    
     /**Inventaire
     * 
     */
    private ArrayList<Utilisable> inventaire;
    
    /**Personnage principal pour sauvegarder
     * 
     */
    private Personnage joueur;
    
    /**Constructeur sans paramètres d'un monde pour incializer les variables
     *
     */
    public World() {
        
//        robin = new Archer();
//        robin.setNom("Robin");
//        guillaumeT = new Archer(robin);
//        guillaumeT.setNom("GuillaumeT");
//        peon = new Paysan();
//        peon.setNom("Peon");
//        bugs1 = new Lapin();
//        bugs2 = new Lapin();
//        grosBill = new Guerrier();
//        wolfie = new Loup();
//        potion1 = new PotionSoin();
//        potion2 = new PotionSoin();
//        potion3 = new PotionSoin();
//        potion4 = new PotionSoin();

        nourritures = new ArrayList();
        miel1 = new Nourriture("miel",3,0,0,0,4,new Point2D(),false);
        biere1 = new Nourriture("biere",0,0,-24,0,3,new Point2D(),false);
        miel2 = new Nourriture("miel",5,0,0,0,4,new Point2D(),false);
        biere2 = new Nourriture("biere",0,0,-20,0,3,new Point2D(),false);
        miel3 = new Nourriture("miel",4,0,0,0,4,new Point2D(),false);
        biere3 = new Nourriture("biere",0,0,-18,0,3,new Point2D(),false);

        archers = new ArrayList();
        paysans = new ArrayList();
        lapins = new ArrayList();
        guerriers = new ArrayList();
        loups = new ArrayList();
        creatures = new ArrayList();
        Nuages = new ArrayList();
        objets = new ArrayList();
        grille = new ElemJeu[50][50];
        inventaire = new ArrayList();
        effets = new ArrayList<>();

    }

    /**Méthode pour creer un monde aléatoire avec une taille donée et placer les elements de jeu dans la grille du monde
     *
     * @param taille La taille du monde choisi
     */
    public void CreerMondeAlea(int taille){
    
//Creation
    Random aleat = new Random();
        this.grille = new ElemJeu[taille][taille];
        int nA = aleat.nextInt(taille);
        int nP = aleat.nextInt(taille);
        int nL = aleat.nextInt(taille);
        int nG = aleat.nextInt(taille);
        int nLo = aleat.nextInt(taille);
        int npotion = aleat.nextInt(taille);
        int nepee = aleat.nextInt(taille);
        int nNuage = aleat.nextInt(taille);
        
        
        while((nA+nP+nL+nG+nLo+npotion+nepee+nNuage)>(taille*taille-5)){
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
        
        for (int i = 0; i < nNuage; i++) {
            this.Nuages.add(new NuageToxique());
        }
        
        for (int i = 0; i < npotion; i++) {
            this.objets.add(new PotionSoin());
        }
        
        for (int i = 0; i < nepee; i++) {
            this.objets.add(new Epee());
        }
        
        this.nourritures.add(this.miel1);
        this.nourritures.add(this.biere1);
        this.nourritures.add(this.miel2);
        this.nourritures.add(this.biere2);
        this.nourritures.add(this.miel3);
        this.nourritures.add(this.biere3);
        
        
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
        for (int i = 0; i < this.Nuages.size(); i++) {
            this.creatures.add(this.Nuages.get(i));
        }
        
        //Placement
        //Archers
         int k=0;
         while(k <this.archers.size()){
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
         while(k <this.paysans.size()){
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
         while(k <this.lapins.size()){
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
         while(k <this.guerriers.size()){
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
         while(k <this.loups.size()){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.loups.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.loups.get(k);
            k++;
            }
            
        }
        
        //Nuage Toxique
        k=0;
        while(k <this.Nuages.size()){
           int x = aleat.nextInt(taille);
           int y = aleat.nextInt(taille);
           if(this.grille[x][y]==null){
           this.Nuages.get(k).getpos().setPosition(x,y);
           this.grille[x][y]=this.Nuages.get(k);
           k++;
           }

        }
         
        // Objets
        k=0;
         while(k <(this.objets.size())){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.objets.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.objets.get(k);
            k++;
            }
            
        }
         
         // Nourritures
        k=0;
         while(k <(this.nourritures.size())){
            int x = aleat.nextInt(taille);
            int y = aleat.nextInt(taille);
            if(this.grille[x][y]==null){
            this.nourritures.get(k).getpos().setPosition(x,y);
            this.grille[x][y]=this.nourritures.get(k);
            k++;
            }
            
        }
        
    }
    
    
    
    /**Méthode pour realiser un tour de jeu
     * Il commence par enlever  1 de la durée des effets des nourritures qui étaient utilisées
     * Aprés, les creatures sont deplacer aléatoirement dans le monde, en respectant les bords du monde et les places dejà occupés
     * Les nuages se déplacent également et peuvent attaquer dans le cas oú elles touchent les creatures
     * Si une creature arrive dans un objet ou une nuage, elle le utilise intantanément. 
     */
 public void TourDeJeu() {
    
     ///// Nourritures
     for(int i =0; i < this.nourritures.size();i++ ){
         if(this.nourritures.get(i)!=null){
         if(this.nourritures.get(i).getconsomee()){
             this.nourritures.get(i).setduree(this.nourritures.get(i).getduree()-1);
           if(this.nourritures.get(i).getduree()==0){
               this.nourritures.get(i).enleve(this.nourritures.get(i).getCreature());
               System.out.println(this.nourritures.get(i).getCreature()+": Fin d'effet de "+this.nourritures.get(i).getNom());
               this.nourritures.set(i,null);
           }
         }
         
        }
         
     }
     
    // Deplacement des creatures
    for (int i = 0; i < this.creatures.size(); i++) {
        if(this.creatures.get(i)!=null){
        if(this.creatures.get(i) instanceof Creature && this.creatures.get(i).getptVie()<=0){
        System.out.println(this.creatures.get(i).getClass().getSimpleName()+" is dead");
        this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] = null;
        this.creatures.set(i,null);
        }
        else{
        //////////////// DEPLACEMENT ///////////////////////////////////////////////////////////////////////////////////////////
        int k = 0;
        Point2D p = new Point2D();
        p.setPosition(this.creatures.get(i).getpos().getX(), this.creatures.get(i).getpos().getY());

        while (k < 8) {
            // Verifier si est dans la grille
                ((Deplacable) this.creatures.get(i)).deplace();
                while (this.creatures.get(i).getpos().getX() < 0 || this.creatures.get(i).getpos().getX() > this.grille.length-1  ||
                        this.creatures.get(i).getpos().getY() < 0 || this.creatures.get(i).getpos().getY() > this.grille.length-1 ) {

                    this.creatures.get(i).getpos().setPosition(p.getX(), p.getY());
                    ((Deplacable) this.creatures.get(i)).deplace();
                }     

                        
                if (this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] != null) {
                    
                        if(this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] instanceof Objet o
                                && this.creatures.get(i) instanceof Personnage f) {
                                if(!(o instanceof NuageToxique)){
                                ((Utilisable) o).useitem(f);
                                this.grille[p.getX()][p.getY()] = null;
                                this.grille[o.getpos().getX()][o.getpos().getY()] = this.creatures.get(i);
                                }
                                else{
                                      int pt = f.getptVie(); 
                                     ((NuageToxique) o).combattre(f);
                                     this.grille[p.getX()][p.getY()] = null;
                                     this.grille[o.getpos().getX()][o.getpos().getY()] = this.creatures.get(i);
                                     this.creatures.set(this.creatures.indexOf(o),null);
                                     System.out.println("Nuage: "+f+" -"+(pt-f.getptVie())+" ptVie");
                                     
                                }
                                k=8;
                        }
                        else if(this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] instanceof Creature f
                                && this.creatures.get(i) instanceof NuageToxique nuage){
                               int pt = f.getptVie();
                               nuage.combattre(f);
                               this.grille[p.getX()][p.getY()] = null;
                               this.creatures.set(this.creatures.indexOf(nuage),null);
                               System.out.println("Nuage: "+f+" -"+(pt-f.getptVie())+" ptVie");
                                k=8;
                        }
                        else{
                            this.creatures.get(i).getpos().setPosition(p.getX(), p.getY());
                        }
                    
                }
                else {
                    this.grille[p.getX()][p.getY()] = null;
                    this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] = this.creatures.get(i);
                    k=8;
                }

            k++;
        }
    
    }
          
        }
        }
}
        
    /**Placer un protagoniste dans le monde
     *
     * @param p personnage à placer
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
        

    /**Méthode pour afficher le monde dans uns format visible.
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
    
    /**Méthode pour faire tourner une partie
     * Le personnage principal peut choisir entre commencer a partir d'un jeu dejà sauvegardé ou non
     * Aprés, il a 6 choix: déplacer, attaquer, afficher le personnage, regarder le inventaire, sauvegarder et fermer le jeu
     *
     * @param taille taille du monde a être crée
     */
    public void partie (int taille) {
    
             // Scan
            Scanner scanner = new Scanner(System.in);
            System.out.print("Commencer le jeu? [y/n]: ");
            String commencer = scanner.nextLine();
            Personnage personnage = null;
            if (commencer.equals("y")) {
                if(!chargerSauvegardeAuLancement()){
                // Creer monde
                this.CreerMondeAlea(taille);
                //Creer Joueur
                Joueur joueur = new Joueur();
                System.out.print("Choisissez une classe jouable: Guerrier, Archer : ");
                String classe = scanner.nextLine();
                System.out.print("Entrez le nom de votre Personnage : ");
                String nomPerso = scanner.nextLine();
                try{
                personnage = joueur.choisirPersonnage(classe, nomPerso);
                this.Placer(personnage);
                }
                catch(NullPointerException e){
                System.out.println("Archer crée");
                classe = "Archer";
                personnage = joueur.choisirPersonnage(classe, nomPerso);
                this.Placer(personnage);
                }
                
                if (personnage != null) {
                    System.out.println("Personnage créé : ");
                    System.out.println("Classe : " + personnage.getClass().getSimpleName());
                    personnage.affiche();
                }
                }
                else{
                personnage=this.joueur;
                }
                
                
                String option = null;
                
 ///////////////////////////////////////// TOURS DE JEU ////////////////////////////////////////////////////
                while(!"6".equals(option) && personnage.getptVie()>0 ){
                    this.afficheWorld();
                    System.out.println(" ");
                    int ret = 0;
                    
                    while(ret==0){
////////////////////////////////////////////EFFETS//////////////////////////////////////////////////////////////
                        
                        
                        if (!this.effets.isEmpty()) {
                            Iterator<Utilisable> iterator = effets.iterator();
                            while (iterator.hasNext()) {
                                Utilisable effet = iterator.next();
                                if (((Objet) effet).getduree() == 0) {
                                    iterator.remove();
                                } else if (effet instanceof Nourriture) {
                                    ((Objet) effet).affiche();
                                }
                            }
                        }
                        if (this.effets.isEmpty()){
                              System.out.println("Aucune effet appliqué");
                            }
                        
                        
///////////////////////////////////////// DEPLACER ////////////////////////////////////////////////////

                        System.out.println("(1 Déplacer)  (2 Attaquer)  (3 Afficher Personnage)\n(4 Inventaire) (5 sauvegarder) (6 Fermer le jeu)");
                        option = scanner.nextLine();
            switch (option) {
                case "1" -> {
                    int dep2=0;
                    while(dep2==0){
                        System.out.print("Entrez le deplacement [x,y]  (x,y e [-1,1]) ('R' pour retourner) ");
                        String input = scanner.nextLine();
                        if("R".equals(input)){
                            dep2=1;
                        }
                        else{
                                input = input.replace("[", "").replace("]", "").replaceAll("\\s", "");
                                String[] parts = input.split(",");

                                if (parts.length == 2) {
                                    try {
                                        int y = Integer.parseInt(parts[0]);
                                        int x = Integer.parseInt(parts[1]);
                                        if(x>1 || x<-1 || y>1 || y<-1){
                                            System.out.print("deplacement impossible \n");
                                        }
                                        else{
                                        //verifier si c'est possible
                                        if((personnage.getpos().getX() + x)<=(taille-1) && (personnage.getpos().getX() + x)>=0
                                                && (personnage.getpos().getY() + y)<=(taille-1) && (personnage.getpos().getY() + y)>=0){
                                            if(this.grille[personnage.getpos().getX() + x ][personnage.getpos().getY() + y]==null){
                                                this.grille[personnage.getpos().getX()][personnage.getpos().getY()]=null;
                                                personnage.getpos().setPosition(personnage.getpos().getX() + x,personnage.getpos().getY() + y);
                                                this.grille[personnage.getpos().getX()][personnage.getpos().getY()] = personnage;
                                            }
                                            else if(this.grille[personnage.getpos().getX() + x ][personnage.getpos().getY() + y] instanceof Objet objet){
                                                if(!(objet instanceof NuageToxique)){
                                                this.inventaire.add(((Utilisable) objet));
                                                this.grille[personnage.getpos().getX()][personnage.getpos().getY()]=null;
                                                personnage.getpos().setPosition(personnage.getpos().getX() + x,personnage.getpos().getY() + y);
                                                this.grille[personnage.getpos().getX()][personnage.getpos().getY()]=personnage;
                                                System.out.println("Objet ajouté dans l'inventaire: "+ objet.getClass().getSimpleName());
                                                }
                                                else{
                                                int pt=personnage.getptVie();
                                                ((NuageToxique) objet).combattre(personnage);
                                                this.grille[personnage.getpos().getX()][personnage.getpos().getY()]=null;
                                                personnage.getpos().setPosition(personnage.getpos().getX() + x,personnage.getpos().getY() + y);
                                                this.grille[personnage.getpos().getX()][personnage.getpos().getY()]=personnage;
                                                System.out.println("Nuage: "+personnage+" -"+(pt-personnage.getptVie())+" ptVie");
                                                this.creatures.set(this.creatures.indexOf(objet),null);
                                                }
                                                
                                            }
                                            else {
                                                System.out.print("deplacement impossible \n");
                                            }
                                        }
                                        else{
                                            System.out.print("deplacement impossible \n");
                                        }
                                        dep2 =1;
                                        ret=1;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("ERROR - x et y sont -int-");
                                    }
                                } else {
                                    System.out.println("format invalide, utilisez: [x,y].");
                                }
                        }
                    }

                }           
                            
////////////////////////////////////////////     ATTAQUER   //////////////////////////////////////////////////////////
                            
                            
                            case "2" -> {
                                int dep2=0;
                                while(dep2==0){
                                System.out.print(" Entrez la position du personnage [x,y] ('R' pour retourner) ");
                                String input = scanner.nextLine();
                                if("R".equals(input)){
                                        dep2=1;
                                    }
                                    else{
                                           input = input.replace("[", "").replace("]", "").replaceAll("\\s", "");
                                            String[] parts = input.split(",");
                                            
                                            if (parts.length == 2) {
                                                try {
                                                    int y = Integer.parseInt(parts[0]);
                                                    int x = Integer.parseInt(parts[1]);
                                                    Point2D xy = new Point2D(x,y);
                                                    if(this.grille[x][y] instanceof Objet || this.grille[x][y] == null 
                                                            || personnage.getpos().distance(xy)>personnage.getdistAttMax()){
                                                        System.out.print("impossible d'attaquer \n");
                                                        dep2 = 1;
                                                        ret =1;
                                                    }
                                                    else{
                                                        int vie = personnage.getptVie();
                                                        int vieM = ((Creature) this.grille[x][y]).getptVie();
                                                        ((Combattant) personnage).combattre((Creature) this.grille[x][y]);
                                                        System.out.println(((Creature) this.grille[x][y]).getClass().getSimpleName()+" "+(((Creature) this.grille[x][y]).getptVie()-vieM)+" ptVie");
                                                         if(this.grille[x][y] instanceof Combattant && (this.grille[x][y]).getptVie()>0){
                                                        ((Combattant) this.grille[x][y]).combattre(personnage);
                                                        System.out.println(personnage.getNom()+" "+(personnage.getptVie()-vie)+" ptVie");
                                                        }
                                                        dep2 = 1;
                                                        ret =1;
                                                    }
                                                    }
                                                catch (NumberFormatException e) {
                                                    System.out.println("ERROR - x et y sont -int-");
                                                }
                                            } else {
                                                System.out.println("format invalide, utilisez: [x,y].");
                                            }
                                }
                                }   
                            }
/////////////////////////////////////////////////////// AFFICHER /////////////////////////////////////////////////////////////           
                            case "3" -> {personnage.affiche();}
                            
                            
                            
///////////////////////////////////////////////////////// INVENTAIRE ///////////////////////////////////////////////////////////
                            
                            case "4" -> {
                                System.out.println("-- INVENTAIRE --");

                                if (this.inventaire.isEmpty()) {
                                    System.out.println("Inventaire Vide.");
                                } else {
                                    System.out.println("N°\tNom\t\tDuree");
                                    for (int i = 0; i < this.inventaire.size(); i++) {
                                        Utilisable item = this.inventaire.get(i);
                                        System.out.println(i + "\t" + item.getNom() + "\t\t" + ((Objet) item).getduree());
                                    }

                                    System.out.print("N°: ");
                                    Scanner scanner2 = new Scanner(System.in);
                                    try{
                                    int nItem = scanner2.nextInt();
                                    
                                    if (nItem >= 0 && nItem < this.inventaire.size()) {
                                        Utilisable item = this.inventaire.get(nItem);
                                            item.useitem(personnage);
                                            this.effets.add(item);
                                            System.out.println("item utilisé: " + item.getNom() );
                                            this.inventaire.remove(nItem); 
                                            ret=1;
                                    } else {
                                        System.out.println("Item non trouvé");
                                    }
                                    }
                                    catch(InputMismatchException e){
                                    System.out.println("Item non trouvé");
                                    }
                                }
                                
                            }
/////////////////////////////////////////////////////// SAUVEGARDER ////////////////////////////////////////////////////////////////
                            
                            case "5" -> {
                            this.joueur=personnage;
                            Scanner scanner3 = new Scanner(System.in);
                            System.out.print("Voulez-vous choisir un nom de sauvegarde(Oui/Non) ? ");
                            String reponse1 = scanner3.nextLine().toLowerCase();

                            switch (reponse1) {
                                case "oui" -> {
                                    System.out.print("Nom: ");
                                    String reponse2 = scanner3.nextLine().toLowerCase();
                                    this.sauvegardePartie(reponse2);
                                }
                                case "non" -> {
                                    String nomFichier = obtenirNomFichierSauvegarde();
                                    if (nomFichier != null) {
                                        sauvegardePartie(nomFichier);
                                    }
                                }
                                default -> {
                                }
                            }
                            
                            }
/////////////////////////////////////////////////////// FERMER LE JEU  /////////////////////////////////////////////////////////////   
       
                            case "6" -> {System.out.print("--JEU FERMÉ--");
                            ret =   1;}
                            
                            default -> {
                            }
                        }
                    }
                    this.TourDeJeu();
                }   
            }
                System.out.print("--  FIN DE JEU  --");
        }
    


    /**
     * Sauvegarde l'état courant de la partie de WoE.
     *
     * @param nomFichier Le nom du fichier de sauvegarde.
     */
    public void sauvegardePartie(String nomFichier) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier))) {
        // Salve o tamanho da matriz na primeira linha
        int tamanhoMatriz = this.grille.length;
        writer.write(Integer.toString(tamanhoMatriz));
        writer.newLine();  // Adicione uma quebra de linha

        // Iterar sobre a matriz this.grille[][] e salvar o conteúdo de cada elemento
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                if (this.grille[i][j] != null) {
                    if (i == this.joueur.getpos().getX() && j == this.joueur.getpos().getY()) {
                        String texteSauvegarde = this.grille[i][j].getTexteSauvegarde();
                        writer.write("Joueur " + texteSauvegarde);
                    } else {
                        String texteSauvegarde = this.grille[i][j].getTexteSauvegarde();
                        writer.write(texteSauvegarde);
                    }
                    writer.newLine();  // Adicione uma quebra de linha após cada elemento
                }
            }
        }

        // Adicionar os itens do inventário com a menção "inventaire" antes de cada item
        for (Utilisable item : this.inventaire) {
            writer.write("inventaire " + item.getTexteSauvegarde());
            writer.newLine();
        }
        for (Utilisable item: this.effets){
            writer.write("effets " + item.getTexteSauvegarde());
            writer.newLine();
        }

        System.out.println("Partie sauvegardée avec succès dans le fichier : " + nomFichier);
    } catch (IOException e) {
        System.err.println("Erreur lors de la sauvegarde de la partie.");
        e.printStackTrace();
    }
}

    /**
     * Obtient le nom du fichier de sauvegarde, en proposant un nom automatique unique.
     *
     * @return Le nom du fichier de sauvegarde.
     */
    private String obtenirNomFichierSauvegarde() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String dateHeure = dateFormat.format(new Date());
        return "sauvegarde_" + dateHeure + ".txt";
    }
    
    /**
     * Charge une partie à partir d'un fichier de sauvegarde.
     *
     * @param nomFichier Le nom du fichier de sauvegarde à charger.
     * @return 
     */
    public boolean chargementPartie(String nomFichier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String taille;
            taille = reader.readLine();
            int dim = Integer.parseInt(taille);
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] dados = ligne.split(" ");
                String tipo = dados[0];
                
                
                switch (tipo) {
                    case "Archer" -> {
                        String nome = dados[1];
                        int ptVie = Integer.parseInt(dados[2]);
                        int degAtt = Integer.parseInt(dados[3]);
                        int ptPar = Integer.parseInt(dados[4]);
                        int pageAtt = Integer.parseInt(dados[5]);
                        int pagePar = Integer.parseInt(dados[6]);
                        int distAttMax = Integer.parseInt(dados[7]);
                        int posX = Integer.parseInt(dados[8]);
                        int posY = Integer.parseInt(dados[9]);
                        int nbFleches = Integer.parseInt(dados[10]);
                        this.creatures.add(new Archer(nome,ptVie,degAtt,ptPar,pageAtt,pagePar,distAttMax,nbFleches,new Point2D(posX,posY)));}
                    
                    
                    case "Guerrier" ->{
                        String nome = dados[1];
                        int ptVie = Integer.parseInt(dados[2]);
                        int degAtt = Integer.parseInt(dados[3]);
                        int ptPar = Integer.parseInt(dados[4]);
                        int pageAtt = Integer.parseInt(dados[5]);
                        int pagePar = Integer.parseInt(dados[6]);
                        int distAttMax = Integer.parseInt(dados[7]);
                        int posX = Integer.parseInt(dados[8]);
                        int posY = Integer.parseInt(dados[9]);
                        this.creatures.add(new Guerrier(nome,ptVie,degAtt,ptPar,pageAtt,pagePar,distAttMax,new Point2D(posX,posY)));
                    }

                    case "Paysan" -> {
                        String nome = dados[1];
                        int ptVie = Integer.parseInt(dados[2]);
                        int degAtt = Integer.parseInt(dados[3]);
                        int ptPar = Integer.parseInt(dados[4]);
                        int pageAtt = Integer.parseInt(dados[5]);
                        int pagePar = Integer.parseInt(dados[6]);
                        int distAttMax = Integer.parseInt(dados[7]);
                        int posX = Integer.parseInt(dados[8]);
                        int posY = Integer.parseInt(dados[9]);
                        this.creatures.add(new Paysan(nome,ptVie,degAtt,ptPar,pageAtt,pagePar,distAttMax,new Point2D(posX,posY)));
                    }
                    
                    case "Nourriture" ->{
                        String nome = dados[1];
                        int degAtt = Integer.parseInt(dados[2]);
                        int ptPar = Integer.parseInt(dados[3]);
                        int pageAtt = Integer.parseInt(dados[4]);
                        int pagePar = Integer.parseInt(dados[5]);
                        int duree = Integer.parseInt(dados[6]);
                        int posX = Integer.parseInt(dados[7]);
                        int posY = Integer.parseInt(dados[8]);
                        boolean consomee = Boolean.parseBoolean(dados[9]);
                        this.nourritures.add(new Nourriture(nome,degAtt,ptPar,pageAtt,pagePar,duree,new Point2D(posX,posY),consomee));}
                    
                    
                    case "Lapin" ->{
                        int ptVie = Integer.parseInt(dados[1]);
                        int degAtt = Integer.parseInt(dados[2]);
                        int ptPar = Integer.parseInt(dados[3]);
                        int pageAtt = Integer.parseInt(dados[4]);
                        int pagePar = Integer.parseInt(dados[5]);
                        int posX = Integer.parseInt(dados[6]);
                        int posY = Integer.parseInt(dados[7]);
                        this.creatures.add(new Lapin(ptVie,degAtt,ptPar,pageAtt,pagePar,new Point2D(posX,posY)));
                    }

                    case "Loup" ->{
                        int ptVie = Integer.parseInt(dados[1]);
                        int degAtt = Integer.parseInt(dados[2]);
                        int ptPar = Integer.parseInt(dados[3]);
                        int pageAtt = Integer.parseInt(dados[4]);
                        int pagePar = Integer.parseInt(dados[5]);
                        int posX = Integer.parseInt(dados[6]);
                        int posY = Integer.parseInt(dados[7]);
                        this.creatures.add(new Loup(ptVie,degAtt,ptPar,pageAtt,pagePar,new Point2D(posX,posY)));
                    }
                    
                    case "NuageToxique" ->{
                        int ptVie = Integer.parseInt(dados[1]);
                        int posX = Integer.parseInt(dados[6]);
                        int posY = Integer.parseInt(dados[7]);
                        this.creatures.add(new NuageToxique(ptVie,new Point2D(posX,posY)));
                    }
                    
                    case "PotionSoin" ->{
                        int ptVie = Integer.parseInt(dados[1]);
                        int posX = Integer.parseInt(dados[6]);
                        int posY = Integer.parseInt(dados[7]);
                        this.objets.add(new PotionSoin(ptVie,new Point2D(posX,posY)));
                    }
                    
                    case "Epee" ->{
                        int degAtt = Integer.parseInt(dados[2]);
                        int posX = Integer.parseInt(dados[6]);
                        int posY = Integer.parseInt(dados[7]);
                        this.objets.add(new Epee(degAtt,new Point2D(posX,posY)));
                    }
                    
                    case "inventaire" ->{
                        String type = dados[1];
                        switch (type){
                            case "Epee" ->{
                                int degAtt = Integer.parseInt(dados[3]);
                                int posX = Integer.parseInt(dados[7]);
                                int posY = Integer.parseInt(dados[8]);
                                this.inventaire.add(new Epee(degAtt,new Point2D(posX,posY)));
                            }
                            case "PotionSoin" ->{
                                int ptVie = Integer.parseInt(dados[2]);
                                int posX = Integer.parseInt(dados[7]);
                                int posY = Integer.parseInt(dados[8]);
                                this.inventaire.add(new PotionSoin(ptVie,new Point2D(posX,posY)));
                            }
                            case "Nourriture"->{
                                String nome = dados[2];
                                int degAtt = Integer.parseInt(dados[4]);
                                int ptPar = Integer.parseInt(dados[5]);
                                int pageAtt = Integer.parseInt(dados[6]);
                                int pagePar = Integer.parseInt(dados[7]);
                                int posX = Integer.parseInt(dados[8]);
                                int posY = Integer.parseInt(dados[9]);
                                int duree = Integer.parseInt(dados[10]);
                                boolean consomee = Boolean.parseBoolean(dados[11]);
                                this.inventaire.add(new Nourriture(nome,degAtt,ptPar,pageAtt,pagePar,duree,new Point2D(posX,posY),consomee));
                            }
                            default ->{
                            }
                        }
                    }
                    
                    case "effets"->{
                        String nome = dados[2];
                        int degAtt = Integer.parseInt(dados[4]);
                        int ptPar = Integer.parseInt(dados[5]);
                        int pageAtt = Integer.parseInt(dados[6]);
                        int pagePar = Integer.parseInt(dados[7]);
                        int posX = Integer.parseInt(dados[8]);
                        int posY = Integer.parseInt(dados[9]);
                        int duree = Integer.parseInt(dados[10]);
                        boolean consomee = Boolean.parseBoolean(dados[11]);
                        this.effets.add(new Nourriture(nome,degAtt,ptPar,pageAtt,pagePar,duree,new Point2D(posX,posY),consomee));
                    }
                    
                    case "Joueur" ->{
                        String classe = dados[1];
                        String nom = dados[2];
                        int ptVie = Integer.parseInt(dados[3]);
                        int degAtt = Integer.parseInt(dados[4]);
                        int ptPar = Integer.parseInt(dados[5]);
                        int pageAtt = Integer.parseInt(dados[6]);
                        int pagePar = Integer.parseInt(dados[7]);
                        int distAttMax = Integer.parseInt(dados[8]);
                        int posX = Integer.parseInt(dados[9]);
                        int posY = Integer.parseInt(dados[10]);
                        int nbFleches = Integer.parseInt(dados[11]);
                        switch (classe){
                            case "Archer"->{
                                this.joueur = new Archer(nom,ptVie,degAtt,ptPar,pageAtt,pagePar,distAttMax,nbFleches,new Point2D(posX,posY));
                            }
                            case "Guerrier"->{
                                this.joueur = new Guerrier(nom,ptVie,degAtt,ptPar,pageAtt,pagePar,distAttMax,new Point2D(posX,posY));
                            }
                            default->{
                            }
                        }
                    }
                    
                    default -> {
                    }
                }
            }
            
            
            this.grille = new ElemJeu[dim][dim];
            //Placement
            //Archers
            int k=0;
            while(k <this.creatures.size()){
                this.grille[this.creatures.get(k).getpos().getX()][this.creatures.get(k).getpos().getY()]=this.creatures.get(k);
                k++;
            }
            
            
            // Objets
            k=0;
            while(k <(this.objets.size())){
                this.grille[this.objets.get(k).getpos().getX()][this.objets.get(k).getpos().getY()]=this.objets.get(k);
                k++;
            }
            
            
            // Nourritures
            k=0;
            while(k <(this.nourritures.size())){
                this.grille[this.nourritures.get(k).getpos().getX()][this.nourritures.get(k).getpos().getY()]=this.nourritures.get(k);
                k++;
            }
            
            //Joueur
            this.grille[this.joueur.getpos().getX()][this.joueur.getpos().getY()]=this.joueur;
            
            
            
            System.out.println("Partie chargée avec succès à partir du fichier : " + nomFichier);
            return true;
        } catch (IOException e) {
            System.err.println("Erreur lors du chargement de la partie.");
            e.printStackTrace();
            return false;
        }}


    /**
     * Propose la possibilité de charger une sauvegarde existante au lancement de la partie.
     * @return 
     */
    public boolean chargerSauvegardeAuLancement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voulez-vous charger une sauvegarde existante au lancement de la partie (Oui/Non) ? ");
        String reponse = scanner.nextLine().toLowerCase();

        if (reponse.equals("oui")) {
            System.out.print("Entrez le nom du fichier de sauvegarde : ");
            String nomFichier = scanner.nextLine();
            return chargementPartie(nomFichier);
            
        }
        else{
        return false;
        }
    }


}










    
        
    


