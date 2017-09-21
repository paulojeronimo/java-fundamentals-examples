import java.util.ArrayList;

class Empresa {
  String nome;
  public Empresa(String nome) { this.nome = nome; }
  @Override
  public String toString() { return nome; }
}

public class TestaArrayList2 {
  public static void listaEmpresas(ArrayList<Empresa> empresas) {
    System.out.println("Empresas cadastradas:");
    for(Empresa empresa: empresas)
      System.out.println(empresa);
  }

  public static void main(String[] a) {
    ArrayList<Empresa> empresas = new ArrayList<>();

    empresas.add(new Empresa("Oracle"));
    empresas.add(new Empresa("RedHat"));
    empresas.add(new Empresa("IBM"));

    Empresa pivotal = new Empresa("Pivotal");
    empresas.add(1, pivotal);

    listaEmpresas(empresas);

    if (empresas.contains(pivotal))
      empresas.remove(pivotal);

    listaEmpresas(empresas);
  }
}
