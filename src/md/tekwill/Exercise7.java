package md.tekwill;

public class Exercise7 {

    /*
    Print and count the vowels in a string variable.
    Ex:
       Hello World!
       e
       o
       o
       Total: 3
    */
    public static void main(String[] args) {
            String str;
            int vowels = 0;
            char ch;
        System.out.print("Hello World ");
            str = "Hello World ";
        for(int i = 0; i < str.length(); i ++)
        {
            ch = str.charAt(i);

            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
                    ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                vowels ++;

        }

        System.out.println("Vowels : " + vowels);

                }


            }
