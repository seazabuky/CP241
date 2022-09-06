import javax.swing.*;
import java.text.DecimalFormat;
public class TestStudentADT {
    static StudentADT data;
    static int total;
    static Student std;
    
    public static void main(String[] args)throws Exception{
        try{
        total = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of students: "));
        data = new StudentArray();
        //data = new StudentLinkedList();
        if ((data.full() || total > data.getLength() && data.getLength() != -1)|| total <= 0){
            throw new Exception("Wrong input: please input a number less than 100 and not 0");
        }
        readData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        finally{
            printTable();
        }
    }
    public static void readData(){
        String id,name;
        double mid,fin,quiz,prj,col;
        for(int i=0;i<total;i++){
            id = JOptionPane.showInputDialog(null,"Input ID of student."+(i+1));
            name = JOptionPane.showInputDialog(null,"Input name of student."+(i+1));
            mid = Double.parseDouble(JOptionPane.showInputDialog(null,"Input mid-score of student."+(i+1)));
            fin = Double.parseDouble(JOptionPane.showInputDialog(null,"Input final-score of student."+(i+1)));
            quiz = Double.parseDouble(JOptionPane.showInputDialog(null,"Input quiz-score of student."+(i+1)));
            col = Double.parseDouble(JOptionPane.showInputDialog(null,"Input collaboration-score of student."+(i+1)));
            prj = Double.parseDouble(JOptionPane.showInputDialog(null,"Input project-score of student."+(i+1)));
            std = new Student(id,name,mid,fin,quiz,col,prj);
            data.setCurrentStudent(std);
        }
    }
    public static void printTable(){
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0;i<total;i++){
            std = data.getCurrentStudent();
            System.out.println("\nID: "+std.getId()+" Name: "+std.getName()+" Mid-score: "+df.format(std.getMidScore())+" Final-score: "+df.format(std.getFinalScore())+" Quiz-score: "+
            df.format(std.getQuizScore())+" Collaboration-score: "+df.format(std.getCollabScore())+" Project-score: "+df.format(std.getPrjScore())+" Total-score: "+df.format(std.getTotalScore())+"\n");
        }
        System.out.println("Statistics\n"+"Max: "+df.format(data.getMax())+"\nMin: "+df.format(data.getMin())+"\nMean: "+df.format(data.getMean())+"\nSD: "+df.format(data.getSD())+"\nTotal: "+df.format(data.getTotal()));
}
}