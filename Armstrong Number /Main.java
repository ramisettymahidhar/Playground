import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      double sum=0,a;
      int count=0;
     int y=x,z=x;
    while(x>0)
    {
      if(x%10!=0)
      {
           x=x/10;
         count++;
       
      }
    }
      
      for(int i=0;i<count;i++)
      {
        a=y%10;
        sum=sum+Math.pow(a,count);
        y=y/10;
      }
      if(sum==z)
      System.out.println("Armstrong Number");
      else
          System.out.println("Not a Armstrong Number");
	}
}