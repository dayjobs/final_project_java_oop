import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import Fishes.*; // This lets the panel see Fish, Betta, etc.

public class AquariumPanel extends JPanel {
    private ArrayList<Fish> tank = new ArrayList<>(); // Composition
    
    // References to your main UI components
    private JTextField nameField;
    private JRadioButton btnBetta;
    private JRadioButton btnClown;
    private JRadioButton btnGold;
    private JRadioButton btnGuppy;

    // Constructor matching the exact parameters from your main file line
    public AquariumPanel(JTextField nameField, JRadioButton betta, JRadioButton clown, JRadioButton gold, JRadioButton guppy) {
        this.nameField = nameField;
        this.btnBetta = betta;
        this.btnClown = clown;
        this.btnGold = gold;
        this.btnGuppy = guppy;

        setBackground(new Color(240, 248, 255)); // Soft blue background
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Clean black border border

        // Listen for mouse clicks on the canvas
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    name = "Unnamed";
                }

                Fish newFish = null;
                int clickX = e.getX();
                int clickY = e.getY();

                // Polymorphism: Check which fish type is selected
                if (btnBetta.isSelected()) {
                    newFish = new Betta(name, clickX, clickY);
                } else if (btnClown.isSelected()) {
                    newFish = new Clownfish(name, clickX, clickY);
                } else if (btnGold.isSelected()) {
                    newFish = new Goldfish(name, clickX, clickY);
                } else if (btnGuppy.isSelected()) {
                    newFish = new Guppy(name, clickX, clickY);
                }

                // If a fish was successfully created, add it to our array list tank
                if (newFish != null) {
                    tank.add(newFish);
                    nameField.setText(""); // Clear the text field for the next fish
                    repaint(); // Tell Swing to refresh the screen and redraw the tank
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Polymorphism: Loop through the array and call the unique draw method for each fish
        for (Fish f : tank) {
            f.draw(g);
        }
    }
}
