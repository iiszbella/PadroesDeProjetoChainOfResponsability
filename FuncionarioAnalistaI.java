public class FuncionarioAnalistaI extends Funcionario {
    public FuncionarioAnalistaI(Funcionario superior) {
        listaChamados.add(TipoChamadoCertificado.getInstancia());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() { return "Analista I"; }
}
