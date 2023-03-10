import javax.swing.*;
public class ButtonExample
{
      public static void main(String agrs[])
     {
             JFrame f = new JFrame("ButtonExample");
             JButton b = new JButton("Click Here");
             b.setBounds(50,100,90,30);
             f.add(b);
			 f.setTitle("ButtonExample");
             f.setSize(300,300);
             f.setLayout(null);
             f.setVisible(true);
     }
}   
