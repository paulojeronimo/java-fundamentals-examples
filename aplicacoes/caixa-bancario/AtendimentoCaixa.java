import util.Fila;

public class AtendimentoCaixa {
  public static void main(String args[]) {
    if (args.length != 1) {
      System.out.println("Uso: java AtendimentoCaixa <numeroDeSenhas>");
      System.exit(0);
    }
    int numeroDeSenhas = Integer.parseInt(args[0]);
    Fila filaDeSenhas = new FilaDeSenhas(numeroDeSenhas);
    for (int i = 0; i < numeroDeSenhas; )
      filaDeSenhas.inserir(new Senha(++i));
    Caixa caixa = new Caixa(filaDeSenhas);
    while (caixa.temAtendimentoAFazer())
      caixa.atender();
  }
}
