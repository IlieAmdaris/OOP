import java.util.ArrayList;

public class Queue<T> {
    private int maximumSize;
    public ArrayList<T> queue;
    private int front = -1; private int rear = -1;

    public Queue(int maximumSize) {
        this.maximumSize = maximumSize;
        queue = new ArrayList<>(maximumSize);
    }
    public Queue(){
        queue = new ArrayList<>();
        maximumSize = -1;
    }
    T front(){
        if (front == -1){
            System.out.println("The queue is empty");
            return null;
        }
        return queue.get(front);
    }
    T rear(){
        if(rear == -1){
            System.out.println("The queue is empty");
            return null;
        }
        return queue.get(rear);
    }

    public void push(T value){
            if(maximumSize != -1){
                if (maximumSize <= queue.size()){
                    System.out.println("queue is at max capacity");
                    return;
                }
            }
            if(front == -1 && rear == -1){
                front = 0;
                rear = 0;
                queue.add(value);
            }else {
                front++;
                if(queue.size() > front){
                    queue.set(front,value);
                }else {
                    queue.add(value);
                }
            }
        }

    public void pop(){
        if (isEmpty()){
            System.out.println("The queue is empty!");
        }else if(front == rear){
            front = rear = - 1;
        }else {
            rear++;
        }
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return maximumSize != -1 && maximumSize == queue.size();
    }
}
