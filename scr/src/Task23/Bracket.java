package Task23;

import java.util.LinkedList;

public class Bracket {

    public static void main(String[] args) {
        String str = "{(([())])}";
        String str1 = "((((())))";
        System.out.println(checkBrackets(str));
        System.out.println(checkBrackets(str1));

    }
    public static boolean checkBrackets (String str){
        LinkedList list = new LinkedList();
        Character ch1 = '(';
        Character ch2 = '[';
        Character ch3 = '{';

        for (int i = 0; i < str.length(); i++) {
            if (str.toCharArray()[i] == ')' ){
                list.remove(ch1);
                continue;
            }
            if (str.toCharArray()[i] ==']'){
                list.remove(ch2);
                continue;
            }
            if (str.toCharArray()[i] == '}'){
                list.remove(ch3);
                continue;
            }
            list.add(str.toCharArray()[i]);
        }
        return list.isEmpty()? true: false;
    }

}
