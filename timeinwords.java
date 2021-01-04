import java.io.*;
public class timeinwords
{
    
     public static void main(String args[]) throws IOException
    {
     InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader x=new BufferedReader (read);
     System.out.println("enter hours");
     int h=Integer.parseInt(x.readLine());
      System.out.println("enter minutes");
     int m=Integer.parseInt(x.readLine());
     if((h>=1&&h<=12)&&(m>=0&&m<=59))
     {
         String word[]={"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten "," eleven "," twelwe "," thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
         String plu,a;
         if(m==1||m==59)
         plu="minute";
         else
         plu="minutes";
         if(h==12)
         a=word[1];
         else
         a=word[h+1];
          System.out.print("output: \n"+h+":"+m+"-----");
          if(m==0)
            System.out.println(word[h]+"o'clock");
            else  if(m==15)
            System.out.println("quarter past"+word[h]);
     else  if(m==30)
            System.out.println("half past"+word[h]);
            else  if(m==45)
            System.out.println("quarter to"+a);
            else  if(m<30)
            System.out.println(word[m]+" "+plu+" past+words[h] ");
            else
            System.out.println(word[60-m]+" "+plu+" to "+a);
        }
        else 
        System.out.println("invalid input!");
    }
}