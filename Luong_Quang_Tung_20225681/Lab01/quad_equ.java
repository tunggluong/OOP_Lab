//2.2.6c
import javax.swing.JOptionPane;
public class quad_equ {
    public static void main(String[] args){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a: "));
        if(a==0){
            System.out.println("a must be different to 0");
        }
        else{
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c: "));
        double delta=Math.pow(b, 2)-4*a*c;
        if(delta<0){
            System.out.println("Complex solution");
        }
        else if(delta==0){
            System.out.println("x1=x2="+(-b/(2*a)));
        }
        else{
            System.out.println("x1="+(-b+Math.sqrt(delta))/(2*a)+" ,x2="+(-b-Math.sqrt(delta))/(2*a));
        }
        }
    }
}
