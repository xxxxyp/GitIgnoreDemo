package entity.returndetails;

public class MoneyMovementInfo {

    private String moneyMovementType;
    private String status;
    private RequestedAmount requestedAmount;
    private ActualAmount actualAmount;
    private CreationDate creationDate;
    private String paymentProvider;
    public void setMoneyMovementType(String moneyMovementType) {
         this.moneyMovementType = moneyMovementType;
     }
     public String getMoneyMovementType() {
         return moneyMovementType;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setRequestedAmount(RequestedAmount requestedAmount) {
         this.requestedAmount = requestedAmount;
     }
     public RequestedAmount getRequestedAmount() {
         return requestedAmount;
     }

    public void setActualAmount(ActualAmount actualAmount) {
         this.actualAmount = actualAmount;
     }
     public ActualAmount getActualAmount() {
         return actualAmount;
     }

    public void setCreationDate(CreationDate creationDate) {
         this.creationDate = creationDate;
     }
     public CreationDate getCreationDate() {
         return creationDate;
     }

    public void setPaymentProvider(String paymentProvider) {
         this.paymentProvider = paymentProvider;
     }
     public String getPaymentProvider() {
         return paymentProvider;
     }

}