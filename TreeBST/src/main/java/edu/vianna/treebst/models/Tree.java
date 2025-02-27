package edu.vianna.treebst.models;

public class Tree {
    private Node root;

    public Tree() {}
    public Tree(Node root) {
        this.root = root;
    }

    public void InsertNode(long id) {
        Node current = this.root;
        while (current != null) {
            if (id == current.getId()) {
                return;
            } else if (id < current.getId()) {
                if (current.getLeftSon() == null) {
                    current.setLeftSon(new Node(id));
                    return;
                } else {
                    current = current.getLeftSon();
                }
            } else if (id > current.getId()) {
                if (current.getRightSon() == null) {
                    current.setRightSon(new Node(id));
                    return;
                } else {
                    current = current.getRightSon();
                }
            }
        }
    }

    public Node SearchNode(long id) {
        Node current = this.root;
        while (current != null) {
            if (id == current.getId()) {
                return current;
            } else if (id < current.getId()) {
                current = current.getLeftSon();
            } else if (id > current.getId()) {
                current = current.getRightSon();
            }
        }
        return null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
