
package org.centrale.projet.objet;
public class Point2D {
   private int x;
   private int y;

    //San parametres
public Point2D(){
    x=0;
    y=0;
}

//Creation a partir de deux parametres
public Point2D(int v1, int v2){
x=v1;
y=v2;
}

//Constructeur de recopie
public Point2D(Point2D p){
x = p.x;
y = p.y;
}

//SetX
public void setX(int v1){
x = v1;
}

//SetY
public void setY(int v2){
y = v2;
}

//GetX
public int getX(){
return x;
}

//GetY
public int getY(){
return y;
}

//SetPosition
public void setPosition(int v1, int v2){
x = v1;
y = v2;
}

//Translate
public void translate(int dx,int dy){
x = x+dx;
y = y+dy;
}

//Affichage
public void affiche(){
System.out.println("["+x+";"+y+"]");
}

//Distance
public double distance(Point2D p){
return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.
y),2));
}


}
