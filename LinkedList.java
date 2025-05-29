public class LinkedList {
    
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;

    // count node is ll
    public static int countNode(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    // detect cycle in ll
    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow  = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    // find mid of ll
    public static int findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }


    // reverse ll using iterative way
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    // reverse ll using recursive way
    public static Node reverseRec(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node newHead = reverseRec(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }


    // print ll
    public static void printll(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }



    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20); 
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        head = first;
        
        // System.out.println(countNode(head));
        // System.out.println(isCycle(head));
        // System.out.println(findMid(head));

        // Node reversedHead = reverse(head);
        Node reversedHead = reverseRec(head);
        printll(reversedHead);

    }
}
