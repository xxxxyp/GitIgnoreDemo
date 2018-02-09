package entity.inquirydetails;

import java.util.Date;

public class AppealDate {

    private String formattedValue;
    private Date value;
    
    public void setFormattedValue(String formattedValue) {
         this.formattedValue = formattedValue;
     }
     public String getFormattedValue() {
         return formattedValue;
     }

    public void setValue(Date value) {
         this.value = value;
     }
     public Date getValue() {
         return value;
     }

}