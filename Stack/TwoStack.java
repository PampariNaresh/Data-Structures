public class TwoStack {
    public int twostack[];
    public int size;
    public int top1;
    public int top2;

    TwoStack(int size) {
        this.size = size;
        top1 = -1;
        top2 = size;
        twostack = new int[size];
    }

    public void push1(int num) {
        if (top2 - top1 > 1) {
            top1++;
            twostack[top1] = num;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int num) {
        if (top2 - top1 > 1) {
            top2--;
            twostack[top2] = num;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int element = twostack[top1];
            top1--;
            return element;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < size) {
            int element = twostack[top2];
            top2++;
            return element;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String args[]) {
        TwoStack s = new TwoStack(5);
        s.push1(1);
        s.push1(2);
        s.push1(3);
        s.push2(4);
        s.push2(5);

        System.out.println(s.pop2());
        System.out.println(s.pop2());
    }
}
