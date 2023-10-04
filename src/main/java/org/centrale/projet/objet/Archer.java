/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

import java.util.Random;

/** Sous classe Archer
 *
 * @author hugorufato et luanlopesf 
 */
public class Archer extends Personnage {

    private int nbFleches, pageAt, degAt, distA;
    private Point2D position;

    /** Constructor dont les paramètres sont les caracteristiques
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
    public Archer(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p, int nbF) {
        super(n, pV, dA, pPar, paAtt, paPar, dMax, p);
        this.nbFleches = nbF;
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();
    }

    /** Constructor que copie un objet archer
     *
     * @param a Objet type Archer
     */
    public Archer(Archer a) {

        super((Personnage) a);
        this.nbFleches = a.nbFleches;
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();

    }

    /** Constructor sans paramètres
     *
     */
    public Archer() {
        super();
        this.setNom("Archer");
        this.nbFleches = 10;
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
        distA = this.getdistAttMax();

    }

    /**
     *
     * @return le nombre de fleches 
     */ 
    public int getnbFleches() {
        return nbFleches;
    }

    //COMBATTRE
    /** Combat entre deux creatures
     *
     * @param c Objet type Creture
     */
    public void combattre(Creature c) {

        //type de combat
        //Contact
        if (position.distance(c.getpos()) == 1) {
            System.out.println("ATAQUE CONTACT");
            Random naleat = new Random();
            int rand1 = naleat.nextInt(100);
            System.out.println("Jet de dés d'attaque:" + rand1);
            if (rand1 <= pageAt) {
                //Attaque réussie
                System.out.println("ATAQUE RÉUSSIE");
                int rand2 = naleat.nextInt(100);
                System.out.println("Jet de dés de défence:" + rand2);
                if (rand2 > c.getpagePar()) {
                    c.setptVie(c.getptVie() - degAt);
                } else {
                    System.out.println("DÉFENCE");
                    c.setptVie(c.getptVie() - degAt + c.getptPar());
                }

            } else {
                //Ataque ratée
                System.out.println("ATAQUE RATÉE");
            }
        } //À distance
        else if (position.distance(c.getpos()) > 1 && position.distance(c.getpos()) < distA) {
            System.out.println("ATAQUE À DISTANCE");
            Random naleat = new Random();
            int rand1 = naleat.nextInt(100);
            System.out.println("Jet de dés d'attaque:" + rand1);
            if (nbFleches >= 1) {
                nbFleches = nbFleches - 1;
                if (rand1 <= pageAt) {
                    //Attaque réussie
                    System.out.println("ATAQUE RÉUSSIE");
                    c.setptVie(c.getptVie() - degAt);
                } else {
                    //Ataque ratée
                    System.out.println("ATAQUE RATÉE");
                }
            } else {
                System.out.println("Impossible d'attaquer");
            }
        } else {
            System.out.println("Impossible d'attaquer");
        }
    }
}
