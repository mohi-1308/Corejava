package collectionex;
// only unique record shows
import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hash_table = new HashMap<>();
		hash_table.put("1", "Monday");
		hash_table.put("2", "Tuesday");
		hash_table.put("3", "Wednesday");
		hash_table.put("4", "Thursday");
		hash_table.put("5", "Friday");
		hash_table.put("6", "Saturday");
		hash_table.put("7", "Sunday");
		hash_table.put("8", "sunday");
		hash_table.put("9", "day");
		System.out.println(hash_table);
		Map<String, String> hclone=(Map<String, String>) ((HashMap<String, String>) hash_table).clone();
		System.out.println("***"+hclone);
		

	}

}//OUTPUT
//{1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday, 7=Sunday, 8=sunday, 9=day}
//***{1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday, 7=Sunday, 8=sunday, 9=day}
