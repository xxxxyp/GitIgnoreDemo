package entity.inquirydetails;

public class AppealDetails {

    private String appealCloseReasonEnum;
    private AppealDate appealDate;
    private String appealReasonCode;
    private String appealStatus;
    private String appealStatusEnum;
    private boolean eligibleForAppeal;
    public void setAppealCloseReasonEnum(String appealCloseReasonEnum) {
         this.appealCloseReasonEnum = appealCloseReasonEnum;
     }
     public String getAppealCloseReasonEnum() {
         return appealCloseReasonEnum;
     }

    public void setAppealDate(AppealDate appealDate) {
    	this.appealDate = appealDate == null ? null : appealDate; 
     }
     public AppealDate getAppealDate() {
         return appealDate;
     }

    public void setAppealReasonCode(String appealReasonCode) {
         this.appealReasonCode = appealReasonCode;
     }
     public String getAppealReasonCode() {
         return appealReasonCode;
     }

    public void setAppealStatus(String appealStatus) {
         this.appealStatus = appealStatus;
     }
     public String getAppealStatus() {
         return appealStatus;
     }

    public void setAppealStatusEnum(String appealStatusEnum) {
         this.appealStatusEnum = appealStatusEnum;
     }
     public String getAppealStatusEnum() {
         return appealStatusEnum;
     }

    public void setEligibleForAppeal(boolean eligibleForAppeal) {
         this.eligibleForAppeal = eligibleForAppeal;
     }
     public boolean getEligibleForAppeal() {
         return eligibleForAppeal;
     }

}