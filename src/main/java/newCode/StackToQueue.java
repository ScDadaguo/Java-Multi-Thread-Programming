package newCode;

import java.util.Stack;


//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。


//入队：将元素进栈A
//
//出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
//
// 如果不为空，栈B直接出栈。
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int a;
        if (stack2.empty()) {
            while (!stack1.empty()) {
                a=stack1.pop();
                stack2.push(a);

            }
        }
        a=stack2.pop();
        return a;
    }

    public static void main(String[] args) {
        StackToQueue stackToQueue=new StackToQueue();
        stackToQueue.push(1);
        stackToQueue.push(2);
        int a=stackToQueue.pop();
        System.out.println(a);
    }
}
