public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int valor) {
        if (this.verificarPrimalidade(valor)) {
            System.out.println("É um alor primo");
        } else {
            System.out.println("Não é um valor primo");
        }
    }
}
