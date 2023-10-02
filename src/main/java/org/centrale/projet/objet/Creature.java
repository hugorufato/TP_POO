/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author ADM
 */
public class Creature {
    
   private int ptVie,degAtt,ptPar,pageAtt,pagePar;
   private Point2D pos;
   
   public Creature(int pV,int dA, int pPar, int paAtt, int paPar, Point2D p){
   this.ptVie = pV;
   this.degAtt = dA;
   this.ptPar = pPar;
   this.pageAtt = paAtt;
   this.pagePar = paPar;
   this.pos = p;
   }
   
   public Creature(Creature c){
   this.ptVie = c.ptVie;
   this.degAtt = c.degAtt;
   this.ptPar = c.ptPar;
   this.pageAtt = c.pageAtt;
   this.pagePar = c.pagePar;
   this.pos = new Point2D(c.pos);
   }
   
   public Creature(){
   this.ptVie = 10;
   this.degAtt = 1;
   this.ptPar = 1;
   this.pageAtt = 75;
   this.pagePar = 20;
   this.pos = new Point2D();  
   
   }
   
    //SET FUNCTIONS
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
    
    
    //GET FUNCTIONS
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
    
    //DEPLACE
    public void deplace(){
        Random generateurAleatoire = new Random();
        int rX = generateurAleatoire.nextInt(2);
        int rY = generateurAleatoire.nextInt(2);
        pos.translate(rX,rY);
    }
    
    //AFFICHE
    public void afficheG(){
    System.out.println("ptVie: "+ptVie+"; degAtt: "+degAtt+"; ptPar: "+ptPar+"; pageAtt: "+pageAtt);
    System.out.println("pagePar: "+pagePar+"; Pos: ["+pos.getX()+";"+pos.getY()+"]");
    }
    
    
}
