/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.programador.excepcion;

/**
 *
 * @author alumne
 */
public class BDDExcepcion extends Exception {

    /**
     * Creates a new instance of <code>BaseDatos</code> without detail message.
     */
    public BDDExcepcion() {
        super();
    }

    /**
     * Constructs an instance of <code>BaseDatos</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BDDExcepcion(String msg) {
        msg="Sentencia DML incorrecta";
    }
}
