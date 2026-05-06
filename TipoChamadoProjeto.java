public class TipoChamadoProjeto implements TipoChamado {
    private static TipoChamadoProjeto instancia = new TipoChamadoProjeto();
    private TipoChamadoProjeto() {}
    public static TipoChamadoProjeto getInstancia() { return instancia; }
}