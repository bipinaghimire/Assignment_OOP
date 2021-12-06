import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value: ");
        n= sc.nextInt();
        String[] word = new String[n];
        System.out.println("Enter strings: ");
        for (int i = 0; i<n; i++){
            word [i] = new String(sc.next());
        }
        for (int i=0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (word[i].compareTo(word[j])>0){
                   String check = word[i];
                   word[i] = word[j];
                   word[j] = check;
                }
            }
        }
        System.out.println("List in ascending order: ");
        for (int i =0; i<n;i++){
            System.out.println(word[i]);
        }


    }
}
