public class Stack {
    int [] array;
    int top = -1;
    int size;


    public void setSize(int size){
        this.size = size;
        array = new int[size];
    }


    public void push(int item){
        if(top >= size - 1){
            System.out.println("Stack overflow");
        }
        else
            array[++top] = item;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return array[top--];
        }
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        else
            return array[top];
    }



}
