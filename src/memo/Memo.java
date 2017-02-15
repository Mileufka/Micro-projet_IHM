package memo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Memo {
	//Attributs
	private String titre;
	private String desc;
	private String date;
	
	public Memo(String titre,String desc){
		this.titre=titre;
		this.desc=desc;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		date=sdf.format(new Date());
	}
	
	public String getTitre(){
		return titre;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public void setTitre(String titre){
		this.titre=titre;
	}
	
	public void setDesc(String desc){
		this.desc=desc;
	}
	
	public int dateToInt(){
		return Integer.parseInt(this.date);
	}
}
