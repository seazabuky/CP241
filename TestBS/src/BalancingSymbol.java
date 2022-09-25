import javax.swing.JOptionPane;
public class BalancingSymbol {
    public static void main(String[] args) throws Exception{
        String text;
        char symbol;
        LinkedStack stack = new LinkedStack();
        //ArrayStack stack = new ArrayStack();
        try{
        text = JOptionPane.showInputDialog("What is your expression?");
        text = text.replace(" ","");
        for(int i = 0;i<text.length();i++){
            symbol = text.charAt(i);
            if(symbol=='(' || symbol=='{' ||symbol=='['){
                stack.push(symbol);
            }
            if(symbol==')' || symbol=='}' ||symbol==']'){
                if (stack.isEmpty()){
                    throw new Exception("Stack is empty :Not Balancing Symbol");
                }
                char temp =(char) stack.top();
                if(symbol==')'&&temp=='('||symbol=='}'&&temp=='{'||symbol==']'&&temp=='['){
                    stack.pop();
                }else
                    throw new Exception("Symbol doesn't match at position "+(i+1)+" :Not Balancing Symbol");
            }
        }
        if(stack.isEmpty())
             JOptionPane.showMessageDialog(null,"The expression is balanced");
        else
            throw new Exception("Illegal Expression : Not Balancing Symbol");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            System.exit(0);
        }
    }
}