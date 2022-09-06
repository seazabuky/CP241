import javax.swing.*;
public class StatTest {
    public static void main(String[] args) {
        int total;
        int number =0;
        Stat statAdt =new Stat();
        total = Integer.parseInt(JOptionPane.showInputDialog("Enter number of element"));
        if (total <= statAdt.number.length){ 
            for (int i=0;i<total;i++){
                number = Integer.parseInt(JOptionPane.showInputDialog("Input number"));
                statAdt.setData(i,number);
            }
            statAdt.setTotal(total);
            System.out.println();
            System.out.println("Input data are :");
            for(int j = 0;j<statAdt.getTotal();j++){
                System.out.println(statAdt.getData(j)+"");
            }
            System.out.println("\n");
            System.out.format("%-15s %3d number is %6.1f\n","Mean of these",statAdt.getTotal(),statAdt.getMean());
            System.out.format("%-15s %3d number is %6.1f\n","Max of these",statAdt.getTotal(),statAdt.getMax());
            System.out.format("%-15s %3d number is %6.1f\n","Min of these",statAdt.getTotal(),statAdt.getMin());
            System.out.format("%-15s %3d number is %6.1f\n","SD of these",statAdt.getTotal(),statAdt.getSD());
        }
        else{
            JOptionPane.showMessageDialog(null,"Number of element is more than " + statAdt.number.length);
            main(args);
        }
    }
}

