package controlstatement;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=98;
		if(s< 0 || s>90)
			System.out.println("invalid score");
		switch(s/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D");
		case 5:
			System.out.println("E");
			
			default:
				System.out.println("false");
		}
	
		
	}


	}


