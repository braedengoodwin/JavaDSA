package Stacks;

import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Stack<String> stack = new Stack<>();


        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Borderlands");
        stack.push("GTAV");

//        String myFavGame = stack.pop();
//        System.out.println(myFavGame);

//        System.out.println(stack.peek());

//        System.out.println(stack.search("GTAV"));

        System.out.println(stack);

        for(int i = 0; i < 100000; i++){
            stack.push("fallout76");
        }
    }
}
