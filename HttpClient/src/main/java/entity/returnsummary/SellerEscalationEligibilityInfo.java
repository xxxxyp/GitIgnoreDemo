package entity.returnsummary;

import java.util.Date;

public class SellerEscalationEligibilityInfo {

    private Date startTime;
    private Date endTime;
    private boolean eligible;
    public void setStartTime(Date startTime) {
         this.startTime = startTime;
     }
     public Date getStartTime() {
         return startTime;
     }

    public void setEndTime(Date endTime) {
         this.endTime = endTime;
     }
     public Date getEndTime() {
         return endTime;
     }

    public void setEligible(boolean eligible) {
         this.eligible = eligible;
     }
     public boolean getEligible() {
         return eligible;
     }

}