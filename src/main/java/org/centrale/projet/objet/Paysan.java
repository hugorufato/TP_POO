/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/** Sous classe paysan
 *
 * @author hugorufato et luanlopesf
 */
public class Paysan extends Personnage {

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
     */
    public Paysan(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p) {
        super(n, pV, dA, pPar, paAtt, paPar, dMax, p);
    }

    /** Constructor que copie un objet paysan
     *
     * @param p Objet type Paysan
     */
    public Paysan(Paysan p) {
        super((Personnage) p);
    }

    /** Constructor sans paramètres
     *
     */
    public Paysan() {
        super();
        this.setNom("Paysan");
    }
}
