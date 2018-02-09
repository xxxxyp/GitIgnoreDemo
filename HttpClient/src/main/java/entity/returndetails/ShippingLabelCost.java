package entity.returndetails;
import java.util.List;

public class ShippingLabelCost {

    private TotalAmount totalAmount;
    private List<ItemizedReturnShippingCost> itemizedReturnShippingCost;
    public void setTotalAmount(TotalAmount totalAmount) {
         this.totalAmount = totalAmount;
     }
     public TotalAmount getTotalAmount() {
         return totalAmount;
     }

    public void setItemizedReturnShippingCost(List<ItemizedReturnShippingCost> itemizedReturnShippingCost) {
         this.itemizedReturnShippingCost = itemizedReturnShippingCost;
     }
     public List<ItemizedReturnShippingCost> getItemizedReturnShippingCost() {
         return itemizedReturnShippingCost;
     }

}