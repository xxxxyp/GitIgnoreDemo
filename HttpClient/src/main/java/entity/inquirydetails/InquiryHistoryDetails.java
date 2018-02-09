package entity.inquirydetails;
import java.util.List;

public class InquiryHistoryDetails {

    private List<History> history;
    private ShipmentTrackingDetails shipmentTrackingDetails;
    public void setHistory(List<History> history) {
         this.history = history;
     }
     public List<History> getHistory() {
         return history;
     }

    public void setShipmentTrackingDetails(ShipmentTrackingDetails shipmentTrackingDetails) {
         this.shipmentTrackingDetails = shipmentTrackingDetails;
     }
     public ShipmentTrackingDetails getShipmentTrackingDetails() {
         return shipmentTrackingDetails;
     }

}