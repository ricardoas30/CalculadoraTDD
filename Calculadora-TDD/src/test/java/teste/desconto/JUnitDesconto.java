package teste.desconto;

import br.edu.utfpr.calculadora.tdd.CalculadoraTDD;
import br.edu.utfpr.calculadora.tdd.Cargo;
import br.edu.utfpr.calculadora.tdd.Funcionario;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Ricardo A. Silveira
 */
public class JUnitDesconto {
    CalculadoraTDD valida;
    
    public JUnitDesconto() {
       this.valida = new CalculadoraTDD();
    }
    
    @Test
    public void teste01() {
        // Testando o cargo Desenvolvedor, valor esperado 4000
        assertEquals(valida.Funcionario(new Funcionario("Ricardo Alexandre Silveira", "ricardoas30@gmail.com", Cargo.DESENVOLVEDOR, (float) 5000.00)), 4000.00, 0);
    }
    @Test
    public void teste02() {
        // Testando o cargo Gerente, valor esperado 2000
        assertEquals(valida.Funcionario(new Funcionario("Henrique", "henrique@hotmail.com", Cargo.GERENTE, (float) 2500.00)), 2000.00, 0);
    }
    @Test
    public void teste03() {
        // Testando o cargo Testador, valor esperado 467.50
        assertEquals(valida.Funcionario(new Funcionario("Manuel", "manuel@uol.com.br", Cargo.TESTADOR, (float) 550.00)), 467, 0);
    }
    @Test
    public void teste04() {
        // Testando o cargo Testador, valor esperado 467.50
        assertEquals(valida.Funcionario(new Funcionario("Julia Souza", "ju.souza@terra.com", Cargo.TESTADOR, (float) 550.00)), 467.50, 0);
    }
    @Test
    public void teste05() {
        // Testando o cargo DBA, valor esperado 1537.50
        assertEquals(valida.Funcionario(new Funcionario("Manoela", "manu@gmail.com", Cargo.DBA, (float) 2050.00)), 1537.50, 0);
    }
    @Test
    public void teste06() {
        // Testando o metodo, not null
        assertNotNull(valida.Funcionario(new Funcionario(null, null, null, 0)));
    }
}
