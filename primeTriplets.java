import java.util.*;
class primeTriplets
{ 
    boolean isPrime(int n) //funton for checking prime
        {
            int count=0;
            for(int i=1; i<=n; i++)
                {
                    if(n%i == 0)
                        count++;
                }
            if(count == 2)
                return true;
             else
                return false;
        }
        
public static void main(String args[]) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the lower and upper range:");
            int m=sc.nextInt();
            int n=sc.nextInt();
            primeTriplets pt=new primeTriplets();
            int prime=0;
            //pt.get();
            if(m>0 && n> 0  && m<n)
            {
                System.out.println("Prime Triplets:");
                for(int i=m;i<n;i++)
                {
                    if(pt.isPrime(i)==true && pt.isPrime(i+2)==true && pt.isPrime(i+6))
                    {System.out.print(i+" " + (i+2) +" " +(i+6)+"\n");
                    prime++;
                }
                    else if(pt.isPrime(i)==true && pt.isPrime(i+4)==true && pt.isPrime(i+6))
                  {  System.out.print(i+" " + (i+4) +" " +(i+6)+"\n");
                      prime++;
                    }
                    
                    else
                    {
                    }
                }
                
            }
            else
            System.out.println("invalid");
            System.out.println("Total prime triplets are:"+prime);
        }
}