/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.programador.baseDD;

/**
 *
 * @author alumne
 */
public interface InterficiBDD {

    /**
     *Metodo para insertar
     * @return
     */
    public String insert();

    /**
     **Metodo para actualizar
     * @return
     */
    public String update();

    /**
     **Metodo para borrar
     * @return
     */
    public String delete();
}