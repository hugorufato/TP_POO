/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**Sous classe Personnage et classe mère de guerrier, paysan et archer
 *
 * @author hugorufato et luanlopesf
 */
public class Personnage extends Creature {

    private String nom;
    private int distAttMax;

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
    public Personnage(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p) {
        super(pV, dA, pPar, paAtt, paPar, p);
        this.nom = n;
        this.distAttMax = dMax;
    }

    /** Constructor que copie un objet personnage
     *
     * @param perso Objet type Personnage
     */
    public Personnage(Personnage perso) {
        super((Creature) perso);
        this.nom = perso.nom;
        this.distAttMax = perso.distAttMax;

    }

    /** Constructor sans paramètres
     *
     */
    public Personnage() {
        super();
        this.nom = "Personnage_vide";
        this.distAttMax = 5;
    }

//Set functions
    /**Mis à jour du nom
     *
     * @param n Nom
     */
    public void setNom(String n) {
        nom = n;
    }

    /**Mis à jour de la distance maximale d'attaque
     *
     * @param datt Distance maximale d'attaque
     */
    public void setdistAttMax(int datt) {
        distAttMax = datt;
    }

//Get functions
    /**Get nom
     *
     * @return Le nom
     */
    public String getNom() {
        return nom;
    }

    /**Get la distance maximale d'attaque
     *
     * @return La distance maximale d'attaque
     */
    public int getdistAttMax() {
        return distAttMax;
    }

//AFFICHE
    /**Afficher las caracteristiques du personnage
     *
     */
    public void affiche() {
        System.out.println("Personnage: " + nom);
        afficheG();
        System.out.println("DistAttMax = " + distAttMax);
    }

}
