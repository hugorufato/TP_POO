/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

import java.util.Random;

/**Sous classe guerrier
 *
 * @author hugorufato et luanlopesf
 */
public class Guerrier extends Personnage {
    private int pageAt,degAt,distA;
    private Point2D position;
    
    /**Constructor dont les paramètres sont les caracteristiques
     *
     * @param n Nom 
     * @param pV POints de vie
     * @param dA Dégâts d'attaque
     * @param pPar Points de parade
     * @param paAtt Pourcentage d'attaque
     * @param paPar Pourcentage de parade
     * @param dMax Distance maximale d'attaque
     * @param p Position
     * @param nbF Nombre de fleches
     */
    public Guerrier(String n,int pV,int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p, int nbF){
        super(n,pV,dA,pPar,paAtt,paPar,dMax,p);
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();
    }
    
    /** Constructor que copie un objet guerrier
     *
     * @param g Objet type Guerrier
     */
    public Guerrier(Guerrier g){
   
        super((Personnage)g);
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();        
       
   }

    /** Constructor sans paramètres
     *
     */
    public Guerrier(){
     super();
     this.setNom("Guerrier");
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();
   }
  
     //COMBATTRE

    /**Combat entre deux creatures
     *
     * @param c Objet type Creture
     */
    public void combattre(Creature c){
        
    //type de combat
    
    //Contact
        if(position.distance(c.getpos())==1){
            System.out.println("ATAQUE CONTACT");
            Random naleat = new Random();
            int rand1 = naleat.nextInt(100);
            System.out.println("Jet de dés d'attaque:"+rand1);
            if(rand1<=pageAt){
            //Attaque réussie
            System.out.println("ATAQUE RÉUSSIE");
              int rand2 = naleat.nextInt(100);
              System.out.println("Jet de dés de défence"+rand2);
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
            System.out.println("Jet de dés d'attaque:"+rand1);
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

