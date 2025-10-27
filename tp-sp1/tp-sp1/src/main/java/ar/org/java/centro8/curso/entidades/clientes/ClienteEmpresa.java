package ar.org.java.centro8.curso.entidades.clientes;

import lombok.ToString;

@ToString (callSuper = true)
public class ClienteEmpresa extends Cliente{
   private String cuit;
   private String nombreFantasia;

   public ClienteEmpresa(int numero, String string, String string2) {
    super(numero);
    this.cuit = cuit;
    this.nombreFantasia = nombreFantasia;
   }



}
