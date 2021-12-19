package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_Challenge {

    private Stack stk;
    private Queue qu;

    public Queue_Challenge() {
        stk = new Stack();
        qu = new LinkedList();
    }

    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\p{Punct}", "");
        text = text.toLowerCase();
        text = text.replaceAll("\\s+", "");

        StringBuilder neoText = new StringBuilder(text);

        if (neoText.length() % 2 != 0)
            neoText.setCharAt(neoText.length() / 2, '\0');

        for (int i = 0; i < neoText.length() / 2; i++)
            stk.push(neoText.charAt(i));

        if (neoText.length() % 2 != 0)
            for (int i = (neoText.length() / 2) + 1; i < neoText.length(); i++)
                qu.add(neoText.charAt(i));
        else
            for (int i = neoText.length() / 2; i < neoText.length(); i++)
                qu.add(neoText.charAt(i));

        int j = 0;

        for (int i = 0; i < stk.size() + j; i++)
            if (stk.pop() == qu.remove())
                j++;
            else
                return false;

        return true;
    }
}
