package entity.returndetails;
import java.util.List;

public class ReturnShipmentInfo {

    private ShipmentTracking shipmentTracking;
    private ShippingLabelCost shippingLabelCost;
    private String payee;
    private List<AllShipmentTrackings> allShipmentTrackings;
    public void setShipmentTracking(ShipmentTracking shipmentTracking) {
         this.shipmentTracking = shipmentTracking;
     }
     public ShipmentTracking getShipmentTracking() {
         return shipmentTracking;
     }

    public void setShippingLabelCost(ShippingLabelCost shippingLabelCost) {
         this.shippingLabelCost = shippingLabelCost;
     }
     public ShippingLabelCost getShippingLabelCost() {
         return shippingLabelCost;
     }

    public void setPayee(String payee) {
         this.payee = payee;
     }
     public String getPayee() {
         return payee;
     }

    public void setAllShipmentTrackings(List<AllShipmentTrackings> allShipmentTrackings) {
         this.allShipmentTrackings = allShipmentTrackings;
     }
     public List<AllShipmentTrackings> getAllShipmentTrackings() {
         return allShipmentTrackings;
     }

}