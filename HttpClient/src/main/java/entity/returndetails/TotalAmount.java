package entity.returndetails;

public class TotalAmount {

    private double value;
    private String currency;
    public void setValue(double value) {
         this.value = value;
     }
     public double getValue() {
         return value;
     }

    public void setCurrency(String currency) {
         this.currency = currency;
     }
     public String getCurrency() {
         return currency;
     }

}