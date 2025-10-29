package ar.org.java.centro8.curso.entidades.test;

import ar.org.java.centro8.curso.entidades.cuentas.CajaDeAhorro;
import ar.org.java.centro8.curso.entidades.cuentas.Cuenta;
import ar.org.java.centro8.curso.entidades.cuentas.CuentaCorriente;

public class TestCuenta {
     public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta(234, 12000);
        System.out.println(cuenta1);
        
        CajaDeAhorro cuenta2 = new CajaDeAhorro(341, 19000, 15);
        System.out.println(cuenta2);
        cuenta2.depositar(3000);
        cuenta2.extraer(1000);
        System.out.println(cuenta2.getSaldo());

        CuentaCorriente cuenta3 = new CuentaCorriente(234, 12000, 403000);
        System.out.println(cuenta3);
        cuenta3.depositar(3000);
        cuenta3.extraer(1000);
        System.out.println(cuenta3.getSaldo());


     }
}