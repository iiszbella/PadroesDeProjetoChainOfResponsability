import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChamadoTest {

    private Funcionario configurarCadeia() {
        Funcionario especialista = new FuncionarioEspecialista(null);
        Funcionario analistaIII = new FuncionarioAnalistaIII(especialista);
        Funcionario analistaII = new FuncionarioAnalistaII(analistaIII);
        Funcionario analistaI = new FuncionarioAnalistaI(analistaII);
        return new FuncionarioAtendenteSuporte(analistaI);
    }

    @Test
    public void testChamadoInstalacaoApp() {
        Funcionario atendente = configurarCadeia();
        Chamado chamado = new Chamado(TipoChamadoInstalacaoApp.getInstancia());
        String resultado = atendente.atenderChamado(chamado);
        System.out.println(resultado); 
        assertEquals("Atendente de Suporte resolveu o chamado.", resultado);
    }

    @Test
    public void testChamadoCertificado() {
        Funcionario atendente = configurarCadeia();
        Chamado chamado = new Chamado(TipoChamadoCertificado.getInstancia());
        String resultado = atendente.atenderChamado(chamado);
        System.out.println(resultado);
        assertEquals("Analista I resolveu o chamado.", resultado);
    }

    @Test
    public void testChamadoFirewall() {
        Funcionario atendente = configurarCadeia();
        Chamado chamado = new Chamado(TipoChamadoFirewall.getInstancia());
        String resultado = atendente.atenderChamado(chamado);
        System.out.println(resultado);
        assertEquals("Analista II resolveu o chamado.", resultado);
    }

    @Test
    public void testChamadoProjeto() {
        Funcionario atendente = configurarCadeia();
        Chamado chamado = new Chamado(TipoChamadoProjeto.getInstancia());
        String resultado = atendente.atenderChamado(chamado);
        System.out.println(resultado);
        assertEquals("Analista III resolveu o chamado.", resultado);
    }

    @Test
    public void testChamadoArquitetura() {
        Funcionario atendente = configurarCadeia();
        Chamado chamado = new Chamado(TipoChamadoArquitetura.getInstancia());
        String resultado = atendente.atenderChamado(chamado);
        System.out.println(resultado);
        assertEquals("Especialista resolveu o chamado.", resultado);
    }

    @Test
    public void testChamadoNaoReconhecido() {
        Funcionario atendente = configurarCadeia();
        TipoChamado tipoInvalido = new TipoChamado() {}; // tipo inexistente
        Chamado chamado = new Chamado(tipoInvalido);
        String resultado = atendente.atenderChamado(chamado);
        System.out.println(resultado);
        assertEquals("Chamado não pôde ser atendido.", resultado);
    }
}
