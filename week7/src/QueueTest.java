import javax.swing.*;
public class QueueTest {
    public static void main(String[] args) throws Exception {
        String choice;
        int ch = 0;
        Object obj;
        Student e;

        ArrayQueue queue = new ArrayQueue();
        //LinkedQueue queue = new LinkedQueue();
        while(ch != 5){
            try{
                choice = JOptionPane.showInputDialog(null,
                "------------------------------------ \n"+
                "                 Menu \n"+
                "------------------------------------ \n"+
                "       1. Enqueue \n"+
                "       2. Dequeue \n"+
                "       3. Front \n"+
                "       4. Clear \n"+
                "       5. Exit \n"+
                "------------------------------------ \n");
                ch = Integer.parseInt(choice);
                switch(ch){
                    case 1:
                        e = getElement();
                        obj=e;
                        queue.enqueue(obj);
                        break;
                    case 2:
                        obj = queue.dequeue();
                        e = (Student)obj;
                        printElement(e);
                        break;
                    case 3:
                        obj = queue.front();
                        e = (Student)obj;
                        printElement(e);
                        break;
                    case 4:
                        queue.clear();
                        JOptionPane.showMessageDialog(null, "Queue is cleared");
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