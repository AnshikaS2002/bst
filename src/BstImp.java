public class BstImp<T extends Comparable<T>> {
    Node<T> root;

    BstImp() {
        root = null;
    }

    public void insertData(T data) {
        root = insertDataImp(root, data);
    }

    private Node<T> insertDataImp(Node<T> root, T data) {
        Node<T> newNode = new Node<T>(data);
        if (root == null) {
            root = newNode;
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertDataImp(root.left, data);
        } else {
            root.right = insertDataImp(root.right, data);
        }
        return root;
    }

}