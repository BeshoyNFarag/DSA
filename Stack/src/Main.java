public class Main {

    public static void main(String [] args){
        Stack stack = new Stack();
        stack.setSize(10);
        stack.push(1);
        stack.push(2);
        stack.push(500);
        stack.push(600);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(500);
        stack.push(600);
        stack.push(1);
        stack.push(2);
        stack.push(500);
        stack.push(600);
        stack.push(1);
        stack.push(2);
        stack.push(500);
        stack.push(600);
        stack.push(1);


    }
}
