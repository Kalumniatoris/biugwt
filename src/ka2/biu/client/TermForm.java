package ka2.biu.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

public class TermForm extends Composite {

	private static TermFormUiBinder uiBinder = GWT
			.create(TermFormUiBinder.class);
	
	interface TermFormUiBinder extends UiBinder<Widget, TermForm> {	}
	
	

	public TermForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField 
		TextBox nameBox;
	@UiField 
		PasswordTextBox passwordBox;
	@UiField 
		DateBox dateBox;
	@UiField 
		Button btnSubmit;
	@UiField
		Button btnDelete;
	
	
}
