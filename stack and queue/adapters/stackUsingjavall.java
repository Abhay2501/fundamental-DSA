
import java.util.LinkedList;

public class stackUsingjavaLL {
    public static class stack{
        private LinkedList<Integer> ll = new LinkedList<>();
public int size(){
   return this.ll.size();


}
public boolean isEmpty(){
    return this.ll.isEmpty();

}
public void add(int data){
    ll.addFirst(data);

}
public int top(){
    return ll.getFirst();

}
public int pop(){
    return ll.removefirst();

}
    }
    
    public static void main(String[] args){

    }
    
}
