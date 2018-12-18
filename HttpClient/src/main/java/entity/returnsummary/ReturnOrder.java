package entity.returnsummary;
import java.util.List;

public class ReturnOrder {

    private List<Members> members;
    private int total;
    private PaginationOutput paginationOutput;
    private List<CountSummary> countSummary;
    public void setMembers(List<Members> members) {
         this.members = members;
     }
     public List<Members> getMembers() {
         return members;
     }

    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setPaginationOutput(PaginationOutput paginationOutput) {
         this.paginationOutput = paginationOutput;
     }
     public PaginationOutput getPaginationOutput() {
         return paginationOutput;
     }

    public void setCountSummary(List<CountSummary> countSummary) {
         this.countSummary = countSummary;
     }
     public List<CountSummary> getCountSummary() {
         return countSummary;
     }

}