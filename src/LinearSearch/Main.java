package LinearSearch;

public class Main {

    public static void main(String[] args){

        int[] array = {4,5,7,1,9,0,3};

        int index = linearSearch(array, 0);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("element not found");
        }

    }

    private static int linearSearch(int[] array, int value){

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}
