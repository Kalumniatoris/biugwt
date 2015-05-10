package ka2.biu.shared;

import java.io.Serializable;
import java.util.Date;

public class Termin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3953857210058110882L;
	/**
	 * 
	 */
	private String name;
	private Date data;
	private String sword;
	public Termin(){
		
	}
	public Termin(String name, Date data, String sword){
		this.name=name;
		this.data=data;
		this.sword = sword;
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
	public String getSword() {
		return sword;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	
}
