package md.tekwill;

public class Exercise3 {

    /*
    Write a program that would determine minimal number in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: 4
    */
    public static void main(String[] args) {


            int array[] = new int[]{256, 16, 32, 8, 4, 512};

            int min = getMin(array);
            System.out.println("Minimum Value is: "+min);
        }

    private static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}



