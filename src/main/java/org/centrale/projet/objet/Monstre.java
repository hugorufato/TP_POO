/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**
 * Sous classe Monstre
 *
 * @author hugorufato et luanlopesf
 */
public class Monstre extends Creature {

    /**
     * Constructor dont les paramètres sont les caracteristiques
     *
     * @param pV Points de vie
     * @param dA Dégâts d'attaque
     * @param pPar Points de parade
     * @param paAtt Pourcentage d'attaque
     * @param paPar Pourcentage de parade
     * @param p Position
     */
    public Monstre(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p) {
        super(pV, dA, pPar, paAtt, paPar, p);
    }

    /**
     * Constructor que copie un objet monstre
     *
     * @param m Objet type Monstre
     */
    public Monstre(Monstre m) {

        super((Creature) m);
    }

    /**
     * Constructor sans paramètres
     *
     */
    public Monstre() {
        super();
    }

    /** Affiche les caracteristiques du monstre
     *
     */
    public void affiche() {
        afficheG();
    }

}
