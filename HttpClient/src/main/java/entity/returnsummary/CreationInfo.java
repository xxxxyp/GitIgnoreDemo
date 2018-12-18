
package entity.returnsummary;

public class CreationInfo {

    private Item item;
    private String type;
    private String reason;
    private String reasonType;
    private Comments comments;
    private CreationDate creationDate;
    public void setItem(Item item) {
         this.item = item;
     }
     public Item getItem() {
         return item;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setReason(String reason) {
         this.reason = reason;
     }
     public String getReason() {
         return reason;
     }

    public void setReasonType(String reasonType) {
         this.reasonType = reasonType;
     }
     public String getReasonType() {
         return reasonType;
     }

    public void setComments(Comments comments) {
         this.comments = comments;
     }
     public Comments getComments() {
         return comments;
     }

    public void setCreationDate(CreationDate creationDate) {
         this.creationDate = creationDate;
     }
     public CreationDate getCreationDate() {
         return creationDate;
     }

}