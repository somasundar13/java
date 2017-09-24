public class MyClass {
    public static void main(String args[]) {
        char c[]={'d','a','t','a'};
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                if(i==j){
                 System.out.print(c[j]); 
                }
                else
                System.out.print(" ");
            }
           System.out.println();
        }
        
       
    }
}
