/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

import java.util.Random;

/**Sous classe Loup
 *
 * @author hugorufato et luanlopesf
 */
public class Loup extends Monstre {
    
    private int pageAt, degAt;
    private Point2D position;

    /**
     * Constructor dont les paramètres sont les caracteristiques
     * @param pV Points de vie
     * @param dA Dégâts d'attaque
     * @param pPar Points de parade
     * @param paAtt Pourcentage d'attaque
     * @param paPar Pourcentage de parade
     * @param p Position
     */
    public Loup(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p) {
        super(pV, dA, pPar, paAtt, paPar, p);
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
    }

    /** Constructor que copie un objet loup
     *
     * @param l Objet type Loup
     */
    public Loup(Loup l) {
        super((Monstre) l);
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
    }

    /**Constructor sans paramètres
     *
     */
    public Loup() {
        super();
        position = this.getpos();
        pageAt = this.getpageAtt();
        degAt = this.getdegAtt();
    }
    //COMBATTRE

    /** Combat entre deux creatures
     *
     * @param c Objet type Creture
     */
    public void combattre(Creature c) {

        //type de combat
        //Contact
        System.out.println("ATAQUE CONTACT");
        if (position.distance(c.getpos()) == 1) {
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
        } else {
            System.out.println("Impossible d'attaquer");
        }
    }
}
