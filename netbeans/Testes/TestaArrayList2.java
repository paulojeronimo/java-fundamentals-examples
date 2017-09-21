import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Empresa {
  String nome;
  public Empresa(String nome) { this.nome = nome; }
  @Override
  public String toString() { return nome; }
}

class EmpresaDeTransporte extends Empresa {
  public EmpresaDeTransporte(String nome) {
    super(nome);
  }
}

public class TestaArrayList2 {
  public static void listaEmpresas(String mensagem, 
    List<? extends Empresa> empresas) {
    System.out.println(mensagem);
    empresas.forEach(System.out::println);
    System.out.println();
  }

  public static void main(String[] a) {
    List<Empresa> empresasDeInformatica = new ArrayList<>();
    empresasDeInformatica.add(new Empresa("Oracle"));
    empresasDeInformatica.add(new Empresa("RedHat"));
    empresasDeInformatica.add(new Empresa("IBM"));
    listaEmpresas("Empresas de informática:", empresasDeInformatica);

    List<EmpresaDeTransporte> empresasDeTransporte = 
      Arrays.asList(
        new EmpresaDeTransporte("Araguarina"),
        new EmpresaDeTransporte("TransQualquerCoisa"));
    listaEmpresas("Empresas de transporte:", empresasDeTransporte);

    List<Empresa> empresas = new ArrayList<>(empresasDeTransporte);
    empresas.addAll(empresasDeInformatica);
    listaEmpresas("Todas as empresas:", empresas);

    System.out.println("Adicionando a Pivotal a empresasDeInformatica\n");
    Empresa pivotal = new Empresa("Pivotal");
    empresasDeInformatica.add(1, pivotal);

    if (empresasDeInformatica.contains(pivotal)) {
      System.out.println("Removendo a Pivotal de empresasDeInformatica\n");
      empresasDeInformatica.remove(pivotal);
    }

    listaEmpresas("Empresas de informática:", empresasDeInformatica);
  }
}
