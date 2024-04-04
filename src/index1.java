import java.util.Scanner;

public class index1 {
    // bài tập hiển thị 20 số nguyên tố đầu tiên
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập số nguyên tố muốn hiển thị:");
//        int number = input.nextInt();
//        int count = 0;
//        int N = 2;
//        while (true){
//            int  count1 = 0;
//            for (int i = 1; i <= N; i++) {
//                if (N % i == 0 ){
//                    count1 ++;
//                }
//            }
//            if (count1 == 2 ){
//                System.out.println(N + " số nguyên tố");
//                count++;
//            }
//            N++;
//            if (count == number){
//                break;
//            }
//        }
        //hiển thị số nguyên tố nhỏ hơn 100
        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 ){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i + " là số nguyên tố");
            }else {
                System.out.println(i + " không phải là số nguyên tố" );
            }
        }
    }
}
