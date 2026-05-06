public class FuncionarioAtendenteSuporte extends Funcionario {
    public FuncionarioAtendenteSuporte(Funcionario superior) {
        listaChamados.add(TipoChamadoInstalacaoApp.getInstancia());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() { return "Atendente de Suporte"; }
}