 public class TreeLauncher{
	 

	public static void main (String[] args){
		
		TreeLauncher t  = new TreeLauncher();
		t.Launcher();
	 
	}
	
	public void Launcher(){
		
		IntegerTreeNode newTree = new IntegerTreeNode(5);
		newTree.add(4);
		newTree.add(0);
		System.out.println(newTree.contains(0));
		System.out.println(newTree.getMax());				
	}


}