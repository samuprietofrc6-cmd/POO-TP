package ar.org.java.centro8.curso.entidades.cuentas;

import lombok.ToString;

@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta{
    private double montoAutorizado;
    public CuentaCorriente(int numero, float saldo, String clienteAsociado double tasa) {
        super(numero, saldo, clienteAsociado);
        this.montoAutorizado = montoAutorizado;
    }
    
 
}
