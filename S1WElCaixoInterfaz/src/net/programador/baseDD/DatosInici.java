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
     * @param object
     * @return
     */
    public int insert(InterficiBDD object){
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        String insert = object.insert();
        if (insert.equalsIgnoreCase(insert)){
            System.out.println(insert);
        }else{
            
        }
        return 1;
    }

    /**
     *Metodo que torna un numero de columnas afectada de metodo delete
     * @param object
     * @return
     */
    public int delete(InterficiBDD object){
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        String delete = object.delete();
        if (delete.equalsIgnoreCase(delete)){
            System.out.println(delete);
        }else{
            
        }
        return 1;
    }

    /**
     *Metodo que torna un numero de columnas afectada de metodo update
     * @param object
     * @return
     */
    public int update(InterficiBDD object){
        System.out.println("DadesObjecte");
        System.out.println(object.toString());
        String update = object.update();
        if (update.equalsIgnoreCase(update)){
            System.out.println(update);
        }else{
            
        }
        return 1;
    }
    
}
