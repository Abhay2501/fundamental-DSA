public class stack {
    private int[] arr;
    private int tos;
    private int size;
    private int maxSize;
    private void initialize(int len){
        this.arr= new int[len];
        this.tos =-1;
        this.size= 0;
        this.maxSize = len;
    }
    public stack(){

        initialize(5);
        
    }
    public stack (int size){
        initialize(size);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = tos; i>= 0; i--){
            sb.append(this.arr[i]);
            if(i != 0)
            sb.append(",");}
            sb.append("]");
            return sb.toString();
        
    }

    private void stackisemptyException() throws Exception{
        if(this.size ==0)
        throw new Exception("stackisemptyException:-1");

    }
    private void stackisOverflowException() throws Exception{
        if(this.size ==this.maxSize)
        throw new Exception("stackisOverflowException:-1");

    }

    public int size(){
        return this.size;

    }
    public boolean isempty(){
        return this.size == 0;

    }
    private void push_(int data){
        this.arr[++this.tos] = data;
        this.size++;
    }
    public void push(int data) throws Exception{
        stackisOverflowException();
        // if(this.size == this.maxsize) return;
        push_(data);


    }
    public int top() throws Exception{
        
            
        
        stackisemptyException();
        
        return this.arr[this.tos];

    }
    private int pop_(){
        int rv = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.size--;
        return rv;

    }
    public int pop() throws Exception{
        stackisemptyException();
        return pop_();

    }
    
}
