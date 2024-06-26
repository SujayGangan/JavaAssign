class StackImplementation {
    int top;
    int max_size;
    private String[] ele;
    
    StackImplementation(int max_size){
        this.top = -1;
        this.ele = new String[max_size];
        this.max_size = max_size;
    }

    boolean isFull(){
        // if(top == max_size - 1){
        //     System.out.println("Stack is full !!!");
        //     return true;
        // }
        // return false;

        return top == max_size -1;
    }

    boolean isEmpty(){
        // if (this.top == -1) 
        //     return true;
        // return false;
        return top == -1;
    }

    void push(String data){
        if (isFull()) {
            System.out.println("Stack is full !!!");
        } else {
            top++;
            ele[top] = data;
            // ele[++top] = data;
        }
    }

    String pop(){
        if(isEmpty()){
            System.out.println("Stack is emplty !!!");
            return null;
        } else {
            // String data = ele[top];
            // top--;
            // return data;
            return ele[top--];
        }
    }

    void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty !!!");
        } else {
            int index = top;
            while (index >= 0) {
                System.out.println(ele[index]);
                index--;
            }
        }
    }
    


    public static void main(String[] args) {

        StackImplementation stack = new StackImplementation(5);

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");

        stack.display();
        
        System.out.println("\nElement popped : " + stack.pop() + "\n");


        stack.display();

    }


}
