package impl;
import interf.*;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        StringBuilder str = new StringBuilder("Tabuada número "+numero+"\n");
        for (int i=1; i<=10; i++){
            str.append(numero+" x "+i+ "\t=\t"+ numero*i + "\n");
        }
        System.out.println(str);
    }
}
