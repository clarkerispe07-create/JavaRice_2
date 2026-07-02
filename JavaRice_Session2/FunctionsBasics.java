public class FunctionsBasics {

    public static void printLine() {
        System.out.println("-------------------------------------------");
    }

    public static void printGreeting() {
        System.out.println("Hello, Promotion 27! Ready to code?");
    }

    public static void printPattern() {
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
       
    }

    public static void printMessage() {
        System.out.println("Coding is your Future!");
    }

    public static void printPersonalGreeting(String name) {
        System.out.println("Hello " + name + "! Welcome to Promotion 27!.");
    }

    public static void printRepeatedPattern(char symbol, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static int getPromotionYear() {
        return 2026;
    }

    public static String getMotivationalQuote() {
        String quote = "Keep coding, Promotion 27!";
        return quote;
    }

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printStudentInfo(String firstName, String lastName, int age) {
        if (age < 18) {
            System.out.println(firstName + " " + lastName + " is a minor.");
        } else {
            System.out.println(firstName + " " + lastName + " is an adult.");
        }
        
        if (isEven(age)) {
            System.out.println("His age is even.");
        } else {
            System.out.println("His age is odd.");
        }
    }

    public static void main(String[] args) {
        printLine();
        printGreeting();
        printLine();
        printPattern();
        printLine();
        printMessage();
        printLine();
        
        System.out.println();
        
        printPersonalGreeting("Clark Dee");
        printRepeatedPattern('*', 10);
        
        System.out.println();
        
        System.out.println("Promotion Year: " + getPromotionYear());
        System.out.println("Motivational Quote: " + getMotivationalQuote());
        
        System.out.println();
        
        System.out.println("Square of 5: " + calculateSquare(5));
        System.out.println("Concatenated String: " + concatenateStrings("Hello", "World"));
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
        
        System.out.println();
        
        printStudentInfo("Clark", "Dee", 19);
    }
}