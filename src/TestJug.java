import prJugs.*;

public class TestJug {


    public static void main (String[] args) {
        Jug jugA = new Jug(7);
        Jug jugB = new Jug(4);

        System.out.println("Jug A = " + jugA.toString());
        System.out.println("Jug B = " + jugB.toString());
        jugA.fill();
        System.out.println("Jug A = " + jugA.toString());
        System.out.println("Jug B = " + jugB.toString());
        jugB.pourFrom(jugA);
        System.out.println("Jug A = " + jugA.toString());
        System.out.println("Jug B = " + jugB.toString());
        jugB.empty();
        System.out.println("Jug A = " + jugA.toString());
        System.out.println("Jug B = " + jugB.toString());
        jugB.pourFrom(jugA);
        System.out.println("Jug A = " + jugA.toString());
        System.out.println("Jug B = " + jugB.toString());

    }

}
