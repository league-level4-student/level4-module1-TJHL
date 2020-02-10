
//1.  Create an integer variable and initialize it to a random number between 0-4.

//2.  Use a switch statement to print a different response based on the value of the integer created in step 1.

public class Checkpoint {
	public static void main(String[] args) {
		int random = (int)(Math.random()*5);
		
		switch(random) {
		
		case 1:
			System.out.println("No sweat");
			break;
		case 2:
			System.out.println("Nothin yet");
			break;
		case 3:
			System.out.println("Feeling good");
			break;
		case 4:
			System.out.println("feeling great");
			break;
		default:
			System.out.println(random);
			break;
		}
	}
}
