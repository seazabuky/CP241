import javax.swing.*;
public class QueueTest {
    public static void main(String[] args) throws Exception {
        String choice;
        int ch = 0;
        Student e;
        QueueTest test = new QueueTest();
        Object obj;

        //ArrayList list = new ArrayList();
        //LinkedList list = new LinkedList();
        DoubleLinkedList list = new DoubleLinkedList();
        while(ch != 8){
            try{
                choice = JOptionPane.showInputDialog(null,
                "------------------------------------ \n"+
                "                 Menu \n"+
                "------------------------------------ \n"+
                "       1. Insert \n"+
                "       2. Retrieve \n"+
                "       3. Delete \n"+
                "       4. Update \n"+
                "       5. Find First \n"+
                "       6. Find Next \n"+
                "       7. Find Key \n"+
                "       8. Exit \n"+
                "------------------------------------ \n");
                ch = Integer.parseInt(choice);
                switch(ch){
                    case 1:
                        e = test.getElement();
                        obj=e;
                        list.insert(e);
                        break;
                    case 2:
                        obj = list.retrive();
                        e = (Student) obj;
                        test.printElement(e);
                        break;
                    case 3:
                        list.delete();
                        break;
                    case 4:
                        if (list.isEmpty()){
                            obj=null;
                            list.update(obj);
                        }
                        else{
                        e = test.getElement();
                        obj=e;
                        list.update(obj);
                        break;}
                    case 5:
                        list.findFirst();
                        obj = list.retrive();
                        e = (Student) obj;
                        test.printElement(e);
                        break;
                    case 6:
                        list.findNext();
                        obj = list.retrive();
                        e = (Student) obj;
                        test.printElement(e);
                        break;
                    case 7:
                        if(list.isEmpty()){
                            throw new Exception("List is empty");
                        }else{
                        String key = JOptionPane.showInputDialog(null,"Enter the id to find: ");
                        list.findFirst();
                        while (list.retrive()!=null){
                            obj = list.retrive();
                            e = (Student) obj;
                            if(e.getId().equals(key)){
                                test.printElement(e);
                                break;}
                            list.findNext();
                        }
                        break;}
                    case 8:
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
        
        public Student getElement(){
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
        
        public void printElement(Student e){
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