public class DemoString {
    public static void main(String[] args) {
        String name = "Vaibhav";
        String name2 = new String("Vaibhav");
        /*if(name == name2){
            System.out.println("Same Same");
        }else{
            System.out.println("Not Same");
        }*/
        // method calling
        // objectName.methodName(arguments)
        int length = name.length();
        System.out.println("No of characters in given String = " + length);
    }
}
// int length()
