public class values {
    public static void main(String[] args) {
        // for( int num = 1 ; num <= 50 ; num++){
            // if ( num % 3 == 0 ){
                // continue;
            // }
        //   System.out.println("the number is " + num);  
        // }
        int num = 1;
      myloop :  while(num <= 50 ){
            if (num % 3 == 0){
                num++ ;
                continue myloop;
            

            }
            System.out.println(num);
            num++ ;

        }
        
    }
    
}
