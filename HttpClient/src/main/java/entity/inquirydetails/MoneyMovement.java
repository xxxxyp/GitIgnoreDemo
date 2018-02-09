package entity.inquirydetails;
import java.util.List;

public class MoneyMovement {

    private List<MoneyMovementEntryList> moneyMovementEntryList;
    public void setMoneyMovementEntryList(List<MoneyMovementEntryList> moneyMovementEntryList) {
         this.moneyMovementEntryList = moneyMovementEntryList;
     }
     public List<MoneyMovementEntryList> getMoneyMovementEntryList() {
         return moneyMovementEntryList;
     }

}