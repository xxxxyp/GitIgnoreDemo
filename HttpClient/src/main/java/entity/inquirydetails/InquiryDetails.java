package entity.inquirydetails;

public class InquiryDetails {

    private AppealDetails appealDetails;
    private CreationDate creationDate;
    private EscalationDate escalationDate;
    private ExpirationDate expirationDate;
    private LastBuyerRespDate lastBuyerRespDate;
    private RefundAmounts refundAmounts;
    private RefundDeadlineDate refundDeadlineDate;
    private TotalAmount totalAmount;
    
    public void setAppealDetails(AppealDetails appealDetails) {
    	this.appealDetails = appealDetails == null ? null : appealDetails; 
     }
     public AppealDetails getAppealDetails() {
         return appealDetails;
     }

    public void setCreationDate(CreationDate creationDate) {
         this.creationDate = creationDate;
     }
     public CreationDate getCreationDate() {
         return creationDate;
     }

    public void setEscalationDate(EscalationDate escalationDate) {
         this.escalationDate = escalationDate;
     }
     public EscalationDate getEscalationDate() {
         return escalationDate;
     }

    public void setExpirationDate(ExpirationDate expirationDate) {
         this.expirationDate = expirationDate;
     }
     public ExpirationDate getExpirationDate() {
         return expirationDate;
     }

    public void setLastBuyerRespDate(LastBuyerRespDate lastBuyerRespDate) {
         this.lastBuyerRespDate = lastBuyerRespDate;
     }
     public LastBuyerRespDate getLastBuyerRespDate() {
         return lastBuyerRespDate;
     }

    public void setRefundAmounts(RefundAmounts refundAmounts) {
         this.refundAmounts = refundAmounts;
     }
     public RefundAmounts getRefundAmounts() {
         return refundAmounts;
     }

    public void setRefundDeadlineDate(RefundDeadlineDate refundDeadlineDate) {
         this.refundDeadlineDate = refundDeadlineDate;
     }
     public RefundDeadlineDate getRefundDeadlineDate() {
         return refundDeadlineDate;
     }

    public void setTotalAmount(TotalAmount totalAmount) {
         this.totalAmount = totalAmount;
     }
     public TotalAmount getTotalAmount() {
         return totalAmount;
     }

}