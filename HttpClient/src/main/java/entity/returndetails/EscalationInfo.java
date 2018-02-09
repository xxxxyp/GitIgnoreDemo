package entity.returndetails;

public class EscalationInfo {

    private BuyerEscalationEligibilityInfo buyerEscalationEligibilityInfo;
    private SellerEscalationEligibilityInfo sellerEscalationEligibilityInfo;
    public void setBuyerEscalationEligibilityInfo(BuyerEscalationEligibilityInfo buyerEscalationEligibilityInfo) {
         this.buyerEscalationEligibilityInfo = buyerEscalationEligibilityInfo;
     }
     public BuyerEscalationEligibilityInfo getBuyerEscalationEligibilityInfo() {
         return buyerEscalationEligibilityInfo;
     }

    public void setSellerEscalationEligibilityInfo(SellerEscalationEligibilityInfo sellerEscalationEligibilityInfo) {
         this.sellerEscalationEligibilityInfo = sellerEscalationEligibilityInfo;
     }
     public SellerEscalationEligibilityInfo getSellerEscalationEligibilityInfo() {
         return sellerEscalationEligibilityInfo;
     }

}