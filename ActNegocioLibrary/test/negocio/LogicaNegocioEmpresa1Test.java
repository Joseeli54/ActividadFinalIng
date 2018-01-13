/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elias Barrientos
 */
public class LogicaNegocioEmpresa1Test {
    LogicaNegocioEmpresa1 instance;
    
    @Before
    public void setUp() {
          instance = new LogicaNegocioEmpresa1();
    }

    /**
     * Test of register_Client method, of class LogicaNegocioEmpresa1.
     */
    @Test
    public void testRegister_Client() {
        System.out.println("register_Client");
        String nombre = "Jose";
        String apellido = "Elias";
        String cedula = "26089396";
        instance.register_Client(nombre, apellido, cedula);
    }

    /**
     * Test of verify_Clients method, of class LogicaNegocioEmpresa1.
     */
    @Test
    public void testVerify_Clients() {
        System.out.println("verify_Clients");
        int id = 26089396;
        boolean expResult = true;
        boolean result = instance.verify_Clients(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of Consulta_client method, of class LogicaNegocioEmpresa1.
     */
    @Test
    public void testConsulta_client() {
        System.out.println("Consulta_client");
        int id = 26089396;
        instance.Consulta_client(id);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    
}
