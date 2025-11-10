package ar.org.java.centro8.curso.entidades.cuentas;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Cuenta {
    private int numero;
    private float saldo;
    private String clienteAsociado;


    public abstract void depositar(float monto){
        saldo += monto; 
        public void Sumar(int numero1, int numero2);
           System.out.println("operacion realizada con exito");
    } 

    public abstract void extraer(float monto){
        saldo -= monto;
        public void Resta(int numero1, int numero2)
           System.out.println("monto no disponible en este momento");
    }
}
