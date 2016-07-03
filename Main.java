import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame("Sqwing - Squeak in javax.swing");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Panel());
        window.pack();
        System.out.println("WIP");
    }
}
