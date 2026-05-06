public class TipoChamadoArquitetura implements TipoChamado {
    private static TipoChamadoArquitetura instancia = new TipoChamadoArquitetura();
    private TipoChamadoArquitetura() {}
    public static TipoChamadoArquitetura getInstancia() { return instancia; }
}