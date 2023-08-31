import java.util.Scanner;

public class EvenorOdd {
    void Number(int number) {
        if ((number % 2)!= 0) {
            System.out.println("number is odd");
        } else {
            System.out.println("number is even");
        }
    }
public static void main(String args[]) {
    int number;
    Scanner sc=new Scanner(System.in);
    number=sc.nextInt();
    EvenorOdd obj = new EvenorOdd();
    obj.Number(number);
}

}
