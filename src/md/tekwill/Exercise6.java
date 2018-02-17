package md.tekwill;

public class Exercise6 {

    /*
    Write a program that would determine the longest line in a string array.
    {"Java", "Developer", "Software"}
    OUT: Developer
    */
            public static void main(String[] args) {
                String[] animalNames = {"Java", "Developer", "Software"};
                String a= getLongestString(animalNames);
                System.out.println(a);
            }
            private static String getLongestString(String []animalNames) {

                int s;
                for (s = 0; s <= animalNames.length; s++) {
                    if (animalNames[s].length() > animalNames[s + 1].length()) {
                        return (animalNames[s]);
                    }
                }
                return null;
            }

        }


