package entity.returndetails;
import java.util.List;

public class EstimatedRefundDetail {

    private List<ItemizedRefundDetails> itemizedRefundDetails;
    private boolean isRtnShippingEditable;
    public void setItemizedRefundDetails(List<ItemizedRefundDetails> itemizedRefundDetails) {
         this.itemizedRefundDetails = itemizedRefundDetails;
     }
     public List<ItemizedRefundDetails> getItemizedRefundDetails() {
         return itemizedRefundDetails;
     }

    public void setIsRtnShippingEditable(boolean isRtnShippingEditable) {
         this.isRtnShippingEditable = isRtnShippingEditable;
     }
     public boolean getIsRtnShippingEditable() {
         return isRtnShippingEditable;
     }

}