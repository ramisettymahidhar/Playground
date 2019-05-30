import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int rev=0,r;
      while(n>0)
      {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
      }
      rev=(rev/10)%10;
      System.out.println(rev);
	}
}