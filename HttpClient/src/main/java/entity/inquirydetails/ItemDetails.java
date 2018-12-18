package entity.inquirydetails;

public class ItemDetails {

    private String itemPictureUrl;
    private ItemPrice itemPrice;
    private String itemTitle;
    private String viewPurchasedItemUrl;
    public void setItemPictureUrl(String itemPictureUrl) {
         this.itemPictureUrl = itemPictureUrl;
     }
     public String getItemPictureUrl() {
         return itemPictureUrl;
     }

    public void setItemPrice(ItemPrice itemPrice) {
         this.itemPrice = itemPrice;
     }
     public ItemPrice getItemPrice() {
         return itemPrice;
     }

    public void setItemTitle(String itemTitle) {
         this.itemTitle = itemTitle;
     }
     public String getItemTitle() {
         return itemTitle;
     }

    public void setViewPurchasedItemUrl(String viewPurchasedItemUrl) {
         this.viewPurchasedItemUrl = viewPurchasedItemUrl;
     }
     public String getViewPurchasedItemUrl() {
         return viewPurchasedItemUrl;
     }

}