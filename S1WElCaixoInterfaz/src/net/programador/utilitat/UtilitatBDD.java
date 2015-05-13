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
     * @param sentencia
     * @param object
     */
    public void insert(String sentencia, InterficiBDD object){
        System.out.println(sentencia);
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        System.out.println(object.insert());
    }

    /**
     *
     * @param sentencia
     * @param object
     */
    public void update(String sentencia, InterficiBDD object){
        System.out.println(sentencia);
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        System.out.println(object.update());
    }

    /**
     *
     * @param sentencia
     * @param object
     */
    public void delete(String sentencia, InterficiBDD object){
        System.out.println(sentencia);
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        System.out.println(object.delete());        
    }
}
