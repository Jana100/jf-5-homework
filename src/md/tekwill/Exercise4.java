package md.tekwill;

public class Exercise4 {

    /*
    Write a program that would determine minimal and maximal numbers in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: Min: 4; Max: 512.
    */
    public static void main(String args[]){
        int array[] = new int[]{256, 16, 32, 8, 4, 512};


        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);

        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);
    }

    private static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
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


