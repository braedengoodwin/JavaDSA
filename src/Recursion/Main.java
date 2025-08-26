package Recursion;

public class Main {

    public static void main(String[] args){

        //walk(5);
        //System.out.println(factorial(7));
        System.out.println(power(2,8));
    }

//    private static void walk(int steps){
//
//        /*
//         * iteration way of doing things
//         * the repetition of a process
//         */
//        for(int i = 0; i < steps; i++){
//            System.out.println("You walked steps!" + i);
//        }
//
//        /*
//         * recursive way of doing things
//         * the repetition of a procedure
//         */
//        if(steps < 1) return; // Base Case
//        System.out.println("You walked steps!");
//
//        walk(steps - 1); // Recursive Case
//    }

//    private static int factorial(int num){
//
//        if(num < 1) return 1; // Base Case
//
//        return num * factorial(num-1); // Recursive Case
//    }

    private static int power(int base, int exponent){

        if(exponent < 1) return 1; // Base Case

        return base * power(base,exponent -1);
    }

}
