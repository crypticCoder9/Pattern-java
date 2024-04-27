public class Pattern{
    public static void main(String[] args) {
     int n = 3;
     for(int i=1;i<=n;i++){
   //stars
   
    for(int j=1;j<=(2*n)+3;j++){
      if((i+j)==4||(i+j)==8||((j==4)&&(i==2))||((j==9)&&(i==2||i==3))){
        System.out.print("*");
      }
       else{
        System.out.print("  ");
    }
    }
    
    System.out.println();
   }

   
    }
}
