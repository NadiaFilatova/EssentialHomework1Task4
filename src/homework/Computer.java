package homework;

public class Computer {
    String string;

    public static void main(String[] args) {

        Computer[] computer = new Computer[5];
        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();


        for (int i = 0; i < 5; i++) {
            computer[i].string = " рядок за індексом " + i;
        }


        for (Computer comp : computer) {
            System.out.println("рядок: " + comp.string);
        }
    }
}
