//2.2.6b
import javax.swing.JOptionPane;
public class linear_sys {
    public static void main(String[] args){
        double a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a1: "));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b1: "));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c1: "));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a2: "));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b2: "));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c2: "));
        double D1=a1*b2-a2*b1;
        double D2=c1*b2-c2*b1;
        double D3=a1*c2-a2*c1;
        if(D1==0){
            if(D2==0){
                System.out.println("Inf solutions");
            }
            else{
                System.out.println("No solution");
            }
        }
        else{
            System.out.println("x="+(D2/D1)+" y="+(D3/D1));
        }
    }
}
