public class TipoChamadoCertificado implements TipoChamado {
    private static TipoChamadoCertificado instancia = new TipoChamadoCertificado();
    private TipoChamadoCertificado() {}
    public static TipoChamadoCertificado getInstancia() { return instancia; }
}