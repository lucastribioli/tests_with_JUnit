import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(3, 7);

        Assertions.assertEquals(10, soma);
    }

    @Test
    public void deveriaSomarDoisNumerosNegativos(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(-3, -7);

        Assertions.assertEquals(-10, soma);
    }

    @Test
    public void deveriaSomarDoisNumerosMisturadoNegativosEPositivos(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(3, -7);

        Assertions.assertEquals(-4, soma);
    }
}
