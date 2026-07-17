public class second {
    public static void main(String[] args) {
          int x = 100;
        int y = 20;

        String name = "Arya Stark";
        

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(0, 3));
        // System.out.println(name.equals(name2));

        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x * y));
        System.out.println("Quotient: " + (x / y));
        System.out.println("Remainder: " + (x % y));

        if(x > y) {
            System.out.println("x is greater than y");
        } else if(x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is equal to y");
        }

       
        System.out.println("cat");
        System.err.println("Meow Meow");
    }
}
