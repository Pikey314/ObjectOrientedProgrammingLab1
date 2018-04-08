package prJugs;

public class Jug {

    private int content;
    private final int capacity;

    public Jug (int initialCapacity) {
        this.capacity = initialCapacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getContent() {
        return this.content;
    }

    public void fill() {
        this.content = this.capacity;
    }

    public void empty() {
        this.content = 0;
    }

    public void pourFrom (Jug j) {
        int addedContent = this.content + j.getContent();
        if (addedContent > this.capacity) {
            this.content = this.capacity;
            j.content = addedContent -  this.capacity;
        } else {
            this.content = addedContent;
            j.content = 0;

        }

    }





    public String toString() {
        return ("(" + this.content + "," + this.capacity + ")");
    }
}
