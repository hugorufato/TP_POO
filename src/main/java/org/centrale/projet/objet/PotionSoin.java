/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**Sous classe PotionSoin
 *
 * @author hugorufato et luanlopes
 */
public class PotionSoin extends Objet {

    /**Constructor avec des paramètres comme caracteristiques
     *
     * @param pt Points de vie que ça soin
     * @param pos Position de la potion
     */
    public PotionSoin(int pt, Point2D pos) {
        super(pt, 0, 0, 0, 0, pos);
    }

    /**Constructor recopie
     *
     * @param p Objet type PotionSoin
     */
    public PotionSoin(PotionSoin p) {
        super((Objet) p);
    }

    /**Constructor sans paramètres
     *
     */
    public PotionSoin() {
        super(5, 0, 0, 0, 0, new Point2D());
    }
}
