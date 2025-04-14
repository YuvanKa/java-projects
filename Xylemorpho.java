import java.util.Scanner;

class Xylemorpho {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        int last = n % 10, temp = n, temp2 = n;
        while (n > 9) {
            n /= 10;
        }
        int sum1 = last + temp;
        int sum2 = 0;
        temp /= 10;
        while (temp > 9) {
            int b = temp % 10;
            sum1 += b;
            temp /= 10;
        }
        if (sum1 == sum2) {
            System.out.println("The Number is Xylem" + temp2);
        } else {
            System.out.println("The Number is pyloem" + temp2);
        }
    }
}
