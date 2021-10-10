package learnjava;

public class VoteOrNotvote
{

	public static void main(String[] args) 
	{
		VoteOrNotvote vn = new VoteOrNotvote();
		vn.votenotvote();

	}

	private void votenotvote()
	{
/*
 1.get no from user
 2.if age greater than 18 you can vote
 3.otherwise you cannot vote
 */
		int age = 20;
		
		if (age>18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you  cannot vote ");
		}
		
	}

}


/*

output:-

you can vote

*/