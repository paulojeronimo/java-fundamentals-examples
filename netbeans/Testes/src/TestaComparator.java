
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class TestaComparator {

    public static void main(String args[]) {
        List<String> nomes = Arrays.asList(
                "Paulo", "Manuel", "Jair", "Robério");

        Comparator<String> comparacaoNatural = (o1, o2) -> {
            return o1.compareTo(o2);
        };

        nomes.sort(comparacaoNatural);
        System.out.println("Nomes ordenados de forma natural:");
        nomes.forEach(System.out::println);

        nomes.sort((s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            }
            if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        });
        System.out.println("Nomes ordenados pelo tamanho:");
        nomes.forEach(System.out::println);
    }
}
