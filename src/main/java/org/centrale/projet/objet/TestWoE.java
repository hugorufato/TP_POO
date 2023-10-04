/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**Fichier pour tester le monde
 *
 * @author hugorufato et luanlopesf
 */
public class TestWoE {

    /**
     *
     * @param args Defaut
     */
    public static void main(String[] args) {
        long debut = System.nanoTime();
        //INITIALIZATION DES POINTS
        Point2D point1 = new Point2D(5, 5);
        Point2D point2 = new Point2D(7, 5);
        Point2D point3 = new Point2D(7, 7);
        Point2D point4 = new Point2D(7, 9);
        Point2D point5 = new Point2D(9, 9);
        Point2D point6 = new Point2D(15, 15);
        Point2D point7 = new Point2D(13, 13);
        //TEST CREATION DES PERSONNAGES
        System.out.println("//////////////////////////////// TEST PERSONNAGE ////////////////////////////////");
        System.out.println("");
        Personnage P1 = new Personnage("Player1", 30, 10, 10, 5, 5, 3, point1);
        Personnage P2 = new Personnage(P1);
        Personnage P3 = new Personnage();
        System.out.println("Personnages:");
        P1.affiche();
        P2.affiche();
        P3.affiche();
        System.out.println("");
        System.out.println("//////////////////////////////// FIN TEST PERSONNAGE ////////////////////////////////");
        System.out.println("");
        System.out.println("//////////////////////////////// TEST TYPES DE PERSONNAGES ////////////////////////////////");
        System.out.println("");
        //TEST CREATION DES ARCHERS
        System.out.println("ARCHERS");
        Archer A1 = new Archer("Archer1", 40, 10, 10, 5, 5, 3, point2, 50);
        Archer A2 = new Archer(A1);
        Archer A3 = new Archer();
        A1.affiche();
        A2.affiche();
        A3.affiche();
        System.out.println("");
        //TEST CREATION DES PAYSANS
        System.out.println("PAYSANS");
        Paysan pa1 = new Paysan("Player1", 30, 10, 10, 5, 5, 3, point3);
        Paysan pa2 = new Paysan(pa1);
        Paysan pa3 = new Paysan();
        pa1.affiche();
        pa2.affiche();
        pa3.affiche();
        System.out.println("");
        System.out.println("MONSTRES");
        Monstre m1 = new Monstre(30, 10, 10, 5, 5, point4);
        Monstre m2 = new Monstre(m1);
        Monstre m3 = new Monstre();
        m1.affiche();
        m2.affiche();
        m3.affiche();
        System.out.println("");
        System.out.println("LAPIN");
        Lapin l1 = new Lapin(30, 10, 10, 5, 5, point5);
        Lapin l2 = new Lapin(l1);
        Lapin l3 = new Lapin();
        l1.affiche();
        l2.affiche();
        l3.affiche();
        System.out.println("");
        System.out.println("//////////////////////////////// FIN TEST TYPES DE PERSONNAGES ////////////////////////////////");
        System.out.println("");
        System.out.println("//////////////////////////////// TEST GET, SET ET DEPLACE ////////////////////////////////");
        System.out.println("");
        System.out.println("TEST GET");
        System.out.println("ARCHER A1");
        System.out.println("NOM: " + A1.getNom());
        System.out.println("ATRIBUTS: distAttMax = " + A1.getdistAttMax());
        System.out.println("POSITION: [" + A1.getpos().getX() + ";" + A1.getpos().getY() + "]");
        System.out.println("LAPIN l1");
        System.out.println("ATRIBUTS: ptVie = " + l1.getptVie());
        System.out.println("POSITION: [" + l1.getpos().getX() + ";" + l1.getpos().getY() + "]");
        System.out.println("");
        System.out.println("TEST SET");
        A1.setNom("SUPREME_ARCHER");
        A1.setdistAttMax(15);
        A1.setpos(point6);
        l1.setptVie(50);
        l1.setpos(point7);
        System.out.println("ARCHER A1");
        System.out.println("NOM: " + A1.getNom());
        System.out.println("ATRIBUTS: distAttMax = " + A1.getdistAttMax());
        System.out.println("POSITION: [" + A1.getpos().getX() + ";" + A1.getpos().getY() + "]");
        System.out.println("LAPIN l1");
        System.out.println("ATRIBUTS: ptVie = " + l1.getptVie());
        System.out.println("POSITION: [" + l1.getpos().getX() + ";" + l1.getpos().getY() + "]");
        System.out.println("");
        System.out.println("TEST DEPLACE");
        A1.deplace();
        l1.deplace();
        System.out.println("A1 POSITION: [" + A1.getpos().getX() + ";" + A1.getpos().getY() + "]");
        System.out.println("l1 POSITION: [" + l1.getpos().getX() + ";" + l1.getpos().getY() + "]");
        System.out.println("");
        System.out.println("//////////////////////////////// FIN TEST GET, SET ET DEPLACE ////////////////////////////////");
        System.out.println("");
        System.out.println("//////////////////////////////// TEST WORLD ALEATOIRE ////////////////////////////////");
        World world1 = new World();
        world1.creerMondeAlea();
        System.out.println("nombre de archers: " + world1.archers.size());
        System.out.println("nombre de paysans: " + world1.paysans.size());
        System.out.println("nombre de guerriers: " + world1.guerriers.size());
        System.out.println("nombre de lapins: " + world1.lapins.size());
        System.out.println("nombre de loups: " + world1.loups.size());
        System.out.println("Point de vie de l'ensemble de personnage: " + world1.countvie);
        System.out.println("//////////////////////////////// FIN TEST WORLD ALEATOIRE ////////////////////////////////");
        System.out.println("");
        System.out.println("//////////////////////////////// TEST COMBATTRE ////////////////////////////////");
        world1.robin.getpos().setPosition(5, 5);
        world1.guillaumeT.getpos().setPosition(12, 12);
        world1.bugs1.getpos().setPosition(6, 5);
        world1.bugs2.getpos().setPosition(10, 10);
        world1.grosBill.getpos().setPosition(3, 3);
        world1.wolfie.getpos().setPosition(4, 3);

        System.out.println("Combattre: Robin x bugs1");
        world1.robin.combattre(world1.bugs1);
        world1.robin.affiche();
        System.out.println("nbFleches = " + world1.robin.getnbFleches());
        System.out.println("Personnage: bugs1");
        world1.bugs1.affiche();

        System.out.println("");
        System.out.println("Combattre: Robin x bugs2");
        world1.robin.combattre(world1.bugs2);
        world1.robin.affiche();
        System.out.println("nbFleches = " + world1.robin.getnbFleches());
        System.out.println("Personnage: bugs2");
        world1.bugs2.affiche();
        System.out.println("");

        System.out.println("Combattre: GuillaumeT x bugs1");
        world1.guillaumeT.combattre(world1.bugs1);
        world1.guillaumeT.affiche();
        System.out.println("nbFleches = " + world1.guillaumeT.getnbFleches());
        System.out.println("Personnage: bugs1");
        world1.bugs1.affiche();
        System.out.println("");

        System.out.println("Combattre: GuillaumeT x bugs2");
        world1.guillaumeT.combattre(world1.bugs2);
        world1.guillaumeT.affiche();
        System.out.println("nbFleches = " + world1.guillaumeT.getnbFleches());
        System.out.println("Personnage: bugs2");
        world1.bugs2.affiche();

        System.out.println("");
        System.out.println("Combattre: grosBill x wolfie");
        world1.grosBill.combattre(world1.wolfie);
        world1.grosBill.affiche();
        System.out.println("Personnage: wolfie");
        world1.wolfie.affiche();

        System.out.println("");
        System.out.println("//////////////////////////////// FIN TEST COMBATTRE ////////////////////////////////");
        System.out.println("");
        System.out.println("//////////////////////////////// TEST POTION ////////////////////////////////");
        System.out.println("");

        world1.potion1.getpos().setX(world1.grosBill.getpos().getX());
        world1.potion1.getpos().setY(world1.grosBill.getpos().getY());
        if (world1.grosBill.getpos().getX() == world1.potion1.getpos().getX() && world1.grosBill.getpos().getY() == world1.potion1.getpos().getY()) {
            world1.grosBill.setptVie(world1.grosBill.getptVie() + world1.potion1.getptVie());
            world1.potion1 = null;
        }
        world1.grosBill.affiche();
        System.out.println(world1.potion1);

        System.out.println("//////////////////////////////// FIN TEST POTION ////////////////////////////////");
        long fin = System.nanoTime();
        System.out.println("temps en ns: " + (fin - debut));
    }
}
