package com.lenagasparikova;

public interface NodeList  {

    ListItem getRoot(); // head of the list
    boolean addItem(ListItem item);
    boolean remove(ListItem item);
    void traverse(ListItem root);

}
