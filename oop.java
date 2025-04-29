class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

public class oop {
    public static void main (String args[]) {
        Pen pen1 = new Pen();
        pen1.type = "gel";
        pen1.color = "blue";

        Pen pen2 = new Pen();
        pen2.type = "ballpoint";
        pen2.color = "black";

        pen1.printcolor();
        pen2.printcolor();
    }
    
}
