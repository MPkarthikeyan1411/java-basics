public class palnimdrome3 {
    public static void main(String[]  args) {
      int n=121,r,s=0;
      int t=n;
      while(n>0)
      {
          r=n%10;
          n=n/10;
          s=s*10+r;
      }
      if(t == s)
        System.out.println(t+" is a palindrome");
      else
          System.out.println(t+" is a not palindrome");
    }
}
