package learnjava;

public class AddOrEven {

	public static void main(String[] args) {
		AddOrEven ae = new AddOrEven();
		ae.addEven();
	}

	private void addEven() {
		
/*
 1.get no from from user
 2.if no divided 2 equal to to 0 is even
 3.otherwise add
 */
		
		
		int no = 8;
		if(no%2==0)
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("add");
		}
		
	}

}

/*

output:-

even


*/