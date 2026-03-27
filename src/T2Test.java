import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Component;
import javax.swing.*;

class T2Test {
    //unit test 1
    @Test
    void frameinfo(){
        var t2 = new T2();
        JPanel panel1=t2.panel_west();
        assertNotNull(panel1);
        assertEquals(3,panel1.getComponentCount());
    }
    //unit test 2
    @Test
    void frameinfo2(){
        var t02 = new T2();
        JScrollPane panel2=t02.center_text();
        assertNotNull(panel2);
        JTextArea textArea = (JTextArea) panel2.getViewport().getView();
        assertTrue(textArea.getLineWrap());
    }
    //integration test
    @Test
    void frameinfofinal(){
        T2 t002 = new T2();
        JFrame frame = t002.frame;

        assertNotNull(frame);

        assertEquals(4, frame.getContentPane().getComponentCount());

        JPanel westPanel = (JPanel) frame.getContentPane().getComponent(1);
        assertEquals(3, westPanel.getComponentCount());

        JButton submitButton = (JButton) frame.getContentPane().getComponent(2);
        assertEquals("submit", submitButton.getText());

        Component center = frame.getContentPane().getComponent(3);
        assertTrue(center instanceof JScrollPane);
    }

}