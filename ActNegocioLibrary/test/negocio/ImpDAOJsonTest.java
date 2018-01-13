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
        instance = new ImpDAOJson();
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
        instance.setClientEmpresa(nombre, apellido, cedula);
    }

    /**
     * Test of getOneClientEmpresa method, of class ImpDAOJson.
     */
    @Test
    public void testGetOneClientEmpresa() throws Exception {
        System.out.println("getOneClientEmpresa");
        int id = 0;
        Cliente result = instance.getOneClientEmpresa(id);
        
        if(id != 0)
        assertNotNull(result);
        else
        assertNull(result);
        
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    
}
