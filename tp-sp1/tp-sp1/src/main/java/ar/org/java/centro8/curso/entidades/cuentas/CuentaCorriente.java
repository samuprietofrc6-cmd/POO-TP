package ar.org.java.centro8.curso.entidades.cuentas;

import lombok.ToString;

@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta{
    private double montoAutorizado;
    public CuentaCorriente(int numero, float saldo) {
        super(numero, saldo);
        this.montoAutorizado = montoAutorizado;
    }
    
    public void depositar(float monto){
         
    } 

}
