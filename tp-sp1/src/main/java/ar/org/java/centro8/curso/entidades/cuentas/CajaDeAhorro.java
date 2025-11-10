package ar.org.java.centro8.curso.entidades.cuentas;

import lombok.ToString;

@ToString(callSuper = true)
public class CajaDeAhorro extends Cuenta{
    private double tasa;
    public CajaDeAhorro(int numero, float saldo, String clienteAsociado, double tasa) {
        super(numero, saldo, clienteAsociado);
        this.tasa = tasa;
    }

    @Override
    public void depositar(float monto){
        
    }


   
}