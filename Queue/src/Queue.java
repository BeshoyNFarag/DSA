public class Queue {

    int [] array;
    int capacity;
    int front = 0;
    int rear = -1;
    int size = 0;


    public void setSize(int capacity){
        this.capacity = capacity;
        array = new int[capacity];

    }

    public void enqueue(int data) {

        if(size == capacity){
            System.out.println("queue orverflow");
        }
        else{
            rear = (rear + 1) % capacity;
            array[rear] = data;
            size ++;
        }



    }

    public int dequeue() {

        if(isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        else{
            int value = array[front];
            front = (front + 1) % capacity;
            size --;
            return value;
        }

    }

    public void print(){
        for(int num: array){
            System.out.println(num + " ");
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int peek(){

        return array[front];
    }





}
