//2.2.6a
import javax.swing.JOptionPane;
public class linear_equ {
    public static void main(String[] args){
        double a, b;
        a=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a: "));
        b=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b: "));
        if(a==0){
            if(b==0){
                System.out.println("Inf solutions");
            }
            else{
                System.out.println("No solution");
            }
        }
        else{
            System.out.println("The solution of "+a+"x +"+b+"= 0 is "+ (-b/a));
        }
    }
}
