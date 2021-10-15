import com.mycompany.marketplaceex.HomePanel;
import Service.PublicVariables;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class main {
    private static HomePanel marketplaceFormEx;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setTitle(PublicVariables.APP_TITLE);
                frame.getContentPane().add(new HomePanel());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
