package newCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

    public class LinkList_endToend {

        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<Integer> stack = new Stack<Integer>();
            ArrayList<Integer> newList = new ArrayList<Integer>();
            ListNode t=listNode;
            while (t != null) {
                stack.push(t.val);
                t=t.next;
            }
            while (!stack.empty()) {
                newList.add(stack.pop());
            }
            return newList;

        }

        private static class ListNode {
            int val;
            ListNode next=null;

            ListNode(int val) {
                this.val=val;
            }
        }

        public static void main(String[] args) {
            ListNode listNode = new ListNode(2);
            listNode.next=new ListNode(4);
            LinkList_endToend linkList_endToend = new LinkList_endToend();
            List list = linkList_endToend.printListFromTailToHead(listNode);
            System.out.println(list);
        }
    }
