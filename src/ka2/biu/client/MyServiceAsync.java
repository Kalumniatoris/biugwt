package ka2.biu.client;

import java.util.Date;
import java.util.List;

import ka2.biu.shared.Termin;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MyServiceAsync {

	void NowyTermin(String name, Date data, AsyncCallback<Termin> callback);

	void getAll(AsyncCallback<List<Termin>> callback);

}
