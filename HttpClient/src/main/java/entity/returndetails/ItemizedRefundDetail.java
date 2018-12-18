package entity.returndetails;

public class ItemizedRefundDetail {

    private String refundFeeType;
    private RefundAmount refundAmount;
    public void setRefundFeeType(String refundFeeType) {
         this.refundFeeType = refundFeeType;
     }
     public String getRefundFeeType() {
         return refundFeeType;
     }

    public void setRefundAmount(RefundAmount refundAmount) {
         this.refundAmount = refundAmount;
     }
     public RefundAmount getRefundAmount() {
         return refundAmount;
     }

}