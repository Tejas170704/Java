public class pattern {
    public static void main(String[] args) 
    {
        for (int i = 1; i<=5; i++) {
           System.err.println(" ");
            for (int j = 1; j <=i; j++) {
                
            
                if((i+j)%2==0){
                    System.out.print("1");
                }
                    else{
                        System.err.print("0");
                    }
        
        } 
        }
    }
    }