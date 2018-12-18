package testOpenRecord;

import java.util.Date;

public class OpenRecord {

	private String time;
	private String email;
	private Integer task_id;
	private String compid;
	
	
	
	public Integer getTask_id() {
		return task_id;
	}
	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setEmail(String email) {
	     this.email = email;
	 }
	 public String getEmail() {
	     return email;
	 }

}
