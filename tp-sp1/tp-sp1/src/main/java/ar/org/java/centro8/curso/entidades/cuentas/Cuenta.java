package ar.org.java.centro8.curso.entidades.cuentas;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Cuenta {
    private int numero;
    protected float saldo;


    public void depositar(float monto){
        saldo += monto; 
    } 

    public void extraer(float monto){
        saldo -= monto;
    }


}
