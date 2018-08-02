import java.util.Scanner;

public class bt15 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.printf("Nhap b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0){
            System.out.println("Ko co UCLN");
        }
        while (a!=b){
            if(a > b){
                a = a-b;
            }
            else{
                b= b-a;
            }
        }
        System.out.println("UCLN: "+a);
        }

}
