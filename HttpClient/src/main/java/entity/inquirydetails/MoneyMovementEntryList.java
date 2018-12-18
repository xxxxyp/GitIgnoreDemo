package entity.inquirydetails;

import org.codehaus.jackson.annotate.JsonProperty;

public class MoneyMovementEntryList {

    private Amount amount;
    @JsonProperty("date")
    private MmelDate mmelDate;
    private String type;
    public void setAmount(Amount amount) {
         this.amount = amount;
     }
     public Amount getAmount() {
         return amount;
     }

    public void setDate(MmelDate mmelDate) {
         this.mmelDate = mmelDate;
     }
     public MmelDate getDate() {
         return mmelDate;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

}