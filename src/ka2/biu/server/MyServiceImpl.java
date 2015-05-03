package ka2.biu.server;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ka2.biu.client.MyService;
import ka2.biu.shared.Termin;

public class MyServiceImpl extends RemoteServiceServlet implements MyService {
	static List<Termin> terminy = new ArrayList<Termin>();
	
	public Termin NowyTermin(String name, Date data){
		terminy.add(new Termin(name, data));		
		//System.out.println(terminy.get(terminy.size()-1));
		//return data.compareTo(new Date());
		return terminy.get(terminy.size()-1);
		
	}
	
	public List<Termin> getAll(){
		
		return terminy;
	}


	
	
}
