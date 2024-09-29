//2.2.5
import javax.swing.JOptionPane;
public class Caculator {
    public static void main(String[] args){
        double num1, num2;
        num1=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number: "));
        num2=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number: "));
        System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));
        System.out.println("The difference of "+num1+" and "+num2+" is "+(num1-num2));
        System.out.println("The product of "+num1+" and "+num2+" is "+(num1*num2));
        if(num2==0){
            System.out.println("The divisor must be different to 0");        
        }
        else{
            System.out.println("The quotient of "+num1+" to "+num2+" is "+(num1/num2));
        }
    }
        
}
