package edu.vianna.treebst.models;

public class Node {
    private long id;
    private Node leftSon;
    private Node rightSon;

    public Node() {
        this.leftSon = null;
        this.rightSon = null;
    }

    public Node(long id ) {
        this.id = id;
        this.leftSon = null;
        this.rightSon = null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }
}
