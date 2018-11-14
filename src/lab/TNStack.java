package lab;

public class TNStack {

    private int size;
    private int[] stackArr;
    private int top = -1;

    public TNStack(int size) {
        this.size = size;
        stackArr = new int[size];
    }

    /**
     * increment the ctr and push element into stack
     *
     * @param i element to be pushed
     */
    public void push(int i) {
        top++;
        System.out.println("Pushing " + i);
        stackArr[top] = i;
    }

    /**
     * pop the element from stack and decrement the ctr
     *
     * @return the popped element
     */
    public int pop() {
        int i = stackArr[top];
        top--;
        System.out.println("Popping " + i);
        return i;
    }

    public int peek() {
        System.out.println("Peek " + stackArr[top]);
        return stackArr[top];
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
