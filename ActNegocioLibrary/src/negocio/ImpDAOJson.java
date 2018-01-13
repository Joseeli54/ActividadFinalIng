/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.Reader;
import java.io.Writer;
 
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;

public class ImpDAOJson implements InterfazDAO{ //Clase que se encarga de guardar y leer datos del archivo.json
   //Implementa la interface DAO

    @Override
    public Cliente[] getClientsEmpresa() throws IOException { //Lee todos los clientes de la empresa 
      Gson gson = new GsonBuilder().create(); //Se inicializa la variable gson
      Get lector = new Get(); //Se inicializa el lector
      
      Reader reader = 
      new FileReader("archivo.json"); // Se lee el archivo
      
      lector = gson.fromJson(reader,Get.class); //Se pasan los datos obtenidos
      Cliente[] usuario = lector.getUsuario(); //Se crea un Array de Clientes
      
      return usuario;        
    }

    @Override
    public void setClientEmpresa(String nombre,
                                 String apellido,
                                 String cedula) throws FileNotFoundException, IOException {
    	//Un error del programa es que se necesita tener ya un usuario existente para crear uno nuevo.
    	//Metodo que tiene como objetivo agregar un cliente al archivo.json
        
        
        Cliente[] client = getClientsEmpresa(); //Se leen los usuarios
        
      int id = Integer.parseInt(cedula); // Se crea el id
      Cliente[] user = new Cliente[client.length+1]; // Se crea un nuevo Array de clientes
      
      if(client != null) 
      for(int i=0; i<client.length; i++){ // Se pasan todos los datos de client a user
           user[i] = client[i];  
           if(i+1 == client.length)  // Se crea el nuevo cliente
           user[i+1] = new Cliente(cedula, nombre, 
                   apellido,"No ha comprado", id); 
      }
      else{
           user[0] = new Cliente(cedula, nombre, 
                   apellido,"No ha comprado", id); 
      }
      
      Get get = new Get(user);
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
 
        Writer writer = 
        new FileWriter("archivo.json");
        writer.write(gson.toJson(get)); //Se escribe el archivo.json
        writer.close();      
    }

    @Override
    public Cliente getOneClientEmpresa(int id) throws FileNotFoundException, IOException {
    	//Este metodo solo me devuelve un cliente que sera encontrado gracias a su Id
      Gson gson = new GsonBuilder().create(); //Se inicializa el gson
      Get lector = new Get(); //El lector tambien
      Reader reader = 
      new FileReader("archivo.json"); //Se lee el archivo
      
      lector = gson.fromJson(reader, Get.class); //paso los datos
      Cliente usuario = null; //Inicializo el usuario
      
      if(lector.getUsuario()!= null)
      for(int i=0; i<lector.getUsuario().length; i++){
            if(lector.getUsuario()[i].getId() == id){
                   usuario = lector.getUsuario()[i]; //Paso la informacion si encuentro el usuario
            }
      }
       return usuario; //Si lo encuentro se devuelve el usuario, sino se devuelve null
    }
    
  
}
