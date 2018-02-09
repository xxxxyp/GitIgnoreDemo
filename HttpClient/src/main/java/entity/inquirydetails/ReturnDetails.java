package entity.inquirydetails;

public class ReturnDetails {

    private Address address;
    private boolean editable;
    private String firstName;
    private String lastName;
    private String RMA;
    public void setAddress(Address address) {
         this.address = address;
     }
     public Address getAddress() {
         return address;
     }

    public void setEditable(boolean editable) {
         this.editable = editable;
     }
     public boolean getEditable() {
         return editable;
     }

    public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     public String getFirstName() {
         return firstName;
     }

    public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     public String getLastName() {
         return lastName;
     }

    public void setRMA(String RMA) {
         this.RMA = RMA;
     }
     public String getRMA() {
         return RMA;
     }

}