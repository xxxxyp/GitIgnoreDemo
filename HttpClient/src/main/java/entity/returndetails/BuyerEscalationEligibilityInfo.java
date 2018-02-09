package entity.returndetails;

public class BuyerEscalationEligibilityInfo {

    private String startTime;
    private String endTime;
    private boolean eligible;
    public void setStartTime(String startTime) {
         this.startTime = startTime;
     }
     public String getStartTime() {
         return startTime;
     }

    public void setEndTime(String endTime) {
         this.endTime = endTime;
     }
     public String getEndTime() {
         return endTime;
     }

    public void setEligible(boolean eligible) {
         this.eligible = eligible;
     }
     public boolean getEligible() {
         return eligible;
     }

}
