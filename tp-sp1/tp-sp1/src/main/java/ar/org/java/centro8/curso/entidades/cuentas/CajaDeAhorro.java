package ar.org.java.centro8.curso.entidades.cuentas;

import lombok.ToString;

@ToString(callSuper = true)
public class CajaDeAhorro extends Cuenta{
    private int tasa;
    public CajaDeAhorro(int numero, float saldo, int i) {
        super(numero, saldo);
        this.tasa = tasa;
    }


    public void depositar(float monto){
        saldo += monto;
    } 

    public void extraer(float monto){
        saldo -= monto;
    }

    public void cobrarInteres(float monto){
        if(tasa+monto>0) System.out.println("Operacion realizada con exito");
        tasa+=monto;
    }


}