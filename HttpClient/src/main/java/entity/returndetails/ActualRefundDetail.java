package entity.returndetails;

public class ActualRefundDetail {

    private ActualRefund actualRefund;
    private String refundStatus;
    private RefundIssuedDate refundIssuedDate;
    public void setActualRefund(ActualRefund actualRefund) {
         this.actualRefund = actualRefund;
     }
     public ActualRefund getActualRefund() {
         return actualRefund;
     }

    public void setRefundStatus(String refundStatus) {
         this.refundStatus = refundStatus;
     }
     public String getRefundStatus() {
         return refundStatus;
     }

    public void setRefundIssuedDate(RefundIssuedDate refundIssuedDate) {
         this.refundIssuedDate = refundIssuedDate;
     }
     public RefundIssuedDate getRefundIssuedDate() {
         return refundIssuedDate;
     }

}