import java.text.DecimalFormat;
import java.text.NumberFormat;

class  ArrayList implements ListADT
{
	private int total;
	private Object list[];
	int current,size ;

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

	public void sort(int type){
		switch(type){
			case 1:
				quickSort(0,size-1);
				break;
			case 2:
				heapSort();
				break;
		}

	}

	public boolean findkey(Object tKey)
	{
		return binSearch(tKey,0,size-1);
	}

	public boolean binSearch(Object tKey,int low,int high){
		int mid=(low+high)/2;
		if(low>high)
			return false;
		else if((int)list[mid]==(int)tKey){
			current=mid;
			return true;
		}
		else if((int)list[mid]<(int)tKey)
			return binSearch(tKey, mid+1, high);
		else return binSearch(tKey,low,mid-1);
	}

	public void swap(int i,int j){
		Object tmp=list[i];
		list[i]=list[j];
		list[j]=tmp;
	}

	public void quickSort(int left,int right){
		Object mid=list[(left+right)/2];
		int i=left,j=right;
		do{
			while((int)list[i]<(int)mid)
				i++;
			while((int)mid<(int)list[j])
				j--;
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
		}while(i<=j);
		printAll();
		if(i<right) quickSort(i, right);
		if(left<j) quickSort(left, j);
	}

	public void heapSort(){
		makeHeap();
		printAll();
		for(int nodeIndex=size;nodeIndex>0;nodeIndex--){
			swap(0,nodeIndex-1);
			reHeapDown(0,nodeIndex-2);
			printAll();
		}
	}
	public void makeHeap(){
		for(int i=size;i>=0;i--)
			reHeapDown(i,size);
	}
	public void reHeapDown(int root,int bottom){
		boolean heapOK=false;
		int maxChild,leftChild=2*root+1,rightChild=2*root+2;
		while(leftChild<=bottom && !heapOK){
			if(leftChild==bottom || list[rightChild]==null)
				maxChild=leftChild;
			else if((int)list[leftChild]<(int)list[rightChild])
				maxChild=rightChild;
			else maxChild=leftChild;

			if((int)list[root]<(int)list[maxChild]){
				swap(root,maxChild);
				root=maxChild;
				leftChild=2*root+1;
				rightChild=2*root+2;
			}else 
				heapOK=true;
		}
	}
	public int getSize()
	{
		return size;
	}

	public void printAll(){
		NumberFormat formatter = new DecimalFormat("#0.0");     
		for (int i=0;i<size ;i++ )
		{
			System.out.print(formatter.format(list[i])+ " ");
		}
		System.out.println();
	}
}