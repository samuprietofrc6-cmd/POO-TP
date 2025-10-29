package ar.org.java.centro8.curso.entidades.test;

import ar.org.java.centro8.curso.entidades.clientes.Cliente;
import ar.org.java.centro8.curso.entidades.clientes.ClienteEmpresa;
import ar.org.java.centro8.curso.entidades.clientes.ClienteIndividual;

public class TestCliente {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente(2345);
    System.out.println(cliente1);  

    ClienteEmpresa cliente2 = new ClienteEmpresa(2345, "302782837", "florestarugby");
    System.out.println(cliente2);
      
    ClienteIndividual cliente3 = new ClienteIndividual(3678,"samuel","prieto","40937087");
    System.out.println(cliente3);
      
}

}