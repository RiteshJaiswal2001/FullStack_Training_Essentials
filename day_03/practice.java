package day_03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//  enum Day{
//             Monday,
//             Tuesday,
//             Wednesday,
//             Thrusday,
//             Friday,
//             Saturday,
//             Sunday
//         }

public class practice {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Date in this Format dd-MM-yyyy: ");
        String day = sc.nextLine();

        // System.out.println(day);

       

       

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Parse input string to LocalDate
        LocalDate date = LocalDate.parse(day, formatter);

        LocalDate futureDate = date.plusDays(30);

            // Get day of week
        DayOfWeek dayOfWeek = futureDate.getDayOfWeek();
        System.out.println(futureDate);
        System.out.println(dayOfWeek);
        

        switch (dayOfWeek) {
            case MONDAY:
                break;
        
            case TUESDAY:
                break;
        
            case WEDNESDAY:
                break;
            
            case THURSDAY:
                break;
            
            case FRIDAY:
                break;
            
            case SATURDAY:
                futureDate = futureDate.plusDays(2);
                break;
            
            case SUNDAY:
                futureDate = futureDate.plusDays(1);
                break;    
            default:
                break;
        }
        

        

        System.out.println(futureDate);



        sc.close();

    }
}
