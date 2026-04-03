public class Main {

    public static void main(String [] args){
        Linkedlist linkedlist = new Linkedlist();
       linkedlist.addLast(15);
       linkedlist.addFirst(25);
       linkedlist.addLast(35);
       linkedlist.addFirst(10);
       linkedlist.addFirst(20);
       linkedlist.addLast(555);

       // 20,10,25,15,35,555
        linkedlist.printValues();
    }
}
