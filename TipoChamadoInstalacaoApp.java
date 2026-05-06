public class TipoChamadoInstalacaoApp implements TipoChamado {
    private static TipoChamadoInstalacaoApp instancia = new TipoChamadoInstalacaoApp();
    private TipoChamadoInstalacaoApp() {}
    public static TipoChamadoInstalacaoApp getInstancia() { return instancia; }
}