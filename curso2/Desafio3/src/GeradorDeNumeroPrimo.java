public class GeradorDeNumeroPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int valor) {
        int qty = 0;
        int valorCorrente  = valor+1;
        while (true) {
            if (this.verificarPrimalidade(valorCorrente)) {
                return valorCorrente;
            }
            valorCorrente++;
        }
    }
}
