public class FuncionarioEspecialista extends Funcionario {
    public FuncionarioEspecialista(Funcionario superior) {
        listaChamados.add(TipoChamadoArquitetura.getInstancia());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() { return "Especialista"; }
}