package entity.returndetails;

public class BuyerTotalRefund {

    private EstimatedRefundAmount estimatedRefundAmount;
    private ActualRefundAmount actualRefundAmount;
    public void setEstimatedRefundAmount(EstimatedRefundAmount estimatedRefundAmount) {
         this.estimatedRefundAmount = estimatedRefundAmount;
     }
     public EstimatedRefundAmount getEstimatedRefundAmount() {
         return estimatedRefundAmount;
     }

    public void setActualRefundAmount(ActualRefundAmount actualRefundAmount) {
         this.actualRefundAmount = actualRefundAmount;
     }
     public ActualRefundAmount getActualRefundAmount() {
         return actualRefundAmount;
     }

}