import java.util.Scanner;
public class asgnmt_7_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter the index of the character in your name which you want to print");
		int index = sc.nextInt();
		try
		{
		System.out.println(name.charAt(index));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e+" \nPlease enter a valid index lesser than "+name.length());
		}
	}
		

}
