public class pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            System.out.println("");
            for (int j = 1; j <=4; j++) {
                if((i==j)&& (((i+j)==4 )|| ((i+j)==6)) ){
                    System.err.print(" ");

                }else{
                    System.err.print("*");
                }
            }
            
        }
    }
}
