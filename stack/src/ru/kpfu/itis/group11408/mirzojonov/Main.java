package ru.kpfu.itis.group11408.mirzojonov.superStack;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Scanner;

class Main {

    static HashMap<Character, Character> braces = new HashMap<Character, Character>();
    public static void main(String[] args) {
        braces.put('{', '}');
        braces.put('[', ']');
        braces.put('(', ')');
        System.out.println("Please write the sequence: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println("Sequence of brackets is " + (check(s) ? "right" : "wrong"));

    }
    public static boolean check(String text){
        ArrayStack<Character> as = new ArrayStack<Character>();
        for (int i = 0; i < text.length(); i++) {
            try {
                char _char = text.charAt(i);
                if (_char == '{')
                    as.push(_char);
                else if(_char == braces.get('{')){
                    if(as.peek() != '{')
                        return false;                                        // если последний элемент из стака не равен закрывающейся скобке, то возвращает false
                    text = replaceCharAt(text, i, '0');                      // заменяет закрывающуюся скобку на 0
                    text = replaceCharAt(text, text.indexOf(as.pop()), '0'); // заменяет открывающу скобку на 0 и уберает последний элемент из стака
                }
                else if (_char == '[')
                    as.push(_char);
                else if(_char == braces.get('[')) {
                    if (as.peek() != '[')
                        return false;
                    text = replaceCharAt(text, i, '0');
                    text = replaceCharAt(text, text.indexOf(as.pop()), '0');
                }
                else if (_char == '(')
                    as.push(_char);
                else if(_char == braces.get('(')){
                    if (as.peek() != '(')
                        return false;
                    text = replaceCharAt(text, i, '0');
                    text = replaceCharAt(text, text.indexOf(as.pop()), '0');
                }
            }catch (StackOverflowError se){
                System.out.println("Sorry, but the text should not contain more that 20 opening braces.");
                return false;
            }catch (EmptyStackException ee){
                return false;                // если например, есть такой текст ")something()", то это автоматически возвращает false
                                             // потому что стак пустой но встретилась закрывающаяся скобка
            }
        }
        return (as.size() == 0);
    }
    private static String replaceCharAt(String s, int i, char c) {
        StringBuffer buf = new StringBuffer(s);
        buf.setCharAt(i, c);
        return buf.toString();
    }
}