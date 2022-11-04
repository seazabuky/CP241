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
		while(ch != 8)
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
				"        5. Sort \n"+
				"        6. Find Key \n"+
				"        7. PrintAll\n"+
				"        8. Exit \n"+
				" ----------------------------------\n");
			ch = Integer.parseInt(choice);
			switch (ch)
			{
			case 1:
						list.insert(67);
						list.insert(32);
						list.insert(75);
						list.insert(68);
						list.insert(58);
						list.insert(55);
						list.insert(90);
						list.insert(35);
						list.insert(40);
						list.insert(83);
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
						//sort
						list.findFirst();
						System.out.println("-----------------------------------------");
						list.printAll();
						System.out.println("-----------------------------------------");
						int type = Integer.parseInt(JOptionPane.showInputDialog(null,
					   " ---------------------------------- \n"+
					   "                          Sort \n"+
					   " ---------------------------------- \n"+
					   "        1. Quick Sort\n"+
					   "        2. Heap Sort\n"+
					   " ----------------------------------\n"));
						list.sort(type);
						System.out.println("-----------------------------------------");
						break;

			case 6:
						//find key
						if (list.findkey(67)){
								System.out.println("Found your key: "+list.retrieve());
								System.out.println("-----------------------------------------");
						}else{
								JOptionPane.showMessageDialog(null,"Not Found");
								System.out.println("-----------------------------------------");
							}
						break;


			case 7:
						list.findFirst();
						for(int i = 0;i<list.getSize();i++)
						{
								System.out.print(list.retrieve()+" " );
								list.findNext();
						}
						break;
			case 8:
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
