package ka2.biu.client;

import java.util.List;

import ka2.biu.shared.Termin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Widget;

public class ListTerm extends Composite {
	@UiField (provided=true) FlexTable table;	
	
	
	private static ListTermUiBinder uiBinder = GWT
			.create(ListTermUiBinder.class);

	interface ListTermUiBinder extends UiBinder<Widget, ListTerm> {
	}

	public ListTerm() {
		initTable();
		
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	 private void initTable() {
		    table = new FlexTable();
		   
		    
		  }
	 
	 public void setData(List<Termin> term){
		 table.removeAllRows();
		    table.setText(0, 0, "Nazwa");
		    table.setText(0, 1, "Data");
		    table.setText(0, 2, "----");
		    
		    // Create a temp blank row:
		    table.insertRow(1);
		    
		 int n=1;
		 for (Termin termin : term) {			
			table.setText(n, 0, termin.getName());
			table.setText(n, 1,termin.getData().toString());
			n+=1;
		}
	 }
	 
}
