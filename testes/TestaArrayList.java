import java.util.ArrayList;

class Empresa {
  String nome;

  public Empresa(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return nome;
  }
}

public class TestaArrayList {
  public static void main(String[] a) {
    ArrayList<Empresa> empresas = new ArrayList<>();

    empresas.add(new Empresa("Oracle"));
    empresas.add(new Empresa("RedHat"));
    empresas.add(new Empresa("IBM"));

    for(Empresa empresa: empresas)
      System.out.println(empresa);
  }
}
