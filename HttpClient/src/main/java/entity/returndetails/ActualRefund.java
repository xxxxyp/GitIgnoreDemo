package entity.returndetails;
import java.util.List;

public class ActualRefund {

    private TotalAmount totalAmount;
    private List<ItemizedRefundDetail> itemizedRefundDetail;
    public void setTotalAmount(TotalAmount totalAmount) {
         this.totalAmount = totalAmount;
     }
     public TotalAmount getTotalAmount() {
         return totalAmount;
     }

    public void setItemizedRefundDetail(List<ItemizedRefundDetail> itemizedRefundDetail) {
         this.itemizedRefundDetail = itemizedRefundDetail;
     }
     public List<ItemizedRefundDetail> getItemizedRefundDetail() {
         return itemizedRefundDetail;
     }

}
