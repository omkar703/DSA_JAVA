class advance_number_pattern {
    //    *
    //   **
    //  ***
    
   public static void main(String[] args) {
     for(int i = 1 ; i <= 4 ; i++){
        for(int j = 1 ; j<= (4-j) ; i++){
            System.out.print(" ");
        }
        for (int k = 1; k <= 4 ; k++){
            System.out.print(" * ");
        }
    }
   }
}
