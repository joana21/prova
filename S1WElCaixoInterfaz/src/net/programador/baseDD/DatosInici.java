/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.programador.baseDD;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.programador.excepcion.BDDExcepcion;

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
     * @param object
     * @return
     */
    public int insert(InterficiBDD object){
        System.out.println("DadesObjecte");
        String insert = object.insert();
        
        try {
            if (insert.startsWith("Insert")){
                System.out.println(insert);
            }else{
                throw new BDDExcepcion("Sentencia DML incorreta");
            }
        } catch (BDDExcepcion ex) {
                ex.getMessage();
            }
        return 1;
    }

    /**
     *Metodo que torna un numero de columnas afectada de metodo delete
     * @param object
     * @return
     * @throws net.programador.excepcion.BDDExcepcion
     */
    public int delete(InterficiBDD object) throws BDDExcepcion{
        System.out.println("DadesObjecte");
        String delete = object.delete();
        if (delete.startsWith("Delete")){
            System.out.println(delete);
        }else{
            throw new BDDExcepcion("Sentencia DML incorreta");
        }
        return 1;
    }

    /**
     *Metodo que torna un numero de columnas afectada de metodo update
     * @param object
     * @return
     * @throws net.programador.excepcion.BDDExcepcion
     */
    public int update(InterficiBDD object) throws BDDExcepcion{
        System.out.println("DadesObjecte");
        String update = object.update();
        if (update.startsWith("Update")){
            System.out.println(update);
        }else{
            throw new BDDExcepcion("Sentencia DML incorreta");
        }
        return 1;
    }

    public DatosInici(String ipServidor, String nomBaseDeDatos, String nomUsuari, String contrasenya) {
        this.ipServidor = ipServidor;
        this.nomBaseDeDatos = nomBaseDeDatos;
        this.nomUsuari = nomUsuari;
        this.contrasenya = contrasenya;
    }
}
