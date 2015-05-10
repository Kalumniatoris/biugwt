package ka2.biu.server;

import java.sql.Time;
import java.util.Collection;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ka2.biu.client.MyService;
import ka2.biu.shared.Termin;

public class MyServiceImpl extends RemoteServiceServlet implements MyService {
	static List<Termin> terminy = new ArrayList<Termin>();
	
	public Termin NowyTermin(String name, Date data, String sword){
		terminy.add(new Termin(name, data, sword));		
		
		System.out.println(terminy.get(terminy.size()-1));
		return terminy.get(terminy.size()-1);
		
	}
	
	public List<Termin> getAll(){
				return terminy;
	}

	@Override
	public int Remove(String p) {
	
		int k=0;
		List<Termin> tmpl = new ArrayList<Termin>();
		for (Termin t : terminy) {
			if(t.getSword().equals(p)){
				tmpl.add(t);
				k+=1;
			}
		}
		terminy.removeAll(tmpl);
		
		return k;
		
	}


	
	
}
