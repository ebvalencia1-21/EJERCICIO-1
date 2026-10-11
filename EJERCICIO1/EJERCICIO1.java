/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1;
/**
 *
 * @author PILARHUILCA
 */
import java.util.Scanner;
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        CuentaBancaria cuenta = null;
        
        do {
            System.out.println("==MENU BANCO DE LA ESPE==");
            System.out.println("1. Creacion de Cuenta Bancaria");
            System.out.println("2. Deposito");
            System.out.println("3. Retiro");
            System.out.println("4. Mostrar Datos de la Cuenta Bancaria");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("");
                    System.out.println("===CREACION CUENTA BANCARIA");
                    System.out.println("Nombre del Titular");
                    String nombre = sc.nextLine();
                    System.out.println("Apellido del Titular");
                    String apellido = sc.nextLine();
                    System.out.println("Tipo de cuenta");
                    String tipocuenta = sc.nextLine();
                    System.out.println("Saldo Inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    
                    
                    cuenta = new CuentaBancaria(nombre, apellido, tipocuenta, saldo); 
                    break;

                case 2:
                    //cuenta = new CuentaBancaria();
                    System.out.println("Ingrese monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito); 
                    break;
                    
                case 3:
                    System.out.println("Ingrese el monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                    
                case 4:
                    cuenta.mostrarSaldo(); 
                    break;
                    
                case 5: 
                    break;
                    
                default:
                    System.out.println("Opcion no valida..!!");
                    break;
            }
                
        } while(op != 5);
        sc.close();
    }
}
