public class TestaHighlander {
  public static void main(String args[]) {
    Highlander cristopherLambert = Highlander.getInstance("Cristopher Lambert");
    Highlander seanConnery = Highlander.getInstance("Sean Connery");

    System.out.println("O Highlander e o " + seanConnery.getNome());
  }
}
