// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING

public class Problem_6 {
    public static void main(String[] args) {
        // Create list L with nodes 1, 2, and 3
        LinkedList L = new LinkedList();
        L.add(1);
        L.add(2);
        L.add(3);
        System.out.println("List L: " + L);

        // Create list M with nodes 4, 5, and 6
        LinkedList M = new LinkedList();
        M.add(4);
        M.add(5);
        M.add(6);
        System.out.println("List M: " + M);

        // Append nodes of M to end of L
        Node node = L.header;
        while (node.getNext() != null)
        {
            node = node.getNext();
        }
        node.setNext(M.header.getNext());
        L.size = L.size + M.size;

        return L;
        //Running time is O(n).

        // Print resulting list
        System.out.println("Concatenated list: " + L);
    }
}

// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING