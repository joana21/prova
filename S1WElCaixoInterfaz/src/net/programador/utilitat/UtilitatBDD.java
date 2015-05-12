/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.programador.utilitat;

import net.programador.baseDD.InterficiBDD;

/**
 *
 * @author alumne
 */
public class UtilitatBDD {

    /**
     *
     * @param object
     */
    public void insert(InterficiBDD object){
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        System.out.println(object.insert());
    }

    /**
     *
     * @param object
     */
    public void update(InterficiBDD object){
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        System.out.println(object.update());
    }

    /**
     *
     * @param object
     */
    public void delete(InterficiBDD object){
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        System.out.println(object.delete());
        
    }
}
