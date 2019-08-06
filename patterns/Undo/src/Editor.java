import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Editor {
    public JTextArea textField;
    public String bufferObmen;
    private CompletedCommands completed = new CompletedCommands();
    public void init() {
        JFrame windowBorder = new JFrame();
        JPanel content = new JPanel();
        windowBorder.setContentPane(content);
        windowBorder.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;
        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DoCommand(new Copy(editor));
            }
        });
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DoCommand(new Cut(editor));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DoCommand(new Paste(editor));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        windowBorder.setSize(450, 200);
        windowBorder.setLocationRelativeTo(null);
        windowBorder.setVisible(true);
    }
    private void DoCommand(AllCommands allCommands) {
        if (allCommands.DO()) {
            completed.push(allCommands);
        }
    }
    private void undo() {
        if (completed.isEmpty()) return;
        AllCommands allCommands = completed.pop();
        if (allCommands != null) {
            allCommands.undo();
        }
    }
}