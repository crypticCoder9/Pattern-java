import java.util.*;
public class Pattern{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1;i<=n;i++){
   //spaces outer
   for(int j=1;j<=(n-i);j++){
    System.out.print(" ");
   }
   //stars
   
    for(int j=1;j<=i;j++){
        System.out.print("*");
        for(int k=1;k<=(i-1);k++){
            System.out.print(" ");
        }
    }
    
    System.out.println();
   }

   
    }
}
