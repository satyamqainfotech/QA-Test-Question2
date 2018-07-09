package question1;

/**
 * Please implement Dynamic Array Interface 
 * @author 
 *
 */
public class MyCollection implements DynamicArray{
// Uncomment commented section
	
	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private int[] numArray;
	/**
	 * It constructs an empty Collection object with an array capacity specified by the integer
		parameter "arraySize".
	 */
	public MyCollection(int arraySize){
		numArray = new int[arraySize];
	}

	public int search(int searchingNum) {
		
		int i = 0;
		int index = 0;
		boolean validSearch = false;
		for (; i < numArray.length; i++) {
		    if (searchingNum == numArray[i]) {              
		        index = i;
		        validSearch = true;
		        break;
		    }
		}
		if (validSearch) {
		    return index;
		} else {
		    return -1;
		}
	}
	public boolean isArrayFull () {
		boolean arrayIsFull = false;
		for (int x=0; x < numArray.length; x++)
	       if (x == numArray.length-1)
	    	   arrayIsFull = true;
		return arrayIsFull;
	}
	public boolean add(int numberToAdd) {
		// TODO Auto-generated method stub
		int searchForNumber = this.search(numberToAdd);
		boolean arrayIsFull = isArrayFull();
		for (int x=0; x < numArray.length; x++)
	       if (x == numArray.length-1)
	    	   arrayIsFull = true;
		
		System.out.println(numArray.length);
		if(searchForNumber == -1 && arrayIsFull == true ) {
			for(int i=0; i < numArray.length; i++)
			    if(numArray[i] == 0) {
			    	numArray[i] = numberToAdd;
//			    	System.out.println(numArray[i]);
			    	return true;
			    }
		}
		return false;
	}

	public void doubleCapacity() {
		// TODO Auto-generated method stub
		int lengthOfTheArray = numArray.length;
		numArray = new int[lengthOfTheArray * 2];
		
	}

	public boolean remove(int numberToRemove) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int[] rotate(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
