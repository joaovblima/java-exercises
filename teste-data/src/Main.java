import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fdata = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();
        LocalDate data4 = LocalDate.parse("2024-03-23");
        LocalDateTime data5 = LocalDateTime.parse("2024-03-23T19:11:30");
        Instant data6 = Instant.parse("2024-03-23T09:15:40Z");

        LocalDate data7 = LocalDate.parse("23/03/2024", fdata);

        System.out.println("data01 = " + data);
        System.out.println("data02 = " + data2);
        System.out.println("data03 = " + data3);
        System.out.println("data04 = " + data4);
        System.out.println("data05 = " + data5);
        System.out.println("data06 = " + data6);
        System.out.println("data07 = " + data7);
    }
}