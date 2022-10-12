class  ArrayList implements ListADT
{
	private int total;
	private Object list[];
	int current,size;

	public ArrayList()
	{
		List();
	}

	public void List()
	{
		current= -1;
		total = 100;
		size=0;
		list = new Object[total];

	}

	public void insert(Object e) throws Exception 
	{
		if (full())
		{			
			throw new Exception("List is full");
		}else
			{
				size++;
				if (size==1)
				{
				current++;
				list[current]=e;
				}
				else
				{
				for(int i=size-1;i>current+1;i--)
					list[i]=list[i-1];
				current++;
				list[current] = e;
				}
				
			}
	}

	public Object retrieve() throws Exception 
	{
		if (empty())
	 	{
				throw new Exception("List is empty");
		}
		else
		{
			return list[current];
		}
	}

	public void delete() throws Exception 
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				if (size == 1)
					current = -1;
				else if (current==size-1)
					current = 0;
				else
					{
					for(int i=current;i<size-1;i++)
					list[i]=list[i+1];		
					current = 0;
					}
				size--;
			}
	}

	public boolean empty() 
	{
		if(size==0)
			return true;
		else
			return false;
	}

	public boolean full()
	{
		if (size == total)
			return true;
		else
			return false;
	}
	public void update(Object e) throws Exception
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				list[current] = e;
			}
	}

	public void findFirst() throws Exception
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				current=0;
			}
	}

	public void findNext() throws Exception
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				if (current != size-1)
					current = current+1;
			}
	}

	public boolean findkey(Object tKey)
	{
		printAll();
		//bubbleSort();
		//selectionSort();
		insertionSort();
		//quickSort(0,size-1);


		//return binSearch(tKey,0,size-1);
		return binSearch(tKey);

		//return SeqSearch(tKey);
		//return SeqSearchWithSentinel(tKey);

	
	}

	public boolean SeqSearch( Object key )
	{
		int i=0;
		boolean found = false;
		while(!found && i<size){
			if(list[i]==key){
				found = true;
				current = i;
			}else
				found = false;
			i++;
			}
		if(found){
			current = i-1;
			return true;
		}else
			return false;
		
	}

	public boolean SeqSearchWithSentinel( Object key )
	{
		int i=0;
		list[size] = key;
		while(list[i]!=key)
			i++;
		if(i<size){
			current = i;
			return true;
		}else
			return false;
	}
	
	public boolean binSearch( Object key) 
	{
		int low = 0;
        	int high = size - 1;
        	int mid=-1;
		current = -1;
		while (low <= high) 
		{
					mid = (low + high) / 2;
					if ((int)list[mid]<(int)key) 
						low=mid+1;
					else if ((int)list[mid]>(int)key)
						high = mid - 1;
					else{
						current = mid;
						break;
					}
			}if(current==-1)
				return false;
			else
				return true;
		
	}

	public boolean binSearch( Object key, int low, int high) 
	{
		int mid = (low + high)/2;
		if (low > high)
			return false;
		else if (list[mid].equals(key)) 
		{
			current = mid;
			return true;
		}
		else if ((int)list[mid]<(int)key)
			return binSearch(key, mid+1, high);
		else
			return binSearch(key, low, mid-1);

		
	}

	public void bubbleSort()
	{
		Object tmp;
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-1-i;j++)
				if((int)list[j]>(int)list[j+1])
				{
					tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
					
				}
				printAll();
			}

	}

	public void selectionSort()
	{
		int min_id;
		Object tmp,min;
		for(int i=0;i<size-1;i++)
		{
			min_id = i;
			min = list[i];
			for(int j=i+1;j<size;j++)
				if((int)list[j]<(int)min)
				{
					min_id = j;
					min = list[j];
				}
			tmp = list[i];
			list[i] = list[min_id];
			list[min_id] = tmp;
			printAll();
		}
		//insert codes here

	}

	public void insertionSort()
	{
		   Object tmp;
		   int i;
		   for (int j = 1; j < size; j++) 
		   {
			   tmp = list[j];
			   i = j - 1;
			   while (i >= 0 && (int)list[i] > (int)tmp) 
			   {
				   list[i + 1] = list[i];
				   i--;
			   }
			   list[i + 1] = tmp;
			   printAll();
		   }
		   //insert codes here
	
	}

	public void quickSort(int left,int right)
	{
		Object tmp,mid;
		int i,j;
		i = left;
		j = right;
		mid = list[(left+right)/2];
		do
		{
			while((int)list[i]<(int)mid)
				i++;
			while((int)list[j]>(int)mid)
				j--;
			if(i<=j)
			{
				tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
				i++;
				j--;
			}
		}while(i<=j);
		if(left<j)
			quickSort(left,j);
		if(i<right)
			quickSort(i,right);
		printAll();
		//insert codes here

	}

	public int getSize()
	{
		return size;
	}
	public void sort(int type){
		switch(type){
			case 1:
				bubbleSort();
				break;
			case 2:
				selectionSort();
				break;
			case 3:
				insertionSort();
				break;
			case 4:
				quickSort(0,size-1);
				break;
		}
	}
	public void clear(){
		size = 0;
	}
	public void printAll(){
		for (int i=0;i<size ;i++ )
		{
			System.out.print(list[i]+ " ");
		}
		System.out.println();
	}
}