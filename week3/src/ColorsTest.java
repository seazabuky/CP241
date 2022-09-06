import javax.swing.*;
public class ColorsTest {
    public static void main(String[] args) {
        char choice;
        String inpStr;
        MyColor.ColorsEnum color1,color2;
        MyColor.ColorsEnum color3[] = new MyColor.ColorsEnum[2];
        MyColor mixColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor pColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor formColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor assignColor = new MyColor(MyColor.ColorsEnum.RED);
        choice = 0;
        try{
        while  (choice != '9'){
            boolean result1,result2;
            inpStr = JOptionPane.showInputDialog("Test operations on MyColor class\n"
                    + "1. mix\n"
                    + "2. primary\n"
                    + "3. form\n"
                    + "4. assign\n"
                    + "9. exit\n"
                    + "Enter your choice: ");
            choice = inpStr.charAt(0);
            if(choice=='1'){//mix
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Enter the first primary color:").toUpperCase());
                while(pColor.primary(color1)==false){
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Invalid color. Enter the first primary color:").toUpperCase());
                }

                color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Enter the second primary color:").toUpperCase());
                while(pColor.primary(color2)==false){
                    color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Invalid color. Enter the second primary color:").toUpperCase());
                }
                System.out.println(mixColor.mix(color1,color2));
            }
            else if(choice=='2'){//primary
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Enter the color:").toUpperCase());
                if(pColor.primary(color1)==true){
                    System.out.println("A primary color");
                }
                else{
                    System.out.println(color1 + "\nNot a primary color");
                }
            }
            else if(choice=='3'){//form
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Enter the color:").toUpperCase());
                while(pColor.primary(color1)==true){
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Invalid Color! Enter the color that is not primary:").toUpperCase());
                }
                color3 = formColor.form(color1);
                System.out.println(color3[0] + " " + color3[1]+" that form the color "+color1);
            }
            else if(choice=='4'){//assign
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Enter the first primary color:").toUpperCase());
                color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog("Enter the second color to replace the previous one:").toUpperCase());
                System.out.println("The first color was assigned to "+assignColor.assign(color2));
            }
            else if(choice=='9'){//exit
                JOptionPane.showMessageDialog(null,"Exit Program");
                System.exit(0);
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid choice");
                continue;
            }
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error: Wrong input");
    }
    }
}
