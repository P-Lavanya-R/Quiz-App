import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Java is a: \n a) Programming Language \n b) OS \n c) Browser \n d) Database",
            "2. Which keyword is used to inherit a class in Java? \n a) super \n b) extends \n c) implements \n d) this",
            "3. Which company developed Java? \n a) Google \n b) Sun Microsystems \n c) Microsoft \n d) Oracle",
            "4. Which of these is not a Java access modifier? \n a) public \n b) private \n c) protected \n d) open",
            "5. The default value of an int variable in Java is: \n a) 0 \n b) null \n c) 1 \n d) undefined",
            "6. Which method is the entry point of a Java program? \n a) start() \n b) main() \n c) init() \n d) run()",
            "7. Which of the following is not a primitive data type in Java? \n a) int \n b) boolean \n c) String \n d) double",
            "8. What is the size of float in Java? \n a) 4 bytes \n b) 8 bytes \n c) 2 bytes \n d) 16 bytes",
            "9. Which keyword is used to prevent inheritance in Java? \n a) static \n b) final \n c) abstract \n d) private",
            "10. Which exception is thrown when dividing by zero in Java? \n a) NullPointerException \n b) ArithmeticException \n c) ArrayIndexOutOfBoundsException \n d) IOException",
            "11. What is the default value of a boolean variable in Java? \n a) true \n b) false \n c) 0 \n d) null",
            "12. Which collection allows duplicate elements in Java? \n a) Set \n b) List \n c) Map \n d) TreeSet",
            "13. Which of the following is a wrapper class in Java? \n a) Integer \n b) int \n c) float \n d) double",
            "14. Which operator is used for logical AND in Java? \n a) & \n b) && \n c) | \n d) ||",
            "15. Which of the following is used to create a new object in Java? \n a) class \n b) new \n c) object \n d) create",
            "16. What is the output of: System.out.println(10 + 20 + \"30\"); ? \n a) 3030 \n b) 1030 \n c) 3030 \n d) 3030",
            "17. Which keyword is used to define an interface in Java? \n a) class \n b) interface \n c) abstract \n d) implements",
            "18. Which of the following is not a Java loop? \n a) for \n b) while \n c) repeat \n d) do-while",
            "19. Which statement is used to exit a loop in Java? \n a) continue \n b) break \n c) exit \n d) stop",
            "20. Which keyword is used to refer to the current object? \n a) super \n b) this \n c) current \n d) self",
            "21. Which package is automatically imported in all Java programs? \n a) java.util \n b) java.lang \n c) java.io \n d) java.net",
            "22. Which method is used to compare two strings in Java for equality? \n a) == \n b) equals() \n c) compare() \n d) compareTo()",
            "23. What does JVM stand for? \n a) Java Virtual Machine \n b) Java Variable Method \n c) Java Very Machine \n d) Java Visual Module",
            "24. What is the default value of a char variable in Java? \n a) '0' \n b) null \n c) '\\u0000' \n d) space",
            "25. Which keyword is used to create a subclass in Java? \n a) super \n b) extends \n c) subclass \n d) implements"
        };

        char[] answers = {
            'a','b','b','d','a','b','c','a','b','b',
            'b','b','a','b','b','a','b','c','b','b',
            'b','b','a','c','b'
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char ans = sc.next().charAt(0);

            if (ans == answers[i]) {
                score++;
            }
        }

        System.out.println("\nYou scored: " + score + "/" + questions.length);
        sc.close();
    }
}
