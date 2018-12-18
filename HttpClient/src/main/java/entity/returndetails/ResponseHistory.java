
package entity.returndetails;

public class ResponseHistory {

    private String author;
    private String activity;
    private String fromState;
    private String toState;
    private CreationDate creationDate;
    private String notes;
    private Attributes attributes;
    public void setAuthor(String author) {
         this.author = author;
     }
     public String getAuthor() {
         return author;
     }

    public void setActivity(String activity) {
         this.activity = activity;
     }
     public String getActivity() {
         return activity;
     }

    public void setFromState(String fromState) {
         this.fromState = fromState;
     }
     public String getFromState() {
         return fromState;
     }

    public void setToState(String toState) {
         this.toState = toState;
     }
     public String getToState() {
         return toState;
     }

    public void setCreationDate(CreationDate creationDate) {
         this.creationDate = creationDate;
     }
     public CreationDate getCreationDate() {
         return creationDate;
     }

    public void setNotes(String notes) {
         this.notes = notes;
     }
     public String getNotes() {
         return notes;
     }

    public void setAttributes(Attributes attributes) {
         this.attributes = attributes;
     }
     public Attributes getAttributes() {
         return attributes;
     }

}