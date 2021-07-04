public class queue {
  private  int[] arr;
   private int maxsize;
   private int size;
   private int front;
   private int back;
   private void initialize(int len){
       this.arr = new int[len];
       this.maxsize= len;
       this.size = 0;
       this.front = 0;
       this.back =0;
       

   }
   public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for(int i = 0; i< this.size; i++){
        int idx = (i + this.front)% this.maxsize;
        sb.append(this.arr[idx]);
        if(i != this.size -1)
        sb.append(" ,");
    }
    sb.append("]");
    return sb.toString();
}
    public queue(){
        initialize(5);


    }
    public queue(int size){
        initialize(size);

    }
    private void queueisemptyException() throws Exception{
        if(this.size ==0)
        throw new Exception("queueisemptyException:-1");

    }
    private void queueisOverflowException() throws Exception{
        if(this.size ==this.maxsize)
        throw new Exception("queueisOverflowException:-1");

    }
    public int size(){
        return this.size;

    }
    public boolean isempty(){
        return this.size ==0;

    }
    private void add_(int data){
        this.arr[this.back] = data;
        this.back = (this.back +1)% this.maxsize;
        this.size++;

    }
    public void add(int data) throws Exception{
        queueisOverflowException();
        add_(data);


    }
    public int peak()throws Exception {
        queueisemptyException();
        return this.arr[this.front];

    }
    private int remove_(){
        int rv = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front +1)% this.maxsize;
        this.size--;
        return rv;

    }
    public int remove() throws Exception{
        queueisemptyException();
       return remove_();

    }


    
}
