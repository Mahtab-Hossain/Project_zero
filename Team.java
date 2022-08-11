import java.util.Scanner;
 
public class Team
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int a=sc.nextInt();
      	int b;
      	int sum=0;
      
      for(int i=0;i<a;i++){
        
        int prob=0;
        for(int j=0;j<3;j++){
          
          prob +=sc.nextInt();
          
        }
        if(prob>=2){
      
          sum++;
        }
        else{
          System.out.println(sum);
        }
      }  
      
 	}
}