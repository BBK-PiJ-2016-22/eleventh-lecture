public class IntegerTreeNode{
	
	private int value; 
	private IntegerTreeNode left; 
	private IntegerTreeNode right;
	
	
	
	public IntegerTreeNode(int value){
		
		this.value = value;
	}
	
	public void add(int newNumber){
			
		if (newNumber > this.value) {
			
		if (right == null) {
				right = new IntegerTreeNode(newNumber);

		} else {
				right.add(newNumber);
		}
			
		} else {
				
			if (left == null) {
					left = new IntegerTreeNode(newNumber);
			} else {
					left.add(newNumber);
			}
		}
	}
	
	public boolean contains (int n){
		
		if (n == this.value) {
			
			return true;
		
		} else if (n > this.value) {
		
			if (right == null) {

				return false;
		
		} else {
		
			return right.contains(n);
		}
		
		} else {
		
			if (left == null) {
				return false;
			
			} else {
				
				return left.contains(n);
		}	}
	}
	
	
	
	public int getMax(){
		
		int returnValue  = 0;
		// check if the first node is the biggest
		
		if(right == null){
			
			returnValue = value;
		
		}
		
		if (){}
		
			getMax();
		
		}
		
		return returnValue;
	}
	
	public 
		
		System.out/println()
	}
		
	
}
