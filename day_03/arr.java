package day_03;


import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
import java.util.Arrays;
// import java.util.Date;

public class arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = -2;
        arr[3] = 13;
        arr[4] = 31;

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(5);

        // futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(futureDate);

    }
}
