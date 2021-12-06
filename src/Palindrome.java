import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        String word;
        String reverse;
        int length;

        reverse= "";
        System.out.println("Enter a word to check: ");
        word = sc.next();

        for (int i = word.length()-1;i>=0;i--){
            reverse = reverse + word.charAt(i);
        }

        System.out.println("The reverse of "+word +" is "+ reverse);
        if (reverse.equals(word)){
            System.out.println("The given word is palindrome.");
        }else{
            System.out.println("The given word is not palindrome.");
        }


    }
}
