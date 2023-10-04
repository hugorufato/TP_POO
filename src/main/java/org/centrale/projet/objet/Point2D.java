package org.centrale.projet.objet;

/** Classe que gère la position des éléments
 *
 * @author hugorugato et luanlopesf
 */
public class Point2D {

    private int x;
    private int y;

    //San parametres
    /**Constructor sans paramètres pour mettre pos (0,0)
     *
     */
    public Point2D() {
        x = 0;
        y = 0;
    }

//Creation a partir de deux parametres
    /**Constructor avec deux parametres 
     *
     * @param v1 Position x
     * @param v2 Position y
     */
    public Point2D(int v1, int v2) {
        x = v1;
        y = v2;
    }

    /**Constructeur de recopie
     *
     * @param p Objet type Point2D
     */
    public Point2D(Point2D p) {
        x = p.x;
        y = p.y;
    }

//SetX
    /**Mis à jour de la position X
     *
     * @param v1 Position x
     */
    public void setX(int v1) {
        x = v1;
    }

//SetY
    /**Mis à jour de la position Y
     *
     * @param v2 Position y
     */
    public void setY(int v2) {
        y = v2;
    }

//GetX
    /**Retourner la position x
     *
     * @return la position x
     */
    public int getX() {
        return x;
    }

//GetY
    /**REtourner la position y
     *
     * @return la position y
     */
    public int getY() {
        return y;
    }

//SetPosition
    /**Mis à jour du x et du y
     *
     * @param v1 Position x
     * @param v2 Position y
     */
    public void setPosition(int v1, int v2) {
        x = v1;
        y = v2;
    }

//Translate
    /** Translate
     *
     * @param dx Delta en x
     * @param dy Delta en y
     */
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

//Affichage
    /** Afficher la position [x,y] 
     *
     */
    public void affiche() {
        System.out.println("[" + x + ";" + y + "]");
    }

//Distance
    /** Distance entre 2 points
     *
     * @param p Point dont la distance on veut calculer
     * @return
     */
    public double distance(Point2D p) {
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

}
