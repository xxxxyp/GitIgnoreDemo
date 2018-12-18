package entity.inquirydetails;

public class ShipmentTrackingDetails {

    private String carrier;
    private String currentStatus;
    private EstimateFromDate estimateFromDate;
    private EstimateToDate estimateToDate;
    private String trackingNumber;
    private String trackingURL;
    public void setCarrier(String carrier) {
         this.carrier = carrier;
     }
     public String getCarrier() {
         return carrier;
     }

    public void setCurrentStatus(String currentStatus) {
         this.currentStatus = currentStatus;
     }
     public String getCurrentStatus() {
         return currentStatus;
     }

    public void setEstimateFromDate(EstimateFromDate estimateFromDate) {
         this.estimateFromDate = estimateFromDate;
     }
     public EstimateFromDate getEstimateFromDate() {
         return estimateFromDate;
     }

    public void setEstimateToDate(EstimateToDate estimateToDate) {
         this.estimateToDate = estimateToDate;
     }
     public EstimateToDate getEstimateToDate() {
         return estimateToDate;
     }

    public void setTrackingNumber(String trackingNumber) {
         this.trackingNumber = trackingNumber;
     }
     public String getTrackingNumber() {
         return trackingNumber;
     }

    public void setTrackingURL(String trackingURL) {
         this.trackingURL = trackingURL;
     }
     public String getTrackingURL() {
         return trackingURL;
     }

}