public class palindrome2 {
public static void main(String[]  args) {
    int x,z = 0,y;
    int n = 121;
    y = n;
    while (n != 0) {
        x = n % 10;
        z = z * 10 + x;
        n = n / 10;
    }

    if (y == z)
        System.out.println(y + " is a palindrome");
    else
        System.out.println(y + " is not a palindrome");
    }

}




