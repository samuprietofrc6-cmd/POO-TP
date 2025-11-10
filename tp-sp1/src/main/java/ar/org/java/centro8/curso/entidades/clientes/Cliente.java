package ar.org.java.centro8.curso.entidades.clientes;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public abstract class Cliente {
    private int numero;
}