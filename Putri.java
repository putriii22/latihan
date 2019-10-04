import java.util.ArrayList;

public class Putri {
	public static void main(String[] args) {
	ArrayList<String> putrek = new ArrayList<String>();
	putrek.add("Adi");
	putrek.add("Ahmad");
	putrek.add("Krisna");
	putrek.add("Wati");
	putrek.add("Bagus");
	putrek.add("Dafa");
	//System.out.print(putrek);
	// for (String nur: putrek) {
	// 	System.out.println(nur);

	// }
	putrek.clear();
	for (int i=0 ;i < putrek.size(); i++) {
			System.out.println(putrek.get(i));
	}
}
}