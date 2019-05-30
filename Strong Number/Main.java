import java.util.Scanner;

class Main
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
      int y=s.nextInt();
      int prod=1,i,x,sum=0,z;
      z=y;
      while(y>0)
      {
          x=y%10;
        
         for(i=x;i>0;i--)
         {
           prod=prod*i;
        }
       sum=sum+prod;
         y=y/10;
         prod=1;
      }
      if(z==sum)
       System.out.println("Yes");
      else 
         System.out.println("No");
        
	}
}