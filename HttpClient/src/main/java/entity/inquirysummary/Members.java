
package entity.inquirysummary;

public class Members {

    private int itemId;
    private int transactionId;
    private int inquiryId;
    private String buyer;
    private String seller;
    private String inquiryStatusEnum;
    private ClaimAmount claimAmount;
    private RespondByDate respondByDate;
    private CreationDate creationDate;
    private LastModifiedDate lastModifiedDate;
    public void setItemId(int itemId) {
         this.itemId = itemId;
     }
     public int getItemId() {
         return itemId;
     }

    public void setTransactionId(int transactionId) {
         this.transactionId = transactionId;
     }
     public int getTransactionId() {
         return transactionId;
     }

    public void setInquiryId(int inquiryId) {
         this.inquiryId = inquiryId;
     }
     public int getInquiryId() {
         return inquiryId;
     }

    public void setBuyer(String buyer) {
         this.buyer = buyer;
     }
     public String getBuyer() {
         return buyer;
     }

    public void setSeller(String seller) {
         this.seller = seller;
     }
     public String getSeller() {
         return seller;
     }

    public void setInquiryStatusEnum(String inquiryStatusEnum) {
         this.inquiryStatusEnum = inquiryStatusEnum;
     }
     public String getInquiryStatusEnum() {
         return inquiryStatusEnum;
     }

    public void setClaimAmount(ClaimAmount claimAmount) {
         this.claimAmount = claimAmount;
     }
     public ClaimAmount getClaimAmount() {
         return claimAmount;
     }

    public void setRespondByDate(RespondByDate respondByDate) {
         this.respondByDate = respondByDate;
     }
     public RespondByDate getRespondByDate() {
         return respondByDate;
     }

    public void setCreationDate(CreationDate creationDate) {
         this.creationDate = creationDate;
     }
     public CreationDate getCreationDate() {
         return creationDate;
     }

    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
         this.lastModifiedDate = lastModifiedDate;
     }
     public LastModifiedDate getLastModifiedDate() {
         return lastModifiedDate;
     }

}