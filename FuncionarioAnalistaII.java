public class FuncionarioAnalistaII extends Funcionario {
    public FuncionarioAnalistaII(Funcionario superior) {
        listaChamados.add(TipoChamadoFirewall.getInstancia());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() { return "Analista II"; }
}