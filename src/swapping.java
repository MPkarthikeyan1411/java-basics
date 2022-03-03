public class swapping {
    public static void main(String[] args)
    {
    float a=18.0f,b=28.5f;
    System.out.println("before swapping:");
    System.out.println("first number:"+a);
    System.out.println("second number:"+b);
    a=a-b;
    b=a+b;
    a=b-a;
        System.out.println("after swapping:");
        System.out.println("first number:"+a);
        System.out.println("second number:"+b);


    }
}
