package entity.inquirysummary;

public class PaginationOutput {

    private int offset;
    private int limit;
    private int totalPages;
    private int totalEntries;
    public void setOffset(int offset) {
         this.offset = offset;
     }
     public int getOffset() {
         return offset;
     }

    public void setLimit(int limit) {
         this.limit = limit;
     }
     public int getLimit() {
         return limit;
     }

    public void setTotalPages(int totalPages) {
         this.totalPages = totalPages;
     }
     public int getTotalPages() {
         return totalPages;
     }

    public void setTotalEntries(int totalEntries) {
         this.totalEntries = totalEntries;
     }
     public int getTotalEntries() {
         return totalEntries;
     }

}