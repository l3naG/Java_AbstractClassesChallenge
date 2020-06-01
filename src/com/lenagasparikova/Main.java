package com.lenagasparikova;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);

        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String [] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.remove(new Node("3"));
        list.traverse(list.getRoot());

        list.remove(new Node("5"));
        list.traverse(list.getRoot());

        list.remove(new Node("1"));
        list.traverse(list.getRoot());

        list.remove(new Node("0"));
        list.remove(new Node("2"));
        list.remove(new Node("6"));
        list.traverse(list.getRoot());

        list.remove(new Node("4"));
        list.remove(new Node("8"));
        list.traverse(list.getRoot());
        list.remove(new Node("9"));
        list.traverse(list.getRoot());
        list.remove(new Node("7"));
        list.traverse(list.getRoot());
    }
}
