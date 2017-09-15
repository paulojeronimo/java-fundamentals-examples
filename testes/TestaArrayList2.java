import java.util.ArrayList;

public class TestaArrayList2 {
  public static void listaEmpresas(ArrayList<String> empresas) {
    System.out.println("Empresas cadastradas:");
    for(String empresa: empresas)
      System.out.println(empresa);
  }

  public static void main(String[] a) {
    ArrayList<String> empresas = new ArrayList<>();

    empresas.add("Oracle");
    empresas.add("RedHat");
    empresas.add("IBM");

    empresas.add(1, "Pivotal");

    listaEmpresas(empresas);

    if (empresas.contains("Pivotal"))
      empresas.remove("Pivotal");

    listaEmpresas(empresas);
  }
}
