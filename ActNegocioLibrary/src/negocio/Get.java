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
public class Get { // La clase get que se usuara en ImpDAOJson
    Cliente[] usuarios; // Aqui se guarda la clase Cliente que se leera en el gson
    
    public Get(){}

    public Get(Cliente[] usuarios) {
        this.usuarios = usuarios;
    }

    public Cliente[] getUsuario() {
        return usuarios;
    }

    public void setUsuario(Cliente[] usuario) {
        this.usuarios = usuario;
    }
}
