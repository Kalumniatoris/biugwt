package ka2.biu.shared;

import java.io.Serializable;
import java.util.Date;

public class Termin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Date data;
	public Termin(){
		
	}
	public Termin(String name, Date data){
		this.name=name;
		this.data=data;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
