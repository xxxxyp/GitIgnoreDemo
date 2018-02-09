package entity.inquirysummary;
import java.util.List;


public class InquaryList {

    private List<Members> members;
    private int totalNumberOfInquiries;
    private PaginationOutput paginationOutput;
    
    
    public void setMembers(List<Members> members) {
         this.members = members;
     }
     public List<Members> getMembers() {
         return members;
     }

    public void setTotalNumberOfInquiries(int totalNumberOfInquiries) {
         this.totalNumberOfInquiries = totalNumberOfInquiries;
     }
     public int getTotalNumberOfInquiries() {
         return totalNumberOfInquiries;
     }

    public void setPaginationOutput(PaginationOutput paginationOutput) {
         this.paginationOutput = paginationOutput;
     }
     public PaginationOutput getPaginationOutput() {
         return paginationOutput;
     }

}