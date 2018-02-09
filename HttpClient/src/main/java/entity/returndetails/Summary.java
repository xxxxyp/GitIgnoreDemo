
package entity.returndetails;
import java.util.List;

public class Summary {

    private String returnId;
    private String buyerLoginName;
    private String sellerLoginName;
    private String currentType;
    private String state;
    private String status;
    private CreationInfo creationInfo;
    private SellerTotalRefund sellerTotalRefund;
    private BuyerTotalRefund buyerTotalRefund;
    private SellerResponseDue sellerResponseDue;
    private BuyerResponseDue buyerResponseDue;
    private EscalationInfo escalationInfo;
    private List<SellerAvailableOptions> sellerAvailableOptions;
    private List<BuyerAvailableOptions> buyerAvailableOptions;
    private ReturnPolicy returnPolicy;
    private Flags flags;
    private TimeoutDate timeoutDate;
    public void setReturnId(String returnId) {
         this.returnId = returnId;
     }
     public String getReturnId() {
         return returnId;
     }

    public void setBuyerLoginName(String buyerLoginName) {
         this.buyerLoginName = buyerLoginName;
     }
     public String getBuyerLoginName() {
         return buyerLoginName;
     }

    public void setSellerLoginName(String sellerLoginName) {
         this.sellerLoginName = sellerLoginName;
     }
     public String getSellerLoginName() {
         return sellerLoginName;
     }

    public void setCurrentType(String currentType) {
         this.currentType = currentType;
     }
     public String getCurrentType() {
         return currentType;
     }

    public void setState(String state) {
         this.state = state;
     }
     public String getState() {
         return state;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setCreationInfo(CreationInfo creationInfo) {
         this.creationInfo = creationInfo;
     }
     public CreationInfo getCreationInfo() {
         return creationInfo;
     }

    public void setSellerTotalRefund(SellerTotalRefund sellerTotalRefund) {
         this.sellerTotalRefund = sellerTotalRefund;
     }
     public SellerTotalRefund getSellerTotalRefund() {
         return sellerTotalRefund;
     }

    public void setBuyerTotalRefund(BuyerTotalRefund buyerTotalRefund) {
         this.buyerTotalRefund = buyerTotalRefund;
     }
     public BuyerTotalRefund getBuyerTotalRefund() {
         return buyerTotalRefund;
     }

    public void setSellerResponseDue(SellerResponseDue sellerResponseDue) {
         this.sellerResponseDue = sellerResponseDue;
     }
     public SellerResponseDue getSellerResponseDue() {
         return sellerResponseDue;
     }

    public void setBuyerResponseDue(BuyerResponseDue buyerResponseDue) {
         this.buyerResponseDue = buyerResponseDue;
     }
     public BuyerResponseDue getBuyerResponseDue() {
         return buyerResponseDue;
     }

    public void setEscalationInfo(EscalationInfo escalationInfo) {
         this.escalationInfo = escalationInfo;
     }
     public EscalationInfo getEscalationInfo() {
         return escalationInfo;
     }

    public void setSellerAvailableOptions(List<SellerAvailableOptions> sellerAvailableOptions) {
         this.sellerAvailableOptions = sellerAvailableOptions;
     }
     public List<SellerAvailableOptions> getSellerAvailableOptions() {
         return sellerAvailableOptions;
     }

    public void setBuyerAvailableOptions(List<BuyerAvailableOptions> buyerAvailableOptions) {
         this.buyerAvailableOptions = buyerAvailableOptions;
     }
     public List<BuyerAvailableOptions> getBuyerAvailableOptions() {
         return buyerAvailableOptions;
     }

    public void setReturnPolicy(ReturnPolicy returnPolicy) {
         this.returnPolicy = returnPolicy;
     }
     public ReturnPolicy getReturnPolicy() {
         return returnPolicy;
     }

    public void setFlags(Flags flags) {
         this.flags = flags;
     }
     public Flags getFlags() {
         return flags;
     }

    public void setTimeoutDate(TimeoutDate timeoutDate) {
         this.timeoutDate = timeoutDate;
     }
     public TimeoutDate getTimeoutDate() {
         return timeoutDate;
     }

}