import java.util.LinkedList;
public class queueusingjavall {
    public static class queue{
        private LinkedList<Integer> ll = new LinkedList<>();
public int size(){
   return this.ll.size();


}
public boolean isEmpty(){
    return this.ll.isEmpty();

}
public void add(int data){
    ll.addLast(data);

}
public int top(){
    return ll.getFirst();

}
public int pop(){
    return ll.removefirst();

}
    }
    
    public static void main(String[] args){
        queue que = new queue(4);
        que.add(10);
        que.add(34);
        que.remove();
      
        System.out.println(que);


    }
    
}
