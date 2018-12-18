package entity.returndetails;

public class RequestedAmount {

    private int value;
    private String currency;
    public void setValue(int value) {
         this.value = value;
     }
     public int getValue() {
         return value;
     }

    public void setCurrency(String currency) {
         this.currency = currency;
     }
     public String getCurrency() {
         return currency;
     }

}