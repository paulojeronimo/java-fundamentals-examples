package util;

enum Cor { PRETO, AZUL, VERMELHO }

public class TestaPilha {
  public static void main(String[] args) {
    InsereContemRemove pilhaDeCores = new Pilha(3);

    pilhaDeCores.inserir(Cor.PRETO);
    pilhaDeCores.inserir(Cor.AZUL);
    pilhaDeCores.inserir(Cor.VERMELHO);

    // Eu não deveria conseguir fazer isto:
    //pilhaDeCores.objects = null; // <- após o uso de private em objects isso é impossível!

    Cor cor = null;
    while (pilhaDeCores.contemObjetos()) {
      cor = (Cor) pilhaDeCores.remover();
      System.out.println("Desempilhando a cor " + cor);      
    }
  }
}
