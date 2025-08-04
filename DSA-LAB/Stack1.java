
class Stack1 {
    public final int max = 4;
    public int[] arr = new int[max];
    public int tos = -1;

    public void push(int data) {
        if (tos == max - 1) {
            System.out.println("Stack is overflowed");
            return;
        }
        tos++;
        arr[tos] = data;
        System.out.println("Pushed = " + data);
    }

    public void pop() {
        if (tos == -1) {
            System.out.println("Stack is underflowed");
            return;
        }
        System.out.println("Popped = " + arr[tos]);
        tos--;
    }

    public void display() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents:");
        for (int i = tos; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public void peep() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top Element = " + arr[tos]);
    }

    public static void main(String[] args) {
        Main stack = new Main();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50); // This will cause overflow
        stack.pop();
        stack.pop();
        stack.peep();
        stack.display(); // Optional: to view remaining stack
    }
}
