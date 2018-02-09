package entity.returndetails;

public class ShipmentTracking {

    private String shippingMethod;
    private String shippedBy;
    private int carrierId;
    private String carrierEnum;
    private String carrierName;
    private String carrierUsed;
    private String deliveryStatus;
    private DestinationAddress destinationAddress;
    private OriginAddress originAddress;
    private boolean markAsReceived;
    private boolean active;
    private boolean labelPrintExpired;
    private boolean labelVoidExpired;
    public void setShippingMethod(String shippingMethod) {
         this.shippingMethod = shippingMethod;
     }
     public String getShippingMethod() {
         return shippingMethod;
     }

    public void setShippedBy(String shippedBy) {
         this.shippedBy = shippedBy;
     }
     public String getShippedBy() {
         return shippedBy;
     }

    public void setCarrierId(int carrierId) {
         this.carrierId = carrierId;
     }
     public int getCarrierId() {
         return carrierId;
     }

    public void setCarrierEnum(String carrierEnum) {
         this.carrierEnum = carrierEnum;
     }
     public String getCarrierEnum() {
         return carrierEnum;
     }

    public void setCarrierName(String carrierName) {
         this.carrierName = carrierName;
     }
     public String getCarrierName() {
         return carrierName;
     }

    public void setCarrierUsed(String carrierUsed) {
         this.carrierUsed = carrierUsed;
     }
     public String getCarrierUsed() {
         return carrierUsed;
     }

    public void setDeliveryStatus(String deliveryStatus) {
         this.deliveryStatus = deliveryStatus;
     }
     public String getDeliveryStatus() {
         return deliveryStatus;
     }

    public void setDestinationAddress(DestinationAddress destinationAddress) {
         this.destinationAddress = destinationAddress;
     }
     public DestinationAddress getDestinationAddress() {
         return destinationAddress;
     }

    public void setOriginAddress(OriginAddress originAddress) {
         this.originAddress = originAddress;
     }
     public OriginAddress getOriginAddress() {
         return originAddress;
     }

    public void setMarkAsReceived(boolean markAsReceived) {
         this.markAsReceived = markAsReceived;
     }
     public boolean getMarkAsReceived() {
         return markAsReceived;
     }

    public void setActive(boolean active) {
         this.active = active;
     }
     public boolean getActive() {
         return active;
     }

    public void setLabelPrintExpired(boolean labelPrintExpired) {
         this.labelPrintExpired = labelPrintExpired;
     }
     public boolean getLabelPrintExpired() {
         return labelPrintExpired;
     }

    public void setLabelVoidExpired(boolean labelVoidExpired) {
         this.labelVoidExpired = labelVoidExpired;
     }
     public boolean getLabelVoidExpired() {
         return labelVoidExpired;
     }

}