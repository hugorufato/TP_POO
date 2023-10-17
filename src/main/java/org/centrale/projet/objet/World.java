/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.centrale.projet.objet;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

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
        nourritures = new ArrayList();
        miel1 = new Nourriture("miel",3,0,0,0,new Point2D(),4,false);
        biere1 = new Nourriture("biere",0,0,-24,0,new Point2D(),3,false);
        miel2 = new Nourriture("miel",5,0,0,0,new Point2D(),4,false);
        biere2 = new Nourriture("biere",0,0,-20,0,new Point2D(),3,false);
        miel3 = new Nourriture("miel",4,0,0,0,new Point2D(),4,false);
        biere3 = new Nourriture("biere",0,0,-18,0,new Point2D(),3,false);

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


    
    public void CreerMondeAlea(int taille){

    if(taille<=2){
    System.out.println("ERROR - TAILLE DU MONDE DOIT ETRE >= 2");
    }
    else{
            
    this.grille = new ElemJeu[taille][taille];
    
//Creation
    Random aleat = new Random();
        
        int nA = 1;
        int nP = 1;
        int nL = 1;
        int nG = 1;
        int nLo = 1;
        int npotion = 5;
        int nepee = 5;
        int nNuage = 3;
        
        
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
        
        //Nuage Toxique
        k=0;
        while(k <nNuage){
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
         while(k <(npotion+nepee)){
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
    }

    
    
    
    /**Tour de jeu
     *
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
     
    // Deplacement et combattre des creatures
    for (int i = 0; i < this.creatures.size(); i++) {
        if(this.creatures.get(i)!=null){
        if(this.creatures.get(i) instanceof Creature && this.creatures.get(i).getptVie()<=0){
        this.grille[this.creatures.get(i).getpos().getX()][this.creatures.get(i).getpos().getY()] = null;
        this.creatures.set(i,null);
        }
        else{
        //////////////// COMBATTRE /////////////////////////////////////////////////////////////////////////////////////////////
//        if(attaquer==true && this.creatures.get(i) instanceof Combattant){
//        ((Combattant) this.creatures.get(i)).combattre();
//                
//                
//                
//                
//                
//                
//                
//                
//                
//                
//                
//                
//        }
//        else{
//        
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
    
    public void partie(int taille){
    
             // Scan
            Scanner scanner = new Scanner(System.in);
            System.out.print("Commencer le jeu? [y/n]: ");
            String commencer = scanner.nextLine();
            if (commencer.equals("y")) {
                // Creer monde
                this.CreerMondeAlea(taille);
                //Creer Joueur
                Joueur joueur = new Joueur();
                System.out.print("Choisissez une classe jouable: Guerrier, Archer : ");
                String classe = scanner.nextLine();
                System.out.print("Entrez le nom de votre Personnage : ");
                String nomPerso = scanner.nextLine();
                Personnage personnage = joueur.choisirPersonnage(classe, nomPerso);
                this.Placer(personnage);
                if (personnage != null) {
                    System.out.println("Personnage créé : ");
                    System.out.println("Classe : " + personnage.getClass().getSimpleName());
                    personnage.affiche();
                }
                String option = null;
                
 ///////////////////////////////////////// TOURS DE JEU ////////////////////////////////////////////////////
 
                while(!"5".equals(option) && personnage.getptVie()>0 ){
                    this.afficheWorld();
                    System.out.println(" ");
                    int ret = 0;
                    
                    while(ret==0){
////////////////////////////////////////////EFFETS//////////////////////////////////////////////////////////////
                        
                        
                        if (!this.effets.isEmpty()) {
                            Iterator<Utilisable> iterator = effets.iterator();
                            while (iterator.hasNext()) {
                                Utilisable effet = iterator.next();
                                if (effet.getduree() == 0) {
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

                        System.out.println("(1 Déplacer)  (2 Attaquer)  (3 Afficher Personnage) (4 Inventaire) (5 Fermer le jeu)");
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
                                                        ((Combattant) personnage).combattre((Creature) this.grille[x][y]);
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
                                        System.out.println(i + "\t" + item.getNom() + "\t\t" + item.getduree());
                                    }

                                    System.out.print("N°: ");
                                    Scanner scanner2 = new Scanner(System.in);
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
                            }

/////////////////////////////////////////////////////// FERMER LE JEU  /////////////////////////////////////////////////////////////   
       
                            case "5" -> {System.out.print("--JEU FERMÉ--");
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
    
    
    
    
    
    }









    
        
    


