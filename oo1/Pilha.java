public class Pilha {
  int quantidade;
  Vinho[] vinhos;
  int posicao;

  public Pilha(int quantidade) {
    this.quantidade = quantidade;
    vinhos = new Vinho[quantidade];
  }

  boolean inserir(Vinho vinho) {
    if (posicao >= quantidade)
      return false;
      
    vinhos[posicao++] = vinho;
    return true;
  }

  Vinho remover() {
    if (temVinhos())
      return vinhos[--posicao];
    return null;
  }

  boolean temVinhos() {
    return posicao > 0;
  }
}
