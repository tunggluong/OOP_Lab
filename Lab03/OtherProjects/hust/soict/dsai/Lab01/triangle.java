//6.3
import java.util.Scanner;
public class triangle {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the height of triangle: ");
        int height=keyboard.nextInt();
        int ast_count=1, spc_count=height-1;
        for(int i=0;i<height;i++){
            for(int j=0;j<spc_count;j++){
                System.out.print(" ");
            }
            spc_count--;
            for(int k=0;k<ast_count;k++){
                System.out.print("*");
            }
            ast_count+=2;
            System.out.print("\n");
        }
        keyboard.close();
    }
}
