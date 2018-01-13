/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Elias Barrientos
 */
public abstract class LogicaNegocio {
    
    public abstract void register_Client(String nombre, 
                                         String apellido, 
                                         String cedula);
    public abstract boolean verify_Clients(int id);
    public abstract void Consulta_client(int id);
    
}

