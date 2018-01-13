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

public class ImpDAOJson implements InterfazDAO{

    @Override
    public Cliente[] getClientsEmpresa() throws IOException {
      Gson gson = new GsonBuilder().create();
      Get lector = new Get();
      
      Reader reader = 
      new FileReader("archivo.json");
      
      lector = gson.fromJson(reader,Get.class);     
      Cliente[] usuario = lector.getUsuario();
      
      return usuario;
        
    }

    @Override
    public void setClientEmpresa(String nombre,
                                 String apellido,
                                 String cedula) throws FileNotFoundException, IOException {
        
        
        Cliente[] client = getClientsEmpresa();
        
      int id = Integer.parseInt(cedula);
      Cliente[] user = new Cliente[client.length+1];
      
      if(client != null)
      for(int i=0; i<client.length; i++){
           user[i] = client[i];  
           if(i+1 == client.length)
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
        writer.write(gson.toJson(get));
        writer.close();      
    }

    @Override
    public Cliente getOneClientEmpresa(int id) throws FileNotFoundException, IOException {
      Gson gson = new GsonBuilder().create();
      Get lector = new Get();
      Reader reader = 
      new FileReader("archivo.json");
      
      lector = gson.fromJson(reader, Get.class);
      Cliente usuario = null;
      
      if(lector.getUsuario()!= null)
      for(int i=0; i<lector.getUsuario().length; i++){
            if(lector.getUsuario()[i].getId() == id){
                   usuario = lector.getUsuario()[i];
            }
      }
       return usuario;
    }
    
  
}
