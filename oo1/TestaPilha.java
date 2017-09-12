public class TestaPilha {
  public static void main(String[] args) {
    Pilha adega = new Pilha(3);

    Vinho santaFelicidade = new Vinho("Santa Felicidade", "Chile", "Cabernet", "Amadeirado", "Tinto");
    santaFelicidade.engarrafar(2010);

    Vinho casalGarcia = new Vinho("Casal Garcia", "Portugues", "Cabernet", "Frutado", "Branco");
    casalGarcia.engarrafar(2007);

    Vinho bola = new Vinho("Bola", "Italiano", "Merlot", "Envelhecido", "Tinto");
    bola.engarrafar(2017);

    adega.inserir(santaFelicidade);
    adega.inserir(casalGarcia);
    adega.inserir(bola);

    Vinho vinho = null;
    while (adega.temVinhos()) {
      vinho = adega.remover();
      System.out.println("Hoje irei beber o vinho " + vinho.nome + " engarrafado em " + vinho.ano);
    }
  }
}
