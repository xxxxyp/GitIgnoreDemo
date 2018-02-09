package entity.returndetails;
import java.util.List;

public class Detail {

    private String marketplaceId;
    private ItemDetail itemDetail;
    private String buyerLoginName;
    private String sellerLoginName;
    private String buyerEmailAddress;
    private String sellerEmailAddress;
    private String checkoutType;
    private List<ResponseHistory> responseHistory;
    private RefundInfo refundInfo;
    private HoldInfo holdInfo;
    private List<MoneyMovementInfo> moneyMovementInfo;
    private BuyerAddress buyerAddress;
    private SellerAddress sellerAddress;
    private ReturnShipmentInfo returnShipmentInfo;
    private CloseInfo closeInfo;
    public void setMarketplaceId(String marketplaceId) {
         this.marketplaceId = marketplaceId;
     }
     public String getMarketplaceId() {
         return marketplaceId;
     }

    public void setItemDetail(ItemDetail itemDetail) {
         this.itemDetail = itemDetail;
     }
     public ItemDetail getItemDetail() {
         return itemDetail;
     }

    public void setBuyerLoginName(String buyerLoginName) {
         this.buyerLoginName = buyerLoginName;
     }
     public String getBuyerLoginName() {
         return buyerLoginName;
     }

    public void setSellerLoginName(String sellerLoginName) {
         this.sellerLoginName = sellerLoginName;
     }
     public String getSellerLoginName() {
         return sellerLoginName;
     }

    public void setBuyerEmailAddress(String buyerEmailAddress) {
         this.buyerEmailAddress = buyerEmailAddress;
     }
     public String getBuyerEmailAddress() {
         return buyerEmailAddress;
     }

    public void setSellerEmailAddress(String sellerEmailAddress) {
         this.sellerEmailAddress = sellerEmailAddress;
     }
     public String getSellerEmailAddress() {
         return sellerEmailAddress;
     }

    public void setCheckoutType(String checkoutType) {
         this.checkoutType = checkoutType;
     }
     public String getCheckoutType() {
         return checkoutType;
     }

    public void setResponseHistory(List<ResponseHistory> responseHistory) {
         this.responseHistory = responseHistory;
     }
     public List<ResponseHistory> getResponseHistory() {
         return responseHistory;
     }

    public void setRefundInfo(RefundInfo refundInfo) {
         this.refundInfo = refundInfo;
     }
     public RefundInfo getRefundInfo() {
         return refundInfo;
     }

    public void setHoldInfo(HoldInfo holdInfo) {
         this.holdInfo = holdInfo;
     }
     public HoldInfo getHoldInfo() {
         return holdInfo;
     }

    public void setMoneyMovementInfo(List<MoneyMovementInfo> moneyMovementInfo) {
         this.moneyMovementInfo = moneyMovementInfo;
     }
     public List<MoneyMovementInfo> getMoneyMovementInfo() {
         return moneyMovementInfo;
     }

    public void setBuyerAddress(BuyerAddress buyerAddress) {
         this.buyerAddress = buyerAddress;
     }
     public BuyerAddress getBuyerAddress() {
         return buyerAddress;
     }

    public void setSellerAddress(SellerAddress sellerAddress) {
         this.sellerAddress = sellerAddress;
     }
     public SellerAddress getSellerAddress() {
         return sellerAddress;
     }

    public void setReturnShipmentInfo(ReturnShipmentInfo returnShipmentInfo) {
         this.returnShipmentInfo = returnShipmentInfo;
     }
     public ReturnShipmentInfo getReturnShipmentInfo() {
         return returnShipmentInfo;
     }

    public void setCloseInfo(CloseInfo closeInfo) {
         this.closeInfo = closeInfo;
     }
     public CloseInfo getCloseInfo() {
         return closeInfo;
     }

}