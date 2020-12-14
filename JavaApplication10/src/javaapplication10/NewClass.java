package javaapplication10;



public class Item 
{

    protected ScientificBook data;
    protected Item next;
    protected Item temp;

    public Item(ScientificBook data, Item next) {
        this.data = data;
        this.next = next;
    }

    public Item() {
        this.data = null;
        this.next = null;
    }
}
