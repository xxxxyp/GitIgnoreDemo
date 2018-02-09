package entity.returnsummary;

public class Item {

    private String itemId;
    private String transactionId;
    private int returnQuantity;
    private String itemTitle;
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

}