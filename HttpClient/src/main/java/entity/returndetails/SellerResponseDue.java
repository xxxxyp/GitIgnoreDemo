package entity.returndetails;

public class SellerResponseDue {

    private String activityDue;
    private RespondByDate respondByDate;
    public void setActivityDue(String activityDue) {
         this.activityDue = activityDue;
     }
     public String getActivityDue() {
         return activityDue;
     }

    public void setRespondByDate(RespondByDate respondByDate) {
         this.respondByDate = respondByDate;
     }
     public RespondByDate getRespondByDate() {
         return respondByDate;
     }

}
