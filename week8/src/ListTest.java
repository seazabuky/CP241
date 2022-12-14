import javax.swing.*;
class ListTest 
{
	
	public static void main(String[] args) throws Exception
	{
		String choice;
		int ch = 0;
		int e;
		ListTest test = new ListTest();
		Object obj;

		ArrayList list = new ArrayList();
		while(ch != 10)
		{
		try{
			choice = JOptionPane.showInputDialog(null,
				" ---------------------------------- \n"+
				"                          Menu \n"+
				" ---------------------------------- \n"+
				"        1. Insert\n"+
				"        2. Retrieve\n"+
				"        3. Delete \n"+
				"        4. Update \n"+
				"        5. Find First \n"+
				"        6. Find Next \n"+
				"        7. Find Key \n"+
				"        8. Sort \n"+
				"        9. Clear \n"+
				"        10. Exit \n"+
				" ----------------------------------\n");
			ch = Integer.parseInt(choice);
			switch (ch)
			{
			case 1:
						list.insert(57);
						list.insert(92);
						list.insert(1);
						list.insert(43);
						list.insert(25);
						list.insert(72);
						list.insert(82);
						break;
			case 2:
						obj = list.retrieve();
						e = (Integer) obj;
						test.printElement(e);
						break;
			case 3:
						list.delete();
						break;

			case 4:
						e = test.getElement();
						obj=e;
						list.update(e);
						break;

			case 5:
						list.findFirst();
						break;

			case 6:
						list.findNext();
						break;

			case 7:
						e = test.getElement();
						obj=e;
						if (list.findkey(e))
								JOptionPane.showMessageDialog(null,"Found "+list.retrieve());
						else
								JOptionPane.showMessageDialog(null,"Not Found");
						break;

			case 8:
				       int type = Integer.parseInt(JOptionPane.showInputDialog(null,
					   " ---------------------------------- \n"+
					   "                          Sort \n"+
					   " ---------------------------------- \n"+
					   "        1. Bubble Sort\n"+
					   "        2. Selection Sort\n"+
					   "        3. Insertion Sort \n"+
					   "        4. Quick Sort\n"+
					   " ----------------------------------\n"));
						list.sort(type);
						break;
			case 9:
						list.clear();
						break;
			case 10:
						JOptionPane.showMessageDialog(null,
								"----------End Program ----------",
								"Quit",
								JOptionPane.INFORMATION_MESSAGE);
						break;
			default :
						JOptionPane.showMessageDialog(null,
								"Not a correct choice, try again",
								"Error",
								JOptionPane.ERROR_MESSAGE);
						break;

			}
		}catch (Exception err){
				 JOptionPane.showMessageDialog(null,err.getMessage());
		}

		}
		
	}
		
	public int getElement()
	{
		int temp = Integer.parseInt(JOptionPane.showInputDialog(null,"Please input number :"));
		return temp;
	}
	public void printElement(int e)
	{
			JOptionPane.showMessageDialog(null,e	);	
	}

}
