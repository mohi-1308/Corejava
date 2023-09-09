package collectionex;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, String> hash_table = new Hashtable<>();
		hash_table.put("1", "Monday");
		hash_table.put("2", "Tuesday");
		hash_table.put("3", "Wednesday");
		hash_table.put("4", "Thursday");
		hash_table.put("5", "Friday");
		hash_table.put("6", "Saturday");
		hash_table.put("7", "Sunday");
		hash_table.put("8", "Sunday");//{6=Saturday, 5=Friday, 4=Thursday, 3=Wednesday, 2=Tuesday, 1=Monday, 8=Sunday, 7=Sunday}

		hash_table.put(null, null);// null value and key cant provide in hashtable
		//hash_table.put("9", "day");//{9=day, 8=Sunday, 7=Sunday, 6=Saturday, 5=Friday, 4=Thursday, 3=Wednesday, 2=Tuesday, 1=Monday}

		System.out.println(hash_table);
	}

}
