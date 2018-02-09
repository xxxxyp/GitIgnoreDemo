package TestEmail;

import java.util.List;

public class OpenReportBase {

	    private String status;
	    private int code;
	    private List<OpenReport> data;
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
		public List<OpenReport> getData() {
			return data;
		}
		public void setData(List<OpenReport> data) {
			this.data = data;
		}
	     
}
