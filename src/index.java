import java.util.Scanner;

public class index {
    //bài vẽ hình chữ nhật
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập đọ rộng hình chữ nhật :");
//        int number1 = input.nextInt();
//        System.out.println("nhập đọ dài hình chữ nhật :");
//        int number2 = input.nextInt();
//        for (int i = 0; i < number1; i++) {
//            for (int j = 0; j < number2; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    // vẽ hình tam giác
//


    //vẽ một tam giác vuông
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập cạnh tam giác :");
        int number1 = input.nextInt();
        for (int i = number1; i >= 1; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    // vẽ tam giác cân

}
