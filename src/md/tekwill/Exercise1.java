package md.tekwill;

public class Exercise1 {

    /*
    Print a Celsius - Fahrenheit table from 0 to 300 with interval 10C
    0C - 32F
    10C - 50F
    20C - 68F
    30C - 86F
    ...
    300 - 572n
    */
    public static void main(String[] args) {
        int fahr;
        int celsius;
        for (celsius = 0; celsius < 300; celsius++) ;
        {
            fahr = (celsius * 9 / 5) + 32;
            celsius = celsius + 10;
        }
    }

    }

