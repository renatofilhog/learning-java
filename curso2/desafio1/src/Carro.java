import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Carro {
    String modelo, cor;
    int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public void exibeFichaTecnica() {
        String str = "Modelo: " + this.modelo + "\n";
        str+= "Cor: " + this.cor + "\n";
        str+= "Ano: " + this.ano + "\n";
        str+= "Tempo de fabricado: " + this.getTempoFabricado() + " anos";
        System.out.println(str);
    }

    public int getTempoFabricado() {
        GregorianCalendar hj = new GregorianCalendar();
        int anoHoje = hj.get(Calendar.YEAR);
        return anoHoje - this.ano;
    }
}
