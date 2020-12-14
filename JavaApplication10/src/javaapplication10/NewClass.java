package javaapplication10;

public class NewClass
{

    protected ScientificBook data;
    protected Item next;
    protected Item temp;

    public NewClass(ScientificBook data, Item next) 
    {
        this.data = data;
        this.next = next;
    }

    public NewClass() {
        this.data = null;
        this.next = null;
    }
}
