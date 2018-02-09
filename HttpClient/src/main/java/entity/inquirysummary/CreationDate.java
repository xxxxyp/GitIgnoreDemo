
package entity.inquirysummary;
import java.util.Date;

public class CreationDate {

    private Date value;
    private Date formattedValue;
    public void setValue(Date value) {
         this.value = value;
     }
     public Date getValue() {
         return value;
     }

    public void setFormattedValue(Date formattedValue) {
         this.formattedValue = formattedValue;
     }
     public Date getFormattedValue() {
         return formattedValue;
     }

}