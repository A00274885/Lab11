import javax.swing.*;
import java.awt.*;

public class View extends JFrame
{
    TextArea mainText = new TextArea();

    JButton button = new JButton("Search");

    JPanel textPanel = new JPanel();
    JPanel inputPanel = new JPanel();

    Container mainContainer = this.getContentPane();
    View()
    {
        this.setLayout(new BoxLayout(mainContainer,BoxLayout.PAGE_AXIS));
        this.setSize(750,750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    void init()
    {
        mainText.setEditable(false);
        textPanel.add(mainText);
        inputPanel.add(button);

        mainContainer.add(textPanel);
        mainContainer.add(inputPanel);

        this.setVisible(true);
    }


}
