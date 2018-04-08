import prJugs.*;

public class TestTable {

    public static void main (String[] args) {
        Table table = new Table(5,7);
        System.out.println(table.toString());
        table.fill(1);
        System.out.println(table.toString());
        table.pourFrom(1);
        System.out.println(table.toString());
        table.fill(1);
        table.pourFrom(1);
        System.out.println(table.toString());
        table.empty(2);
        table.pourFrom(1);
        System.out.println(table.toString());
        table.fill(1);
        table.pourFrom(1);
        System.out.println(table.toString());



    }

}
