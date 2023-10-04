/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 * Classe mère Creature
 *
 * @author hugorufato et launlopesf
 */
public class Creature {

    private int ptVie, degAtt, ptPar, pageAtt, pagePar;
    private Point2D pos;

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
    public Creature(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p) {
        this.ptVie = pV;
        this.degAtt = dA;
        this.ptPar = pPar;
        this.pageAtt = paAtt;
        this.pagePar = paPar;
        this.pos = p;
    }

    /** Constructor que copie un objet creture
     *
     * @param c Objet type Creature
     */
    public Creature(Creature c) {
        this.ptVie = c.ptVie;
        this.degAtt = c.degAtt;
        this.ptPar = c.ptPar;
        this.pageAtt = c.pageAtt;
        this.pagePar = c.pagePar;
        this.pos = new Point2D(c.pos);
    }

    /** Constructor sans paramètres
     *
     */
    public Creature() {
        this.ptVie = 10;
        this.degAtt = 1;
        this.ptPar = 1;
        this.pageAtt = 75;
        this.pagePar = 20;
        this.pos = new Point2D();

    }

    //SET FUNCTIONS
    /** Mis à jour des points de vie
     *
     * @param pt Poins de vie qu'on veut
     */
    public void setptVie(int pt) {
        ptVie = pt;
    }

    /** Mis à jour des dégâts d'attaque
     *
     * @param da Dégâts d'attaque qu'on veut
     */
    public void setdegAtt(int da) {
        degAtt = da;
    }

    /** Mis à jour des points de parade
     *
     * @param ppar Points de parade qu'on veut
     */
    public void setptPar(int ppar) {
        ptPar = ppar;
    }

    /** Mis à jour de la pourcentage d'attaque
     *
     * @param pat Pourcentage d'attaque qu'on veut
     */
    public void setpageAtt(int pat) {
        pageAtt = pat;
    }

    /** Mis à jour de la pourcentage de parade
     *
     * @param par Pourcentage de parade qu'on veut
     */
    public void setpagePar(int par) {
        pagePar = par;
    }

    /** Mis à jour de la position
     *
     * @param po Position qu'on veut
     */
    public void setpos(Point2D po) {
        pos = po;
    }

    //GET FUNCTIONS
    /** Get les points de vie
     *
     * @return Les points de vie
     */
    public int getptVie() {
        return ptVie;
    }

    /** Get les dégâts d'attaque
     *
     * @return les dégats d'attaque
     */
    public int getdegAtt() {
        return degAtt;
    }

    /**Get les points de parade
     *
     * @return les points de parade
     */
    public int getptPar() {
        return ptPar;
    }

    /** Get la pourcentage d'attaque
     *
     * @return la pourcentage d'attaque
     */
    public int getpageAtt() {
        return pageAtt;
    }

    /** Get la pourcentage de parade
     *
     * @return la pourcentage de parade
     */
    public int getpagePar() {
        return pagePar;
    }

    /** Get la position
     *
     * @return la position
     */
    public Point2D getpos() {
        return pos;
    }

    //DEPLACE
    /** Deplace la creature vers une position adjacent aleatoire
     *
     */
    public void deplace() {
        Random generateurAleatoire = new Random();
        int rX = generateurAleatoire.nextInt(2);
        int rY = generateurAleatoire.nextInt(2);
        pos.translate(rX, rY);
    }

    //AFFICHE
    /** Affiche les caracteristiques de la Creature
     *
     */
    public void afficheG() {
        System.out.println("ptVie: " + ptVie + "; degAtt: " + degAtt + "; ptPar: " + ptPar + "; pageAtt: " + pageAtt);
        System.out.println("pagePar: " + pagePar + "; Pos: [" + pos.getX() + ";" + pos.getY() + "]");
    }

}
