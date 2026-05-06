public class FuncionarioAnalistaIII extends Funcionario {
    public FuncionarioAnalistaIII(Funcionario superior) {
        listaChamados.add(TipoChamadoProjeto.getInstancia());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() { return "Analista III"; }
}