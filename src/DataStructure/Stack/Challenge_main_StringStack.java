package DataStructure.Stack;

public class Challenge_main_StringStack {

    public static void main(String[] arg) {
        Challenge_String_Stack stringStack = new Challenge_String_Stack();
        if (stringStack.isPalindrome("Don't nod") == true)
            System.out.println("\nYes, it's Palindrome.");
        else
            System.out.println("\nNo, it's not Palindrome.");

        //Other way to use the method
        System.out.println(stringStack.isPalindrome("\nabccba"));

    }
}
