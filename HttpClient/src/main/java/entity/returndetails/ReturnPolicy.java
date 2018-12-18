package entity.returndetails;

public class ReturnPolicy {

    private boolean multipleReturnAddresses;
    private boolean rmarequired;
    public void setMultipleReturnAddresses(boolean multipleReturnAddresses) {
         this.multipleReturnAddresses = multipleReturnAddresses;
     }
     public boolean getMultipleReturnAddresses() {
         return multipleReturnAddresses;
     }

    public void setRmarequired(boolean rmarequired) {
         this.rmarequired = rmarequired;
     }
     public boolean getRmarequired() {
         return rmarequired;
     }

}