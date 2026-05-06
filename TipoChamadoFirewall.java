public class TipoChamadoFirewall implements TipoChamado {
    private static TipoChamadoFirewall instancia = new TipoChamadoFirewall();
    private TipoChamadoFirewall() {}
    public static TipoChamadoFirewall getInstancia() { return instancia; }
}