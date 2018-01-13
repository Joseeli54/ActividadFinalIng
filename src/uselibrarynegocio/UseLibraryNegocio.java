/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uselibrarynegocio;
import java.util.Scanner;
import negocio.LogicaNegocio;
import negocio.LogicaNegocioEmpresa1;

public class UseLibraryNegocio {

    public static void main(String[] args) {
     LogicaNegocio Empresa = new LogicaNegocioEmpresa1(); //Se crea la logica de la empresa1
        
        System.out.println("Bienvenido a Empresa Elias C.A.");
        System.out.println("¿Desea Pertenecer? (S/N)");
        System.out.print("Op: ");
        Scanner Scan = new Scanner(System.in);
        char Op = Scan.nextLine().charAt(0); // Escriba S para poder ingresar
        
        if(Op == 'S' || Op == 's'){ // Si se desea ingresar al sistema
            
            System.out.println("Cliente \n");
            System.out.print("Nombre: ");
            String nombre = Scan.nextLine();
            System.out.print("Apellido: ");
            String apellido = Scan.nextLine();
            System.out.print("Cedula: ");
            String cedula = Scan.nextLine();
            
            Empresa.register_Client(nombre, apellido, cedula); // Me registra el usuario
            Empresa.Consulta_client(Integer.parseInt(cedula)); // Me lo muestra
        }
    }   
}
