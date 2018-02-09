
package entity.returndetails;

public class ItemizedReturnShippingCost {

    private String returnShippingCostType;
    private Amount amount;
    public void setReturnShippingCostType(String returnShippingCostType) {
         this.returnShippingCostType = returnShippingCostType;
     }
     public String getReturnShippingCostType() {
         return returnShippingCostType;
     }

    public void setAmount(Amount amount) {
         this.amount = amount;
     }
     public Amount getAmount() {
         return amount;
     }

}