package entity.returndetails;

public class ReturnDetails {

    private Summary summary;
    private Detail detail;
    public void setSummary(Summary summary) {
         this.summary = summary;
     }
     public Summary getSummary() {
         return summary;
     }

    public void setDetail(Detail detail) {
         this.detail = detail;
     }
     public Detail getDetail() {
         return detail;
     }

}