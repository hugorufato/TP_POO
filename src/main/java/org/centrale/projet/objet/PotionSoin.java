/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet;

/**
 *
 * @author ADM
 */
public class PotionSoin extends Objet {
    
    public PotionSoin(int pt, Point2D pos){
    super(pt,0,0,0,0,pos);
    }
    public PotionSoin(PotionSoin p){
     super((Objet) p);
    }
    public PotionSoin(){
    super(5,0,0,0,0,new Point2D());
    }
}
