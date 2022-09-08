import javax.swing.*;
public class StackTest {
    public static void main(String[] args) throws Exception {
        String choice;
        int ch = 0;
        Object obj;
        Student e;

        ArrayStack stack = new ArrayStack();
        //LinkedStack stack = new LinkedStack();
        while(ch != 5){
            try{
                choice = JOptionPane.showInputDialog(null,
                "------------------------------------ \n"+
                "                 Menu \n"+
                "------------------------------------ \n"+
                "       1. Push \n"+
                "       2. Pop \n"+
                "       3. Top \n"+
                "       4. Clear \n"+
                "       5. Exit \n"+
                "------------------------------------ \n");
                ch = Integer.parseInt(choice);
                switch(ch){
                    case 1:
                        e = getElement();
                        obj=e;
                        stack.push(obj);
                        break;
                    case 2:
                        obj = stack.pop();
                        e = (Student)obj;
                        printElement(e);
                        break;
                    case 3:
                        obj = stack.top();
                        e = (Student)obj;
                        printElement(e);
                        break;
                    case 4:
                        stack.clear();
                        JOptionPane.showMessageDialog(null, "Stack is cleared");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Goodbye");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice");
                        break;
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.exit(0);
                }
            }
        }
        
        public static Student getElement(){
            Student temp;
            String idS = JOptionPane.showInputDialog(null,"Please input ID: ");
            String nameS = JOptionPane.showInputDialog(null,"Please input name: ");
            double midS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Midterm score: "));
            double finalS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Final score: "));
            double quizS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Quiz score: "));
            double prjS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Project score: "));
            double collabS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Collaboration score: "));
            temp = new Student();
            temp.setStudent(idS, nameS, midS, finalS, quizS, prjS, collabS);
            return temp;
        }
        
        public static void printElement(Student e){
            if (e != null){
                JOptionPane.showMessageDialog(null,
                 "ID: "+e.getId()+
                 "\nName: "+e.getName()+
                 "\nMidterm score: "+e.getMidScore()+
                 "\nFinal score: "+e.getFinalScore()+
                 "\nQuiz score: "+e.getQuizScore()+
                 "\nProject score: "+e.getPrjScore()+
                 "\nCollaboration score: "+e.getCollabScore());
            }
        }

}