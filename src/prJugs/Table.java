package prJugs;

public class Table {

    private Jug j1;
    private Jug j2;

    public Table(Jug j1, Jug j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    public Table(int cap1, int cap2) {
        this.j1 = new Jug(cap1);
        this.j2 = new Jug(cap2);
    }

    public int getContent(int id) {
        if (id == 1)
            return j1.getContent();
        else if (id == 2)
            return j2.getContent();
        else
            throw new RuntimeException("Wrong jug id");

    }

    public int getCapacity(int id) {
        if (id == 1)
            return j1.getCapacity();
        else if (id == 2)
            return j2.getCapacity();
        else
            throw new RuntimeException("Wrong jug id");

    }

    public void fill (int id) {
        if (id == 1)
            j1.fill();
        else if (id == 2)
            j2.fill();
        else
            throw new RuntimeException("Wrong jug id");
    }

    public void empty (int id) {
        if (id == 1)
            j1.empty();
        else if (id == 2)
            j2.empty();
        else
            throw new RuntimeException("Wrong jug id");
    }

    public void pourFrom (int id) {
        if (id == 1)
            j2.pourFrom(j1);
        else if (id == 2)
            j1.pourFrom(j2);
        else
            throw new RuntimeException("Wrong jug id");
    }

    public String toString() {
        return ("Table(" + j1.toString() + ", " + j2.toString() + ")");
    }

}













