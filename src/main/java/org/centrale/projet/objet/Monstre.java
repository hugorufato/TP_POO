/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**
 *
 * @author ADM
 */
public class Monstre {
    
   private int ptVie,degAtt,ptPar,pageAtt,pagePar;
   private Point2D pos;
    
   public Monstre(int pV,int dA, int pPar, int paAtt, int paPar,Point2D p){
   this.ptVie = pV;
   this.degAtt = dA;
   this.ptPar = pPar;
   this.pageAtt = paAtt;
   this.pagePar = paPar;
   this.pos = p;
   }
public Monstre(Monstre m){

   this.ptVie = m.ptVie;
   this.degAtt = m.degAtt;
   this.ptPar = m.ptPar;
   this.pageAtt = m.pageAtt;
   this.pagePar = m.pagePar;
   this.pos = m.pos;
}
public Monstre(){
   this.ptVie = 0;
   this.degAtt = 0;
   this.ptPar = 0;
   this.pageAtt = 0;
   this.pagePar = 0;
   this.pos = new Point2D();
}


//Set functions

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
public void setpos(Point2D po){
pos = po;
}


//Get functions

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
public Point2D getpos(){
return pos;
}
    
//Deplace
public void deplace(int x, int y){
pos.translate(x,y);
}

//Affiche
public void affiche(){
System.out.println("ptVie: "+ptVie+"; degAtt: "+degAtt+"; ptPar: "+ptPar+"; pageAtt: "+pageAtt);
System.out.println("pagePar: "+pagePar+"; Pos: ["+pos.getX()+";"+pos.getY()+"]");
}


}


