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
     *IP del servidor
     */
    public static final String ipServidor="192.108.24.0";

    /**
     *Nombre de base de datos
     */
    public static final String nomBDD="EL Caixo";

    /**
     *Nombre del usuario
     */
    public static final String nomUsuari="Empleado1";

    /**
     *Contraseña de usuario
     */
    public static final String contrasenya="caixo";
    
    /**
     *Metodo para insertar
     * @param nom
     * @return
     */
    public int insert(String nom);

    /**
     **Metodo para actualizar
     * @param nom
     * @return
     */
    public int update(String nom);

    /**
     **Metodo para borrar
     * @param nom
     * @return
     */
    public int delete(String nom);
}