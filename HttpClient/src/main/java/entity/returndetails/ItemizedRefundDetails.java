package entity.returndetails;

public class ItemizedRefundDetails {

    private String refundFeeType;
    private EstimatedAmount estimatedAmount;
    private boolean overwritableBySeller;
    private boolean amountEditable;
    public void setRefundFeeType(String refundFeeType) {
         this.refundFeeType = refundFeeType;
     }
     public String getRefundFeeType() {
         return refundFeeType;
     }

    public void setEstimatedAmount(EstimatedAmount estimatedAmount) {
         this.estimatedAmount = estimatedAmount;
     }
     public EstimatedAmount getEstimatedAmount() {
         return estimatedAmount;
     }

    public void setOverwritableBySeller(boolean overwritableBySeller) {
         this.overwritableBySeller = overwritableBySeller;
     }
     public boolean getOverwritableBySeller() {
         return overwritableBySeller;
     }

    public void setAmountEditable(boolean amountEditable) {
         this.amountEditable = amountEditable;
     }
     public boolean getAmountEditable() {
         return amountEditable;
     }

}
