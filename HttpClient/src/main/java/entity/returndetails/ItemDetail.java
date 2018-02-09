package entity.returndetails;

public class ItemDetail {

    private String itemId;
    private String transactionId;
    private int listingSiteId;
    private int returnQuantity;
    private String itemTitle;
    private String itemPicUrl;
    private TransactionDate transactionDate;
    private ItemPrice itemPrice;
    private boolean ebayPlusTxn;
    public void setItemId(String itemId) {
         this.itemId = itemId;
     }
     public String getItemId() {
         return itemId;
     }

    public void setTransactionId(String transactionId) {
         this.transactionId = transactionId;
     }
     public String getTransactionId() {
         return transactionId;
     }

    public void setListingSiteId(int listingSiteId) {
         this.listingSiteId = listingSiteId;
     }
     public int getListingSiteId() {
         return listingSiteId;
     }

    public void setReturnQuantity(int returnQuantity) {
         this.returnQuantity = returnQuantity;
     }
     public int getReturnQuantity() {
         return returnQuantity;
     }

    public void setItemTitle(String itemTitle) {
         this.itemTitle = itemTitle;
     }
     public String getItemTitle() {
         return itemTitle;
     }

    public void setItemPicUrl(String itemPicUrl) {
         this.itemPicUrl = itemPicUrl;
     }
     public String getItemPicUrl() {
         return itemPicUrl;
     }

    public void setTransactionDate(TransactionDate transactionDate) {
         this.transactionDate = transactionDate;
     }
     public TransactionDate getTransactionDate() {
         return transactionDate;
     }

    public void setItemPrice(ItemPrice itemPrice) {
         this.itemPrice = itemPrice;
     }
     public ItemPrice getItemPrice() {
         return itemPrice;
     }

    public void setEbayPlusTxn(boolean ebayPlusTxn) {
         this.ebayPlusTxn = ebayPlusTxn;
     }
     public boolean getEbayPlusTxn() {
         return ebayPlusTxn;
     }

}