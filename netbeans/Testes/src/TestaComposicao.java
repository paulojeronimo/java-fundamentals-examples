interface Operacao {
  public boolean run(Integer e);
}

class Config {
  Config stream() {
    return this;
  }
  Config filter(Operacao e) {
    return this;
  }
  Config mapToDouble() {
    return this;
  }
  int sum() {
    return 1;
  }
}

public class TestaComposicao {
  public static void main(String[] args) {
    new Config().stream()
      .filter(e -> e % 2 == 0)
      .mapToDouble()
      .sum();
  }
}
