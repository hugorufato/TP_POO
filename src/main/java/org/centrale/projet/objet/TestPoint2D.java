package org.centrale.projet.objet;

/**Test de position 
 *
 * @author hugorufato et luanlopesf
 */
public class TestPoint2D {

    /**
     *
     * @param args Defaut
     */
    public static void main(String[] args) {
        //Creation des points
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(5, 5);
        Point2D p3 = new Point2D(p2);
        //Test Affichage 
        System.out.println("Les points sont: p1=[0;0] p2=[5;5] p3=[5;5]");
        p1.affiche();
        p2.affiche();
        p3.affiche();
        //Test Translation
        System.out.println("Translation dx=5 dy=-2");
        p1.translate(5, -2);
        p2.translate(5, -2);
        p3.translate(5, -2);
        p1.affiche();
        p2.affiche();
        p3.affiche();
        //Test SetPosition
        System.out.println("Set position p1=[4;3]");
        p1.setPosition(4, 3);
        p1.affiche();
        //Test GetX et GetY
        System.out.println("les coordonees de le point p1 sont " + "x=" + p1.getX() + " et y=" + p1.getY());
        //Test Setx et SetY
        System.out.println("Le point p2 est:");
        p2.affiche();
        p2.setX(20);
        p2.setY(10);
        System.out.println("Le point p2 est maintenant:");
        p2.affiche();
        //Test Distance
        double d = p1.distance(p2);
        System.out.println("La distance entre P1 et P2 est: " + d);

    }
}
