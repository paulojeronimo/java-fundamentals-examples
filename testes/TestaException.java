class SaldoInsuficiente extends Exception {
}

class ContaCorrente {
  double saldo;
  double limite;
  ContaCorrente(double saldoInicial, double limite) {
    saldo = saldoInicial;
  }
  void sacar(double valor) throws SaldoInsuficiente {
    double saldo = this.saldo;
    saldo -= valor;
    if (saldo + limite < 0)
      throw new SaldoInsuficiente();
    this.saldo = saldo;
  }
}

public class TestaException {

  public static String stringInicial() {
    return null;
  }

  public static void main(String[] args) {
    String s = stringInicial();

    int i = 10;
    if (i > 10)
      s = "O valor e maior que 10";

    try {
      System.out.println(s.toUpperCase());
      // ...
      // ...
      // ...

    } catch (NullPointerException erro) {
      System.err.println("Opa ... avise ao programador que ele fez uma merdinha ...");
      System.err.println("O erro foi: " + erro);
    }

    ContaCorrente cc = new ContaCorrente(10, 2);
    try {
      if (args.length != 1) {
        System.out.println("Favor informar um numero!");
        System.exit(1);
      }
      double valor = Double.parseDouble(args[0]);
      cc.sacar(valor);
    } catch (SaldoInsuficiente e) {
      System.out.println("Saldo insuficiente para o saque!");
      System.exit(2);
    } catch (NumberFormatException e) {
      System.out.println("Favor informar um numero valido!");
      System.exit(3);
    } catch (Exception e) {
      System.err.println("Ocorreu um erro. Verifique!");
      System.exit(4);
    }
  }
}
