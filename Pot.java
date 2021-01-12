import java.util.Scanner;

public class Pot{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int n=kb.nextInt();
    if(1<=n && n<=10){
      boolean ch=true;
      int p,sum=0;
      for(int i=0;i<n;i++){
        p=kb.nextInt();
        if(10<=p && p<=9999)
          sum+=Math.pow(p/10,p%10);
        else{
          ch=false;
          break;
        }
      }
      if(ch && sum<=1000000000) System.out.println(sum);
    }
  }  
} 