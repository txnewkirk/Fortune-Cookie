import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main implements ActionListener {
    private static JLabel generateLabel;
    private static JLabel welcomeLabel;
    private static JButton generateButton;
    private static JLabel Fortune;

    public static void main(String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        //generate label created
        generateLabel = new JLabel("Let's Generate You're Fortune.");
        generateLabel.setBounds(10, 50, 200, 25);
        panel.add(generateLabel); //add label to the panel

        //welcome label created
        welcomeLabel = new JLabel("Welcome User !");
        welcomeLabel.setBounds(10, 20, 200, 25);
        panel.add(welcomeLabel); //add label to the panel

        //generateButton created
        generateButton = new JButton("Generate");
        generateButton.setBounds(10, 80, 80, 25);
        generateButton.addActionListener(new Main()); //add buttons action event listener.
        panel.add(generateButton);  //add login button to the panel

        //Fortune label created
        Fortune = new JLabel("");
        Fortune.setBounds(10, 110, 600, 25);
        panel.add(Fortune); // add success label to the panel

        frame.setVisible(true); //display gui
    }
    /*
        once generate button is clicked, a random fortune will be generated.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String[] fortunes = {"Hard work pays off in the future, laziness pays off now.",
                "Change can hurt, but it leads a path to something better.",
                "Enjoy the good luck a companion brings you.", "You will discover a new strength in an ongoing battle.",
                "Today it's up to you to create the peacefulness you long for.",
                "If you refuse to accept anything but the best, you very often get it.",
                "If you have something good in your life, don't let it go!",
                "A dream you have will come true.",
                "Wealth awaits you if you stay on your current path.",
                "People are naturally attracted to you.",
                "You will bring the light into someones darkness.",
                "What ever you're goal is in life, embrace it, visualize it, and for it will be yours."};
        Random rand = new Random();
        int r = rand.nextInt(fortunes.length);
        Fortune.setText(fortunes[r]);


    }
}
