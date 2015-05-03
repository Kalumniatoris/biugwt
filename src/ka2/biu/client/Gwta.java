package ka2.biu.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import ka2.biu.shared.Termin;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwta implements EntryPoint {
	private MyServiceAsync myService = GWT.create(MyService.class);
	List<Termin> tmp = new ArrayList<Termin>();


	final Button confirmButton = new Button("Zatwierdz");

	final TextBox nameText = new TextBox();
	final DateBox dateData = new DateBox();
	final Label infoLabel = new Label();
	@Override
	public void onModuleLoad() {
		RootPanel formp = RootPanel.get("formdiv");
		final RootPanel infop = RootPanel.get("info");
		formp.add(nameText);
		formp.add(dateData);
		formp.add(confirmButton);
		infop.add(infoLabel);
		
		myService.getAll(new AsyncCallback<List<Termin>>() {
			
			@Override
			public void onSuccess(List<Termin> result) {
				tmp=result;
				Date now = new Date();
				for ( Termin t : tmp) {
					Long diff = t.getData().getTime()-now.getTime();
					//Long hours=TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
					infop.add(new Label(t.getName()+":"+t.getData().toString()+": "+new Date(diff).getHours()));
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				infoLabel.setText("Nie udało się pobrać listy dat");
				
			}
		});
		//infoLabel.setText();
		
		// TODO Auto-generated method stub
		confirmButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				myService.NowyTermin(nameText.getText(), dateData.getValue(), new AsyncCallback<Termin>() {
					
					@Override
					public void onSuccess(Termin result) {
						// TODO Auto-generated method stub
						System.out.println("SUCCESS:"+result.getName());
						Date now = new Date();
						Long diff = result.getData().getTime()-now.getTime();
						infop.add(new Label(result.getName()+":"+result.getData().toString()+": "+new Date(diff).getHours()));
					}
					
					@Override
					public void onFailure(Throwable caught) {
						System.out.println("FAILURE: "+caught.getMessage());
						
					}
				});
				
			}
		});
	}


}
