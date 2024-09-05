public class IndexOfCharacter {
    //WAP to print the first index of given character,from the given String
    // char given = 'a'
    // String input = "java ka baba"
    public static void main(String[] args) {
        String input = "java ka baba";
        char given = 'b';
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == given) {
                index = i;//1,3,6,9,11
                break;
            }
        }
        System.out.println("Last index of char 'a'  is " + index);
        System.out.println("input.indexOf('b') = " + input.indexOf('b'));
    }
}
//String class provides a method indexOf(int givenChar)
