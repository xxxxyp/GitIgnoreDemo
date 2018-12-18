package entity.returndetails;

public class CloseInfo {

    private String returnCloseReason;
    private String buyerCloseReason;
    public void setReturnCloseReason(String returnCloseReason) {
         this.returnCloseReason = returnCloseReason;
     }
     public String getReturnCloseReason() {
         return returnCloseReason;
     }

    public void setBuyerCloseReason(String buyerCloseReason) {
         this.buyerCloseReason = buyerCloseReason;
     }
     public String getBuyerCloseReason() {
         return buyerCloseReason;
     }

}