/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.FileNotFoundException;
import java.io.IOException;
                                ////////////////////////////////////////////////////////////////////////////////
public interface InterfazDAO { // Interface que contiene los metodos que seran usados por clases concretas   //
	                          // Para poder obtener datos y guardar en diferentes formatos                  //
	                         //            en este caso los guardare en el formato json                    //
	                        ////////////////////////////////////////////////////////////////////////////////
    
    public Cliente[] getClientsEmpresa() throws IOException;
    public void setClientEmpresa(String nombre, 
                                 String apellido, 
                                 String Cedula) throws FileNotFoundException, IOException;
    public Cliente getOneClientEmpresa(int id) throws FileNotFoundException, IOException;
    
}
