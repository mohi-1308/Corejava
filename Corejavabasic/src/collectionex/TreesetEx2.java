package collectionex;
// 3 ways to print the code
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		TreeSet<String> hs=new TreeSet<>();
		hs.add("Rutika");
		hs.add("Pragati");
		hs.add("Lekha");
		hs.add("Zeba");
		hs.add("Pragati");
		hs.add("Lekha");
		hs.add("xy");
		System.out.println("Tree set:"+hs);
		System.out.println("*****Using Enhanced for loop");
		for (String i:hs) {
			System.out.println(i);
		}
		System.out.println("***Using Iterator***");
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		}
	}


