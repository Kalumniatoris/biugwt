package ka2.biu.shared;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Myser {
	static List<Termin> terminy = new ArrayList<Termin>();
	
	public static void NowyTermin(String name, Date data){
		terminy.add(new Termin(name, data));
		
	}
	
}
