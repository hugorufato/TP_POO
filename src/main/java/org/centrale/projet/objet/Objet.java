/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**Classe mère Objet
 *
 * @author hugorufato et luanlopesf
 */
public class Objet {

    private int ptVie, degAtt, ptPar, pageAtt, pagePar;
    private Point2D pos;

    /**Constructor dont les paramètres sont les caracteristiques
     *
     * @param pV Points de vie
     * @param dA Dégâts d'attaque
     * @param pPar Points de parade
     * @param paAtt Pourcentage d'attaque
     * @param paPar Pourcentage de parade
     * @param p Position
     */
    public Objet(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p) {
        this.ptVie = pV;
        this.degAtt = dA;
        this.ptPar = pPar;
        this.pageAtt = paAtt;
        this.pagePar = paPar;
        this.pos = p;
    }

    /**Constructor que copie un objet Objet
     *
     * @param c Objet type Objet
     */
    public Objet(Objet c) {
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
    public Objet() {
        this.ptVie = 0;
        this.degAtt = 0;
        this.ptPar = 0;
        this.pageAtt = 0;
        this.pagePar = 0;
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

    /**Mis à jour de la pourcentage de parade
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
}
