public class PartyString {
    // printing each character of String
    /*
    0 1 2 3 4 5 6
    V a i b h a v

    // step 1
    V, a, i, b, h, a, v

    taking one character form String

    char charAt(int index)
     */
    public static void main(String[] args) {
        String name = "Vaibhav";
        // for to print indexes
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < name.length(); i++) {

            char nameCharacter = name.charAt(i);
            System.out.print(nameCharacter);
            if (i != name.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
/*
WAP to check whether the given character is present in the given String, if present print found
otherwise not found
String input = "Java ka Baba"
char search = 'k';
 */
