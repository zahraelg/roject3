
public class Queue1
{
  QueueNode front;
    QueueNode rear;
    
    void CreatQueue(){
        front=null;
        rear=null;
    }
    
    void DestroyQueue(){
        while(front!=null)
            front=front.Link;
        rear=null;
    }
    
    boolean EmptyQueue(){
        return (front==null);
    }
    
    void printQueue(){
        QueueNode ptr=front;
        while(ptr!=null){
            System.out.println(ptr.no);
            ptr=ptr.Link;
        }
    }
    
    
    void Enqueue(int value ){
        QueueNode ptr=new QueueNode();
        ptr.no=value;
        ptr.Link=null;
        
        if(EmptyQueue())
            front=ptr;
        else
            rear.Link=ptr;
        
        rear=ptr;
    }
    
    int Dequeue(){
        int value=front.no;
        front=front.Link;
        if(EmptyQueue())rear=null;
        return value;
    }  
    
    public void removeq(Qeueu2,Qeueu3){
        Qeueu2 q2=new Qeueu2();
        Qeueu3 q3=new Qeueu3();
         int temp,j;
         while(!q.EmptyQueue()){
         temp=q1.Dequeue();
         for(j=2;j<temp;j++){
         if(temp%j==1)
         q2.Enqueue(temp);
         else
         q3.Enqueue(temp);
        }
        }
        while(!q2.EmptyQueue&&!q3.EmptyQueue){
        if(q2<q3)
        q2. printQueue();
        else if(q3<q2)
        q3. printQueue();
        else
        System.out.print("Qeueu are equal");
   
}
}
      
}
