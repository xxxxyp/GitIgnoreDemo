package entity.inquirydetails;

public class InquiryInfo {

    private ClaimAmount claimAmount;
    private String extTransactionId;
    private String initiator;
    private InquiryDetails inquiryDetails;
    private InquiryHistoryDetails inquiryHistoryDetails;
    private String inquiryId;
    private Integer inquiryQuantity;
    private ItemDetails itemDetails;
    private String itemId;
    private ReturnDetails returnDetails;
    private SellerMakeItRightByDate sellerMakeItRightByDate;
    private ShippingCost shippingCost;
    private String state;
    private String status;
    private String transactionId;
    private String viewPPTrasanctionUrl;
    public void setClaimAmount(ClaimAmount claimAmount) {
         this.claimAmount = claimAmount;
     }
     public ClaimAmount getClaimAmount() {
         return claimAmount;
     }

    public void setExtTransactionId(String extTransactionId) {
         this.extTransactionId = extTransactionId;
     }
     public String getExtTransactionId() {
         return extTransactionId;
     }

    public void setInitiator(String initiator) {
         this.initiator = initiator;
     }
     public String getInitiator() {
         return initiator;
     }

    public void setInquiryDetails(InquiryDetails inquiryDetails) {
    	this.inquiryDetails = inquiryDetails == null ? null : inquiryDetails;
     }
     public InquiryDetails getInquiryDetails() {
         return inquiryDetails;
     }

    public void setInquiryHistoryDetails(InquiryHistoryDetails inquiryHistoryDetails) {
         this.inquiryHistoryDetails = inquiryHistoryDetails;
     }
     public InquiryHistoryDetails getInquiryHistoryDetails() {
         return inquiryHistoryDetails;
     }

    public void setInquiryId(String inquiryId) {
         this.inquiryId = inquiryId;
     }
     public String getInquiryId() {
         return inquiryId;
     }

    public void setInquiryQuantity(Integer inquiryQuantity) {
         this.inquiryQuantity = inquiryQuantity;
     }
     public Integer getInquiryQuantity() {
         return inquiryQuantity;
     }

    public void setItemDetails(ItemDetails itemDetails) {
         this.itemDetails = itemDetails;
     }
     public ItemDetails getItemDetails() {
         return itemDetails;
     }

    public void setItemId(String itemId) {
         this.itemId = itemId;
     }
     public String getItemId() {
         return itemId;
     }

    public void setReturnDetails(ReturnDetails returnDetails) {
         this.returnDetails = returnDetails;
     }
     public ReturnDetails getReturnDetails() {
         return returnDetails;
     }

    public void setSellerMakeItRightByDate(SellerMakeItRightByDate sellerMakeItRightByDate) {
         this.sellerMakeItRightByDate = sellerMakeItRightByDate;
     }
     public SellerMakeItRightByDate getSellerMakeItRightByDate() {
         return sellerMakeItRightByDate;
     }

    public void setShippingCost(ShippingCost shippingCost) {
         this.shippingCost = shippingCost;
     }
     public ShippingCost getShippingCost() {
         return shippingCost;
     }

    public void setState(String state) {
         this.state = state;
     }
     public String getState() {
         return state;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setTransactionId(String transactionId) {
         this.transactionId = transactionId;
     }
     public String getTransactionId() {
         return transactionId;
     }

    public void setViewPPTrasanctionUrl(String viewPPTrasanctionUrl) {
         this.viewPPTrasanctionUrl = viewPPTrasanctionUrl;
     }
     public String getViewPPTrasanctionUrl() {
         return viewPPTrasanctionUrl;
     }

}
