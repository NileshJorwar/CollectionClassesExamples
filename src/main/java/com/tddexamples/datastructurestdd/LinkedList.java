package com.tddexamples.datastructurestdd;

class NodeOfList {
    int data;
    NodeOfList next;

    NodeOfList(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    public NodeOfList insert(NodeOfList head, int data) {
        NodeOfList newNode = new NodeOfList(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeOfList n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
        return head;
    }

    public NodeOfList insertAt(NodeOfList head, int data, int position) {
        NodeOfList newNode = new NodeOfList(data);

        if (head == null) {
            head = newNode;
        } else if (position == 1 && head != null) {
            newNode.next = head;
            head = newNode;
        } else {
            NodeOfList n = head;
            for (int i = 0; i < position - 2; i++)
                n = n.next;
            newNode.next = n.next;
            n.next = newNode;
        }
        return head;
    }

    public NodeOfList deleteAt(NodeOfList head, int position) {
        if (position == 1)
            head = head.next;
        else {
            NodeOfList node = head;
            for (int i = 0; i < position - 2; i++)
                node = node.next;
            NodeOfList node2 = node.next;
            node.next = node2.next;
        }
        return head;
    }

    public NodeOfList delete(NodeOfList head, int data) {

        if (head == null)
            return null;

        if (head != null && head.data == data) {
            head = head.next;
        }

        NodeOfList temp = head;
        NodeOfList prev = null;
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null)
            prev.next = temp.next;

        return head;
    }

    public void show(NodeOfList head) {
        NodeOfList newNode = head;
        while (newNode.next != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
        System.out.println(newNode.data);
    }
}
