package bar;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Bar extends Thread{
    private JLabel jLabel;
    private ImageIcon[] icons = new ImageIcon[8];
    
    
    public Bar(JLabel jLabel) {
        this.jLabel = jLabel;
        ImageIcon apple = new ImageIcon(getClass().getResource("/Apple.png"));
        ImageIcon bar = new ImageIcon(getClass().getResource("/Bar.png"));
        ImageIcon bell = new ImageIcon(getClass().getResource("/Bell.png"));
        ImageIcon lucky = new ImageIcon(getClass().getResource("/LuckySeven.png"));
        ImageIcon mango = new ImageIcon(getClass().getResource("/Mango.png"));
        ImageIcon orange = new ImageIcon(getClass().getResource("/Orange.png"));
        ImageIcon star = new ImageIcon(getClass().getResource("/Star.png"));
        ImageIcon watemelon = new ImageIcon(getClass().getResource("/Watermelon.png"));
        
        icons = new ImageIcon[]{apple,bar,bell,lucky,mango,orange,star,watemelon};
        
        
    }

    @Override
    public void run() {
        job();
    }
    
    public void job(){
        for(int i=0;i<500000;i++){
            int n = new Random().nextInt(icons.length);
            jLabel.setIcon(icons[n]);
        }
    }
    
}
