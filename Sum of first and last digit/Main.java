import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a,b,c,rev=0,r;
      a=n%10;
      while(n>0)
      {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
      }
      b=rev%10;
      c=a+b;
      System.out.println(c);
	}
}