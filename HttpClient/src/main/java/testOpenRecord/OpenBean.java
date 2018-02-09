package testOpenRecord;

import java.text.SimpleDateFormat;
import java.util.Map;

public class OpenBean {
	
	private String status;
    private int code;
    private Map<String,Object> Data;
    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }
	public Map<String, Object> getData() {
		return Data;
	}
	public void setData(Map<String, Object> data) {
		Data = data;
	}
	

  
     
     
}
