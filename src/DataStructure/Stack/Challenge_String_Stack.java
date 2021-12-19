package DataStructure.Stack;

import java.util.LinkedList;


public class Challenge_String_Stack {

    private LinkedList<Character> string_Stack;

    public Challenge_String_Stack() {
        string_Stack = new LinkedList<>();
    }


    public boolean isPalindrome(String text) {

        text = text.replaceAll("\\p{Punct}", "");
        text = text.toLowerCase();
        text = text.replaceAll("\\s+", "");

        for (int i = 0; i < text.length(); i++)
            string_Stack.push(text.charAt(i));

        text = "";

        int FirstStackSize = string_Stack.size();

        for (int i = 0; i < FirstStackSize / 2; i++)
            text += string_Stack.pop();


        if (FirstStackSize % 2 != 0)
            string_Stack.pop();

        for (int i = string_Stack.size() - 1; i >= 0; i--)
            if (string_Stack.pop() == text.charAt(i)) ;
            else
                break;

        return string_Stack.size() == 0;
    }
}
