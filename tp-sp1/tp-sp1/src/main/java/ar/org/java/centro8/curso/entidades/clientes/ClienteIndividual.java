package ar.org.java.centro8.curso.entidades.clientes;
import lombok.ToString;


@ToString(callSuper = true)
public class ClienteIndividual extends Cliente {
   private String nombre;
   private String apellido;
   private String dni;

   public ClienteIndividual(int numero, String string, String string2, String i) {
      super(numero);
      this.nombre = nombre;
      this.apellido = apellido;
      this.dni = dni;
   }

}
