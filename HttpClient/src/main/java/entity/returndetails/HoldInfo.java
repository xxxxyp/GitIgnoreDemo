package entity.returndetails;

public class HoldInfo {

    private HoldCreationDate holdCreationDate;
    private HoldReleaseDate holdReleaseDate;
    private String holdStatus;
    private String holdReferenceId;
    private String holdTransactionId;
    public void setHoldCreationDate(HoldCreationDate holdCreationDate) {
         this.holdCreationDate = holdCreationDate;
     }
     public HoldCreationDate getHoldCreationDate() {
         return holdCreationDate;
     }

    public void setHoldReleaseDate(HoldReleaseDate holdReleaseDate) {
         this.holdReleaseDate = holdReleaseDate;
     }
     public HoldReleaseDate getHoldReleaseDate() {
         return holdReleaseDate;
     }

    public void setHoldStatus(String holdStatus) {
         this.holdStatus = holdStatus;
     }
     public String getHoldStatus() {
         return holdStatus;
     }

    public void setHoldReferenceId(String holdReferenceId) {
         this.holdReferenceId = holdReferenceId;
     }
     public String getHoldReferenceId() {
         return holdReferenceId;
     }

    public void setHoldTransactionId(String holdTransactionId) {
         this.holdTransactionId = holdTransactionId;
     }
     public String getHoldTransactionId() {
         return holdTransactionId;
     }

}