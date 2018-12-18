package entity.returndetails;

public class RefundInfo {

    private EstimatedRefundDetail estimatedRefundDetail;
    private ActualRefundDetail actualRefundDetail;
    public void setEstimatedRefundDetail(EstimatedRefundDetail estimatedRefundDetail) {
         this.estimatedRefundDetail = estimatedRefundDetail;
     }
     public EstimatedRefundDetail getEstimatedRefundDetail() {
         return estimatedRefundDetail;
     }

    public void setActualRefundDetail(ActualRefundDetail actualRefundDetail) {
         this.actualRefundDetail = actualRefundDetail;
     }
     public ActualRefundDetail getActualRefundDetail() {
         return actualRefundDetail;
     }

}