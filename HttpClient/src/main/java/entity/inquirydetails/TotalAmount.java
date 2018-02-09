package entity.inquirydetails;

public class TotalAmount {

    private String convertedFromCurrency;
    private Double convertedFromValue;
    private String currency;
    private Double value;
    public void setConvertedFromCurrency(String convertedFromCurrency) {
         this.convertedFromCurrency = convertedFromCurrency;
     }
     public String getConvertedFromCurrency() {
         return convertedFromCurrency;
     }

    public void setConvertedFromValue(Double convertedFromValue) {
         this.convertedFromValue = convertedFromValue;
     }
     public Double getConvertedFromValue() {
         return convertedFromValue;
     }

    public void setCurrency(String currency) {
         this.currency = currency;
     }
     public String getCurrency() {
         return currency;
     }

    public void setValue(Double value) {
         this.value = value;
     }
     public Double getValue() {
         return value;
     }

}