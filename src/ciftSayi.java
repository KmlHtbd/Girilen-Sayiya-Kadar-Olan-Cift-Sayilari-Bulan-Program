import java.util.Scanner;
public class ciftSayi {
    public static void main(String[] args) {
        int k;
        double avg,total=0,loop=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        k =input.nextInt();

        for (int i=1;i <= k;i++) {
            if ((i % 3 == 0) || (i % 3 == 0)) {
                System.out.println(i);
                total += i;
                loop += 1;
            }
        }
        avg = total/loop;
        System.out.println("Ortalam:"+avg);
    }
}