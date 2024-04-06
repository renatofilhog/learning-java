public class NumerosPrimos {

    public boolean verificarPrimalidade(int valor) {
        boolean resto2 = valor % 2 == 0;
        boolean resto3 = valor % 3 == 0;
        boolean resto5 = valor % 5 == 0;
        boolean resto7 = valor % 7 == 0;
        boolean resto11 = valor % 11 == 0;

        return !resto2&& !resto3 && !resto5 && !resto7 && !resto11;
    }

    public void listarPrimos(int quantidade) {
        int qty = 0;
        int valorCorrente  = 2;
        StringBuilder str = new StringBuilder("Os " + qty + " números primos são: | ");
        while (quantidade > qty) {
            if (this.verificarPrimalidade(valorCorrente)) {
                str.append(valorCorrente).append(" | ");
            }
            qty++;
        }
        System.out.println(str);
    }
}
