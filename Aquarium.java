import javax.swing.*;
import java.awt.*;
import Fishes.*;

public class Aquarium extends JPanel{
    public static void main(String[] args){
        JFrame frame = new JFrame("Fish App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 650);
        frame.setLayout(new BorderLayout(10,10));

        JLabel headerLabel = new JLabel(" Aquarium App", SwingConstants.CENTER); 
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(headerLabel, BorderLayout.NORTH);

        JTextFeild nameInputField = new JTextField(15);
        nameInputField.setToolTipText("Ex: Bubbles");

        JRadioButton rdoBetta = new JRadioButton("Betta", true);
        JRadioButton rdoClown = new JRadioButton("Clownfish");
        JRadioButton rdoGold = new JRadioButton("Goldfish");
        JRadioButton rdoGuppy = new JRadioButton("Guppy");

        // this groupn ensures that one fish can be active at one time
        ButtonGroup fishGroup = new ButtonGroup();
        fishGroup.add(rdoBetta);
        fishGroup.add(rdoClown);
        fishGroup.add(rdoGold);
        fishGroup.add(rdoGuppy);

        JPanel controlContainer = new JPanel(new BorderLayout(5,5));

        JLabel sectionLabel = new JLabel("Create your fish");
        sectionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        sectionLabel.setBorder(BorderFactory.createMatteBorder(1,0,1,0, Color.BLACK));
        controlContainer.add(sectionLabel, BorderLayout.NORTH);
        
        JPanel formGrid = new JPanel(new GridLayout(1,2,20,10));
        formGrid.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JPanel namePanel = new JPanel(new BorderLayout(5, 5));
        namePanel.add(new JLabel("Name:"), BorderLayout.NORTH);
        namePanel.add(nameInputField, BorderLayout.CENTER);

        // Type Right Subpanel Grid
        JPanel typePanel = new JPanel(new BorderLayout());
        typePanel.add(new JLabel("Type:"), BorderLayout.NORTH);
        
        JPanel radioGrid = new JPanel(new GridLayout(2, 2, 5, 5));
        radioGrid.add(rdoClown);
        radioGrid.add(rdoGuppy);
        radioGrid.add(rdoBetta);
        radioGrid.add(rdoGold);
        typePanel.add(radioGrid, BorderLayout.CENTER);

        formGrid.add(namePanel);
        formGrid.add(typePanel);
        controlContainer.add(formGrid, BorderLayout.CENTER);

        // 4. Center Aquarium View Panel Assembly
        // We pass control references so click actions read the values instantly
        AquariumPanel tankPanel = new AquariumPanel(nameInputField, rdoBetta, rdoClown, rdoGold, rdoGuppy);

        // 5. Final Master Frame Attachment
        frame.add(tankPanel, BorderLayout.CENTER);
        frame.add(controlContainer, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}