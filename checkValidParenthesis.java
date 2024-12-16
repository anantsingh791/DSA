import java.util.Stack;

public class checkValidParenthesis {
    public static void main(String[] args) {
//        System.out.println(checkParenthesis("{[()]}"));
//        System.out.println(checkParenthesis("(]{"));
        System.out.println(check("{[()]}"));
        System.out.println(check("(]{"));
    }

    static boolean checkParenthesis(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{' ){
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                if(ch == ')' && c != '(' || ch == '}' && c != '{' || ch == ']' && c != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    static boolean check(String str){

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }

            else if(ch==')' || ch==']' || ch=='}'){
                if(stack.isEmpty()){
                    return false;
                }

                char c = stack.pop();
                if(ch == '(' && c!=')' || ch == '[' && c!=']' || ch == '{' && c!='}'){
                    return false;
                }

            }
        }

        return stack.isEmpty();

    }
}
