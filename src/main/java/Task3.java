import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите слово, нажмите enter");
        
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String reverse = new StringBuilder(word).reverse().toString();
        System.out.println(word);
        System.out.println(reverse);

        if (word.equalsIgnoreCase(reverse)){
            System.out.println("Слова палиндромны");
        }else {
            System.out.println("Слова не палиндромны");
        }

        in.close();
    }
}
