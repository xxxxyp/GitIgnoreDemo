package entity.inquirydetails;

public class RefundAmounts {

    private BuyerFinalAcceptRefundAmt buyerFinalAcceptRefundAmt;
    private BuyerInitExpectRefundAmt buyerInitExpectRefundAmt;
    private InternationalRefundAmount internationalRefundAmount;
    private RefundAmount refundAmount;
    public void setBuyerFinalAcceptRefundAmt(BuyerFinalAcceptRefundAmt buyerFinalAcceptRefundAmt) {
         this.buyerFinalAcceptRefundAmt = buyerFinalAcceptRefundAmt;
     }
     public BuyerFinalAcceptRefundAmt getBuyerFinalAcceptRefundAmt() {
         return buyerFinalAcceptRefundAmt;
     }

    public void setBuyerInitExpectRefundAmt(BuyerInitExpectRefundAmt buyerInitExpectRefundAmt) {
         this.buyerInitExpectRefundAmt = buyerInitExpectRefundAmt;
     }
     public BuyerInitExpectRefundAmt getBuyerInitExpectRefundAmt() {
         return buyerInitExpectRefundAmt;
     }

    public void setInternationalRefundAmount(InternationalRefundAmount internationalRefundAmount) {
         this.internationalRefundAmount = internationalRefundAmount;
     }
     public InternationalRefundAmount getInternationalRefundAmount() {
         return internationalRefundAmount;
     }

    public void setRefundAmount(RefundAmount refundAmount) {
         this.refundAmount = refundAmount;
     }
     public RefundAmount getRefundAmount() {
         return refundAmount;
     }

}