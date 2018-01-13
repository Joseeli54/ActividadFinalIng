/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elias Barrientos
 */
public class ImpDAOJsonTest {
    ImpDAOJson instance;
    
    @Before
    public void setUp() {
        instance = new ImpDAOJson(); //Inicializo ImpDAOJson
    }

    /**
     * Test of setClientEmpresa method, of class ImpDAOJson.
     */
    @Test
    public void testSetClientEmpresa() throws Exception {
        System.out.println("setClientEmpresa");
        String nombre = "Jose";
        String apellido = "Elias";
        String cedula = "26089396";
        instance.setClientEmpresa(nombre, apellido, cedula); //Creo la instance de setClientEmpresa
    }

    /**
     * Test of getOneClientEmpresa method, of class ImpDAOJson.
     */
    @Test
    public void testGetOneClientEmpresa() throws Exception {
        System.out.println("getOneClientEmpresa");
        int id = 0;
        Cliente result = instance.getOneClientEmpresa(id); //Busco un id en expecifico
        
        if(id != 0) //Si el id es diferente de cero se comprueba si no es nulo
        assertNotNull(result);
        else
        assertNull(result); // Si el id es cero se comprueba que es nulo
        
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    
}
