/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**
 * Sous classe Lapin
 *
 * @author hugorufato et luanlopesf
 */
public class Lapin extends Monstre {

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
    public Lapin(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p) {
        super(pV, dA, pPar, paAtt, paPar, p);
    }

    /** Constructor que copie un objet lapin
     *
     * @param l Objet type lapin
     */
    public Lapin(Lapin l) {
        super((Monstre) l);
    }

    /**Constructor sans paramètres
     *
     */
    public Lapin() {
        super();
    }

}
