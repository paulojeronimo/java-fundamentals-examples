import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class TestaLocalDate {
  public static void main(String[] args) {
    LocalDate myDate = LocalDate.now();
    JapaneseDate jDate = JapaneseDate.from(myDate);
    System.out.println("Japanese date: " + jDate);
  }  
}
