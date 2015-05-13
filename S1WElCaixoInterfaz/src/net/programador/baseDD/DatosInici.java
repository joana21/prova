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
public class DatosInici {
    
    /**
     *IP Servidor
     */
    public String ipServidor;

    /**
     *Nombre de Base de Datos
     */
    public String nomBaseDeDatos;

    /**
     *Nombre de Usuario
     */
    public String nomUsuari;

    /**
     *Contraseña de usuario
     */
    public String contrasenya;
        
    /**
     *Metodo que torna un numero de columnas afectada de metodo insert
     * @param sentencia
     * @param object
     * @return
     */
    public int insert(String sentencia, InterficiBDD object){
        
        return 1;
    }

    /**
     *Metodo que torna un numero de columnas afectada de metodo delete
     * @param sentencia
     * @param object
     * @return
     */
    public int delete(String sentencia, InterficiBDD object){
        
        return 1;
    }

    /**
     *Metodo que torna un numero de columnas afectada de metodo update
     * @param sentencia
     * @param object
     * @return
     */
    public int update(String sentencia, InterficiBDD object){
        
        return 1;
    }

    public DatosInici(String ipServidor, String nomBaseDeDatos, String nomUsuari, String contrasenya) {
        this.ipServidor = ipServidor;
        this.nomBaseDeDatos = nomBaseDeDatos;
        this.nomUsuari = nomUsuari;
        this.contrasenya = contrasenya;
    }
}
