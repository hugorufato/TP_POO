/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**
 *
 * @author ADM
 */
public class Personnage {
    
   private String nom;
   private int ptVie,degAtt,ptPar,pageAtt,pagePar,distAttMax;
   private Point2D pos;
   
public Personnage(String n,int pV,int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
   this.nom = n;
   this.ptVie = pV;
   this.degAtt = dA;
   this.ptPar = pPar;
   this.pageAtt = paAtt;
   this.pagePar = paPar;
   this.distAttMax = dMax;
   this.pos = p;
   }
public Personnage(Personnage perso){
   this.nom = perso.nom;
   this.ptVie = perso.ptVie;
   this.degAtt = perso.degAtt;
   this.ptPar = perso.ptPar;
   this.pageAtt = perso.pageAtt;
   this.pagePar = perso.pagePar;
   this.distAttMax = perso.distAttMax;
   this.pos = new Point2D(perso.pos);
}
public Personnage(){
   this.nom = "Personnage_vide";
   this.ptVie = 0;
   this.degAtt = 0;
   this.ptPar = 0;
   this.pageAtt = 0;
   this.pagePar = 0;
   this.distAttMax = 0;
   this.pos = new Point2D();
}


//Set functions
public void setNom(String n){
nom = n;
}
public void setptVie(int pt){
ptVie = pt;
}
public void setdegAtt(int da){
degAtt = da;
}
public void setptPar(int ppar){
ptPar = ppar;
}
public void setpageAtt(int pat){
pageAtt = pat;
}
public void setpagePar(int par){
pagePar = par;
}
public void setdistAttMax(int datt){
distAttMax = datt;
}
public void setpos(Point2D po){
pos = po;
}


//Get functions
public String getNom(){
return nom;
}
public int getptVie(){
return ptVie;
}
public int getdegAtt(){
return degAtt;
}
public int getptPar(){
return ptPar;
}
public int getpageAtt(){
return pageAtt;
}
public int getpagePar(){
return pagePar;
}
public int getdistAttMax(){
return distAttMax;
}
public Point2D getpos(){
return pos;
}
    
//Deplace
public void deplace(int x, int y){
pos.translate(x,y);
}

//Affiche
public void affiche(){
System.out.println("Personnage: "+nom);
System.out.println("ptVie: "+ptVie+"; degAtt: "+degAtt+"; ptPar: "+ptPar+"; pageAtt: "+pageAtt);
System.out.println("pagePar: "+pagePar+"; distAttMax: "+distAttMax+"; Pos: ["+pos.getX()+";"+pos.getY()+"]");
}


}
