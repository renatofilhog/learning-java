public class Main {
    public static void main(String[] args) {
        Pessoa renato = new Pessoa("Renato Filho");
        makeLine();
        renato.olaMundo();
        makeLine();
        System.out.println("O dobro de 29435 é: "+Calculadora.dobraPraMim(29435));
        makeLine();
        Musica faroesteCaboclo = new Musica();
        faroesteCaboclo.anoLancamento = 1999;
        faroesteCaboclo.artista = "Legião Urbana";
        faroesteCaboclo.titulo = "Faroeste Cabloco";
        faroesteCaboclo.avaliarMusica(8);
        faroesteCaboclo.avaliarMusica(3);
        faroesteCaboclo.avaliarMusica(9);
        faroesteCaboclo.avaliarMusica(7);
        faroesteCaboclo.exibeFichaTecnica();
        makeLine();
        Carro c3 = new Carro("C3", "Prata", 2009);
        c3.exibeFichaTecnica();
        makeLine();
        Aluno pedro = new Aluno("Pedro Mário", 27);
        pedro.exibeFichaAluno();
        makeLine();
        new Aluno("Flávio Renato", 25).exibeFichaAluno();
        makeLine();
    }

    static void makeLine() {
        System.out.println("=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!");
    }
}