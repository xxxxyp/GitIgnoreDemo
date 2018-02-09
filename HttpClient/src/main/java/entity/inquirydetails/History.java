package entity.inquirydetails;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class History {

    private String action;
    private String actor;
    @JsonProperty("date")
    private Dates dates;
    private String description;
    private MoneyMovement moneyMovement;
    public void setAction(String action) {
         this.action = action;
     }
     public String getAction() {
         return action;
     }

    public void setActor(String actor) {
         this.actor = actor;
     }
     public String getActor() {
         return actor;
     }

    public void setDates(Dates dates) {
         this.dates = dates;
     }
     public Dates getDates() {
         return dates;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setMoneyMovement(MoneyMovement moneyMovement) {
         this.moneyMovement = moneyMovement;
     }
     public MoneyMovement getMoneyMovement() {
         return moneyMovement;
     }

}