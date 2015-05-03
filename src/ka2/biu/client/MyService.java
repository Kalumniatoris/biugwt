package ka2.biu.client;

import java.util.Date;
import java.util.List;

import ka2.biu.shared.Termin;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
@RemoteServiceRelativePath("termin")
public interface MyService extends RemoteService {
	Termin NowyTermin(String name, Date data);
	List<Termin> getAll();
}
