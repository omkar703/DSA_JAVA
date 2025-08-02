class square_pattern {
    
    public static void main(String[] args) {

        // square pattern
        for (int i = 1; i<= 4 ; i++){
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    int i = 4;
    int j = 5;

    // hollow square pattern

    for(int k = 1 ; k <= i ; k++){
        for (int l = 1; l <= j; l++){
            if (k == 1 || k == i || l == 1 || l == j) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }        }
        System.out.println();
        }
    

        // pyramid pattern

        for (int m = 1; m<= 5 ; m++){
            for (int p = 1; p<= m ; p++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        // inverted pyramid pattern
        for (int u  = 5 ; u >= 1 ; u--){
        for (int v = 1 ; v <= u ; v++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    // side triangle pattern

    }


    
    
}