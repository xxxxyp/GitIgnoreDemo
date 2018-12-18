package entity.inquirydetails;

import java.io.Serializable;
import java.util.Date;

public class InquiryOrderDetails implements Serializable {
    
    private String inquiry_id;

    private String transaction_id;

    private String item_id;

    private Integer user_id;

    private Integer shop_id;

    private String claim_amount_converted_from_currency;

    private Double claim_amount_converted_from_value;

    private String claim_amount_currency;

    private Double claim_amount_value;

    private String ext_transaction_id;

    private String initiator;

    private String inq__appeal_details_appeal_close_reason_enum;

    private String inq__appeal_details_appeal_date_formatted_value;

    private Date inq__appeal_details_appeal_date_value;

    private String inq__appeal_details_appeal_reason_code;

    private String inq__appeal_details_appeal_appeal_sataus;

    private String inq__appeal_details_appeal_status_enum;

    private Boolean inq__appeal_details_eligible_for_appeal;

    private String inq_creation_date_formatted_value;

    private Date inq_creation_date_value;

    private String inq_escalation_date_formatted_value;

    private Date inq_escalation_date_value;

    private String inq_expiration_date_formatted_value;

    private Date inq_expiration_date_value;

    private String inq_last_buyer_resp_date_formatted_value;

    private Date inq_last_buyer_resp_date_value;

    private String inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency;

    private Double inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value;

    private String inq_rf_amt_buyer_final_accept_refund_amt_currency;

    private Double inq_rf_amt_buyer_final_accept_refund_amt_value;

    private String inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency;

    private Double inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value;

    private String inq_rf_amt_buyer_init_expect_refund_amt_currency;

    private Double inq_rf_amt_buyer_init_expect_refund_amt_value;

    private String inq_rf_amt_international_refund_amount_converted_form_currecy;

    private Double inq_rf_amt_international_refund_amount_converted_form_value;

    private String inq_rf_amt_international_refund_amount_currency;

    private Double inq_rf_amt_international_refund_amount_value;

    private String inq_rf_amt_refund_amount_converted_from_currency;

    private Double inq_rf_amt_refund_amount_converted_from_value;

    private String inq_rf_amt_refund_amount_currency;

    private Double inq_rf_amt_refund_amount_value;

    private String inq_refund_dead_line_date_formatted_value;

    private Date inq_refund_dead_line_date_value;

    private String inq_total_amount_converted_from_currency;

    private Double inq_total_amount_converted_from_value;

    private String inq_total_amount_currency;

    private Double inq_total_amount_value;

    private Integer inquiry_quantity;

    private String item_details_item_picture_url;

    private String item_details_item_price_converted_from_currency;

    private Double item_details_item_price_converted_from_value;

    private String item_details_item_price_currency;

    private Double item_details_item_price_value;

    private String item_details_item_title;

    private String item_details_view_purchased_item_url;

    private String inq_his_history;

    private String inq_his_additional_info;

    private String inq_his_buyer_requested;

    private String inq_his_shipment_tracking_carrier;

    private String inq_his_shipment_tracking_current_status;

    private String inq_his_shipment_tracking_estimate_form_date_formatted_value;

    private Date inq_his_shipment_tracking_estimate_form_date_value;

    private String inq_his_shipment_tracking_estimate_to_date_formatted_value;

    private Date inq_his_shipment_tracking_estimate_to_date_value;

    private String inq_his_shipment_tracking_number;

    private String inq_his_shipment_tracking_URL;

    private String return_details_address_address_line1;

    private String return_details_address_address_line2;

    private String return_details_address_address_type;

    private String return_details_address_city;

    private String return_details_address_country;

    private String return_details_address_county;

    private Boolean return_details_address_is_transliterated;

    private String return_details_address_national_region;

    private String return_details_address_postal_code;

    private String return_details_address_script;

    private String return_details_address_state_or_province;

    private String return_details_address_transliterated_from_script;

    private String return_details_address_world_region;

    private Boolean return_details_editable;

    private String return_details_first_name;

    private String return_details_last_name;

    private String return_details_RMA;

    private String seller_makeIt_right_by_date_formatted_value;

    private Date seller_makeIt_right_by_date_value;

    private String shipping_cost_converted_from_currency;

    private Double shipping_cost_converted_from_value;

    private String shipping_cost_currency;

    private Double shipping_cost_value;

    private String state;

    private String status;

    private String view_PPTrasanction_url;

    private static final long serialVersionUID = 1L;

    public String getInquiry_id() {
        return inquiry_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inquiry_id
     *
     * @param inquiry_id the value for inquiry_order_details.inquiry_id
     *
     * @mbggenerated
     */
    public void setInquiry_id(String inquiry_id) {
        this.inquiry_id = inquiry_id == null ? null : inquiry_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.transaction_id
     *
     * @return the value of inquiry_order_details.transaction_id
     *
     * @mbggenerated
     */
    public String getTransaction_id() {
        return transaction_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.transaction_id
     *
     * @param transaction_id the value for inquiry_order_details.transaction_id
     *
     * @mbggenerated
     */
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id == null ? null : transaction_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_id
     *
     * @return the value of inquiry_order_details.item_id
     *
     * @mbggenerated
     */
    public String getItem_id() {
        return item_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_id
     *
     * @param item_id the value for inquiry_order_details.item_id
     *
     * @mbggenerated
     */
    public void setItem_id(String item_id) {
        this.item_id = item_id == null ? null : item_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.user_id
     *
     * @return the value of inquiry_order_details.user_id
     *
     * @mbggenerated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.user_id
     *
     * @param user_id the value for inquiry_order_details.user_id
     *
     * @mbggenerated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.shop_id
     *
     * @return the value of inquiry_order_details.shop_id
     *
     * @mbggenerated
     */
    public Integer getShop_id() {
        return shop_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.shop_id
     *
     * @param shop_id the value for inquiry_order_details.shop_id
     *
     * @mbggenerated
     */
    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.claim_amount_converted_from_currency
     *
     * @return the value of inquiry_order_details.claim_amount_converted_from_currency
     *
     * @mbggenerated
     */
    public String getClaim_amount_converted_from_currency() {
        return claim_amount_converted_from_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.claim_amount_converted_from_currency
     *
     * @param claim_amount_converted_from_currency the value for inquiry_order_details.claim_amount_converted_from_currency
     *
     * @mbggenerated
     */
    public void setClaim_amount_converted_from_currency(String claim_amount_converted_from_currency) {
        this.claim_amount_converted_from_currency = claim_amount_converted_from_currency == null ? null : claim_amount_converted_from_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.claim_amount_converted_from_value
     *
     * @return the value of inquiry_order_details.claim_amount_converted_from_value
     *
     * @mbggenerated
     */
    public Double getClaim_amount_converted_from_value() {
        return claim_amount_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.claim_amount_converted_from_value
     *
     * @param claim_amount_converted_from_value the value for inquiry_order_details.claim_amount_converted_from_value
     *
     * @mbggenerated
     */
    public void setClaim_amount_converted_from_value(Double claim_amount_converted_from_value) {
        this.claim_amount_converted_from_value = claim_amount_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.claim_amount_currency
     *
     * @return the value of inquiry_order_details.claim_amount_currency
     *
     * @mbggenerated
     */
    public String getClaim_amount_currency() {
        return claim_amount_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.claim_amount_currency
     *
     * @param claim_amount_currency the value for inquiry_order_details.claim_amount_currency
     *
     * @mbggenerated
     */
    public void setClaim_amount_currency(String claim_amount_currency) {
        this.claim_amount_currency = claim_amount_currency == null ? null : claim_amount_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.claim_amount_value
     *
     * @return the value of inquiry_order_details.claim_amount_value
     *
     * @mbggenerated
     */
    public Double getClaim_amount_value() {
        return claim_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.claim_amount_value
     *
     * @param claim_amount_value the value for inquiry_order_details.claim_amount_value
     *
     * @mbggenerated
     */
    public void setClaim_amount_value(Double claim_amount_value) {
        this.claim_amount_value = claim_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.ext_transaction_id
     *
     * @return the value of inquiry_order_details.ext_transaction_id
     *
     * @mbggenerated
     */
    public String getExt_transaction_id() {
        return ext_transaction_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.ext_transaction_id
     *
     * @param ext_transaction_id the value for inquiry_order_details.ext_transaction_id
     *
     * @mbggenerated
     */
    public void setExt_transaction_id(String ext_transaction_id) {
        this.ext_transaction_id = ext_transaction_id == null ? null : ext_transaction_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.initiator
     *
     * @return the value of inquiry_order_details.initiator
     *
     * @mbggenerated
     */
    public String getInitiator() {
        return initiator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.initiator
     *
     * @param initiator the value for inquiry_order_details.initiator
     *
     * @mbggenerated
     */
    public void setInitiator(String initiator) {
        this.initiator = initiator == null ? null : initiator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq__appeal_details_appeal_close_reason_enum
     *
     * @return the value of inquiry_order_details.inq__appeal_details_appeal_close_reason_enum
     *
     * @mbggenerated
     */
    public String getInq__appeal_details_appeal_close_reason_enum() {
        return inq__appeal_details_appeal_close_reason_enum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq__appeal_details_appeal_close_reason_enum
     *
     * @param inq__appeal_details_appeal_close_reason_enum the value for inquiry_order_details.inq__appeal_details_appeal_close_reason_enum
     *
     * @mbggenerated
     */
    public void setInq__appeal_details_appeal_close_reason_enum(String inq__appeal_details_appeal_close_reason_enum) {
        this.inq__appeal_details_appeal_close_reason_enum = inq__appeal_details_appeal_close_reason_enum == null ? null : inq__appeal_details_appeal_close_reason_enum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq__appeal_details_appeal_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq__appeal_details_appeal_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq__appeal_details_appeal_date_formatted_value() {
        return inq__appeal_details_appeal_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq__appeal_details_appeal_date_formatted_value
     *
     * @param inq__appeal_details_appeal_date_formatted_value the value for inquiry_order_details.inq__appeal_details_appeal_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq__appeal_details_appeal_date_formatted_value(String inq__appeal_details_appeal_date_formatted_value) {
        this.inq__appeal_details_appeal_date_formatted_value = inq__appeal_details_appeal_date_formatted_value == null ? null : inq__appeal_details_appeal_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq__appeal_details_appeal_date_value
     *
     * @return the value of inquiry_order_details.inq__appeal_details_appeal_date_value
     *
     * @mbggenerated
     */
    public Date getInq__appeal_details_appeal_date_value() {
        return inq__appeal_details_appeal_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq__appeal_details_appeal_date_value
     *
     * @param inq__appeal_details_appeal_date_value the value for inquiry_order_details.inq__appeal_details_appeal_date_value
     *
     * @mbggenerated
     */
    public void setInq__appeal_details_appeal_date_value(Date inq__appeal_details_appeal_date_value) {
    	this.inq__appeal_details_appeal_date_value = inq__appeal_details_appeal_date_value;
    }
    

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq__appeal_details_appeal_reason_code
     *
     * @return the value of inquiry_order_details.inq__appeal_details_appeal_reason_code
     *
     * @mbggenerated
     */
    public String getInq__appeal_details_appeal_reason_code() {
        return inq__appeal_details_appeal_reason_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq__appeal_details_appeal_reason_code
     *
     * @param inq__appeal_details_appeal_reason_code the value for inquiry_order_details.inq__appeal_details_appeal_reason_code
     *
     * @mbggenerated
     */
    public void setInq__appeal_details_appeal_reason_code(String inq__appeal_details_appeal_reason_code) {
        this.inq__appeal_details_appeal_reason_code = inq__appeal_details_appeal_reason_code == null ? null : inq__appeal_details_appeal_reason_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq__appeal_details_appeal_appeal_sataus
     *
     * @return the value of inquiry_order_details.inq__appeal_details_appeal_appeal_sataus
     *
     * @mbggenerated
     */
    public String getInq__appeal_details_appeal_appeal_sataus() {
        return inq__appeal_details_appeal_appeal_sataus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq__appeal_details_appeal_appeal_sataus
     *
     * @param inq__appeal_details_appeal_appeal_sataus the value for inquiry_order_details.inq__appeal_details_appeal_appeal_sataus
     *
     * @mbggenerated
     */
    public void setInq__appeal_details_appeal_appeal_sataus(String inq__appeal_details_appeal_appeal_sataus) {
        this.inq__appeal_details_appeal_appeal_sataus = inq__appeal_details_appeal_appeal_sataus == null ? null : inq__appeal_details_appeal_appeal_sataus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq__appeal_details_appeal_status_enum
     *
     * @return the value of inquiry_order_details.inq__appeal_details_appeal_status_enum
     *
     * @mbggenerated
     */
    public String getInq__appeal_details_appeal_status_enum() {
        return inq__appeal_details_appeal_status_enum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq__appeal_details_appeal_status_enum
     *
     * @param inq__appeal_details_appeal_status_enum the value for inquiry_order_details.inq__appeal_details_appeal_status_enum
     *
     * @mbggenerated
     */
    public void setInq__appeal_details_appeal_status_enum(String inq__appeal_details_appeal_status_enum) {
        this.inq__appeal_details_appeal_status_enum = inq__appeal_details_appeal_status_enum == null ? null : inq__appeal_details_appeal_status_enum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq__appeal_details_eligible_for_appeal
     *
     * @return the value of inquiry_order_details.inq__appeal_details_eligible_for_appeal
     *
     * @mbggenerated
     */
    public Boolean getInq__appeal_details_eligible_for_appeal() {
        return inq__appeal_details_eligible_for_appeal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq__appeal_details_eligible_for_appeal
     *
     * @param inq__appeal_details_eligible_for_appeal the value for inquiry_order_details.inq__appeal_details_eligible_for_appeal
     *
     * @mbggenerated
     */
    public void setInq__appeal_details_eligible_for_appeal(Boolean inq__appeal_details_eligible_for_appeal) {
        this.inq__appeal_details_eligible_for_appeal = inq__appeal_details_eligible_for_appeal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_creation_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq_creation_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq_creation_date_formatted_value() {
        return inq_creation_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_creation_date_formatted_value
     *
     * @param inq_creation_date_formatted_value the value for inquiry_order_details.inq_creation_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq_creation_date_formatted_value(String inq_creation_date_formatted_value) {
        this.inq_creation_date_formatted_value = inq_creation_date_formatted_value == null ? null : inq_creation_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_creation_date_value
     *
     * @return the value of inquiry_order_details.inq_creation_date_value
     *
     * @mbggenerated
     */
    public Date getInq_creation_date_value() {
        return inq_creation_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_creation_date_value
     *
     * @param inq_creation_date_value the value for inquiry_order_details.inq_creation_date_value
     *
     * @mbggenerated
     */
    public void setInq_creation_date_value(Date inq_creation_date_value) {
        this.inq_creation_date_value = inq_creation_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_escalation_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq_escalation_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq_escalation_date_formatted_value() {
        return inq_escalation_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_escalation_date_formatted_value
     *
     * @param inq_escalation_date_formatted_value the value for inquiry_order_details.inq_escalation_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq_escalation_date_formatted_value(String inq_escalation_date_formatted_value) {
        this.inq_escalation_date_formatted_value = inq_escalation_date_formatted_value == null ? null : inq_escalation_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_escalation_date_value
     *
     * @return the value of inquiry_order_details.inq_escalation_date_value
     *
     * @mbggenerated
     */
    public Date getInq_escalation_date_value() {
        return inq_escalation_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_escalation_date_value
     *
     * @param inq_escalation_date_value the value for inquiry_order_details.inq_escalation_date_value
     *
     * @mbggenerated
     */
    public void setInq_escalation_date_value(Date inq_escalation_date_value) {
        this.inq_escalation_date_value = inq_escalation_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_expiration_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq_expiration_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq_expiration_date_formatted_value() {
        return inq_expiration_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_expiration_date_formatted_value
     *
     * @param inq_expiration_date_formatted_value the value for inquiry_order_details.inq_expiration_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq_expiration_date_formatted_value(String inq_expiration_date_formatted_value) {
        this.inq_expiration_date_formatted_value = inq_expiration_date_formatted_value == null ? null : inq_expiration_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_expiration_date_value
     *
     * @return the value of inquiry_order_details.inq_expiration_date_value
     *
     * @mbggenerated
     */
    public Date getInq_expiration_date_value() {
        return inq_expiration_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_expiration_date_value
     *
     * @param inq_expiration_date_value the value for inquiry_order_details.inq_expiration_date_value
     *
     * @mbggenerated
     */
    public void setInq_expiration_date_value(Date inq_expiration_date_value) {
        this.inq_expiration_date_value = inq_expiration_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_last_buyer_resp_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq_last_buyer_resp_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq_last_buyer_resp_date_formatted_value() {
        return inq_last_buyer_resp_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_last_buyer_resp_date_formatted_value
     *
     * @param inq_last_buyer_resp_date_formatted_value the value for inquiry_order_details.inq_last_buyer_resp_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq_last_buyer_resp_date_formatted_value(String inq_last_buyer_resp_date_formatted_value) {
        this.inq_last_buyer_resp_date_formatted_value = inq_last_buyer_resp_date_formatted_value == null ? null : inq_last_buyer_resp_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_last_buyer_resp_date_value
     *
     * @return the value of inquiry_order_details.inq_last_buyer_resp_date_value
     *
     * @mbggenerated
     */
    public Date getInq_last_buyer_resp_date_value() {
        return inq_last_buyer_resp_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_last_buyer_resp_date_value
     *
     * @param inq_last_buyer_resp_date_value the value for inquiry_order_details.inq_last_buyer_resp_date_value
     *
     * @mbggenerated
     */
    public void setInq_last_buyer_resp_date_value(Date inq_last_buyer_resp_date_value) {
        this.inq_last_buyer_resp_date_value = inq_last_buyer_resp_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency() {
        return inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency
     *
     * @param inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency the value for inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency(String inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency) {
        this.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency = inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency == null ? null : inq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_buyer_final_accept_refund_amt_converted_from_value() {
        return inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value
     *
     * @param inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value the value for inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_final_accept_refund_amt_converted_from_value(Double inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value) {
        this.inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value = inq_rf_amt_buyer_final_accept_refund_amt_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_currency
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_currency
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_buyer_final_accept_refund_amt_currency() {
        return inq_rf_amt_buyer_final_accept_refund_amt_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_currency
     *
     * @param inq_rf_amt_buyer_final_accept_refund_amt_currency the value for inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_currency
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_final_accept_refund_amt_currency(String inq_rf_amt_buyer_final_accept_refund_amt_currency) {
        this.inq_rf_amt_buyer_final_accept_refund_amt_currency = inq_rf_amt_buyer_final_accept_refund_amt_currency == null ? null : inq_rf_amt_buyer_final_accept_refund_amt_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_buyer_final_accept_refund_amt_value() {
        return inq_rf_amt_buyer_final_accept_refund_amt_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_value
     *
     * @param inq_rf_amt_buyer_final_accept_refund_amt_value the value for inquiry_order_details.inq_rf_amt_buyer_final_accept_refund_amt_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_final_accept_refund_amt_value(Double inq_rf_amt_buyer_final_accept_refund_amt_value) {
        this.inq_rf_amt_buyer_final_accept_refund_amt_value = inq_rf_amt_buyer_final_accept_refund_amt_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency() {
        return inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency
     *
     * @param inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency the value for inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency(String inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency) {
        this.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency = inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency == null ? null : inq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_buyer_init_expect_refund_amt_converted_from_value() {
        return inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value
     *
     * @param inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value the value for inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_init_expect_refund_amt_converted_from_value(Double inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value) {
        this.inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value = inq_rf_amt_buyer_init_expect_refund_amt_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_currency
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_currency
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_buyer_init_expect_refund_amt_currency() {
        return inq_rf_amt_buyer_init_expect_refund_amt_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_currency
     *
     * @param inq_rf_amt_buyer_init_expect_refund_amt_currency the value for inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_currency
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_init_expect_refund_amt_currency(String inq_rf_amt_buyer_init_expect_refund_amt_currency) {
        this.inq_rf_amt_buyer_init_expect_refund_amt_currency = inq_rf_amt_buyer_init_expect_refund_amt_currency == null ? null : inq_rf_amt_buyer_init_expect_refund_amt_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_buyer_init_expect_refund_amt_value() {
        return inq_rf_amt_buyer_init_expect_refund_amt_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_value
     *
     * @param inq_rf_amt_buyer_init_expect_refund_amt_value the value for inquiry_order_details.inq_rf_amt_buyer_init_expect_refund_amt_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_buyer_init_expect_refund_amt_value(Double inq_rf_amt_buyer_init_expect_refund_amt_value) {
        this.inq_rf_amt_buyer_init_expect_refund_amt_value = inq_rf_amt_buyer_init_expect_refund_amt_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_currecy
     *
     * @return the value of inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_currecy
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_international_refund_amount_converted_form_currecy() {
        return inq_rf_amt_international_refund_amount_converted_form_currecy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_currecy
     *
     * @param inq_rf_amt_international_refund_amount_converted_form_currecy the value for inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_currecy
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_international_refund_amount_converted_form_currecy(String inq_rf_amt_international_refund_amount_converted_form_currecy) {
        this.inq_rf_amt_international_refund_amount_converted_form_currecy = inq_rf_amt_international_refund_amount_converted_form_currecy == null ? null : inq_rf_amt_international_refund_amount_converted_form_currecy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_international_refund_amount_converted_form_value() {
        return inq_rf_amt_international_refund_amount_converted_form_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_value
     *
     * @param inq_rf_amt_international_refund_amount_converted_form_value the value for inquiry_order_details.inq_rf_amt_international_refund_amount_converted_form_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_international_refund_amount_converted_form_value(Double inq_rf_amt_international_refund_amount_converted_form_value) {
        this.inq_rf_amt_international_refund_amount_converted_form_value = inq_rf_amt_international_refund_amount_converted_form_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_currency
     *
     * @return the value of inquiry_order_details.inq_rf_amt_international_refund_amount_currency
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_international_refund_amount_currency() {
        return inq_rf_amt_international_refund_amount_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_currency
     *
     * @param inq_rf_amt_international_refund_amount_currency the value for inquiry_order_details.inq_rf_amt_international_refund_amount_currency
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_international_refund_amount_currency(String inq_rf_amt_international_refund_amount_currency) {
        this.inq_rf_amt_international_refund_amount_currency = inq_rf_amt_international_refund_amount_currency == null ? null : inq_rf_amt_international_refund_amount_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_international_refund_amount_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_international_refund_amount_value() {
        return inq_rf_amt_international_refund_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_international_refund_amount_value
     *
     * @param inq_rf_amt_international_refund_amount_value the value for inquiry_order_details.inq_rf_amt_international_refund_amount_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_international_refund_amount_value(Double inq_rf_amt_international_refund_amount_value) {
        this.inq_rf_amt_international_refund_amount_value = inq_rf_amt_international_refund_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_converted_from_currency
     *
     * @return the value of inquiry_order_details.inq_rf_amt_refund_amount_converted_from_currency
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_refund_amount_converted_from_currency() {
        return inq_rf_amt_refund_amount_converted_from_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_converted_from_currency
     *
     * @param inq_rf_amt_refund_amount_converted_from_currency the value for inquiry_order_details.inq_rf_amt_refund_amount_converted_from_currency
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_refund_amount_converted_from_currency(String inq_rf_amt_refund_amount_converted_from_currency) {
        this.inq_rf_amt_refund_amount_converted_from_currency = inq_rf_amt_refund_amount_converted_from_currency == null ? null : inq_rf_amt_refund_amount_converted_from_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_converted_from_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_refund_amount_converted_from_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_refund_amount_converted_from_value() {
        return inq_rf_amt_refund_amount_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_converted_from_value
     *
     * @param inq_rf_amt_refund_amount_converted_from_value the value for inquiry_order_details.inq_rf_amt_refund_amount_converted_from_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_refund_amount_converted_from_value(Double inq_rf_amt_refund_amount_converted_from_value) {
        this.inq_rf_amt_refund_amount_converted_from_value = inq_rf_amt_refund_amount_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_currency
     *
     * @return the value of inquiry_order_details.inq_rf_amt_refund_amount_currency
     *
     * @mbggenerated
     */
    public String getInq_rf_amt_refund_amount_currency() {
        return inq_rf_amt_refund_amount_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_currency
     *
     * @param inq_rf_amt_refund_amount_currency the value for inquiry_order_details.inq_rf_amt_refund_amount_currency
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_refund_amount_currency(String inq_rf_amt_refund_amount_currency) {
        this.inq_rf_amt_refund_amount_currency = inq_rf_amt_refund_amount_currency == null ? null : inq_rf_amt_refund_amount_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_value
     *
     * @return the value of inquiry_order_details.inq_rf_amt_refund_amount_value
     *
     * @mbggenerated
     */
    public Double getInq_rf_amt_refund_amount_value() {
        return inq_rf_amt_refund_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_rf_amt_refund_amount_value
     *
     * @param inq_rf_amt_refund_amount_value the value for inquiry_order_details.inq_rf_amt_refund_amount_value
     *
     * @mbggenerated
     */
    public void setInq_rf_amt_refund_amount_value(Double inq_rf_amt_refund_amount_value) {
        this.inq_rf_amt_refund_amount_value = inq_rf_amt_refund_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_refund_dead_line_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq_refund_dead_line_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq_refund_dead_line_date_formatted_value() {
        return inq_refund_dead_line_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_refund_dead_line_date_formatted_value
     *
     * @param inq_refund_dead_line_date_formatted_value the value for inquiry_order_details.inq_refund_dead_line_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq_refund_dead_line_date_formatted_value(String inq_refund_dead_line_date_formatted_value) {
        this.inq_refund_dead_line_date_formatted_value = inq_refund_dead_line_date_formatted_value == null ? null : inq_refund_dead_line_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_refund_dead_line_date_value
     *
     * @return the value of inquiry_order_details.inq_refund_dead_line_date_value
     *
     * @mbggenerated
     */
    public Date getInq_refund_dead_line_date_value() {
        return inq_refund_dead_line_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_refund_dead_line_date_value
     *
     * @param inq_refund_dead_line_date_value the value for inquiry_order_details.inq_refund_dead_line_date_value
     *
     * @mbggenerated
     */
    public void setInq_refund_dead_line_date_value(Date inq_refund_dead_line_date_value) {
        this.inq_refund_dead_line_date_value = inq_refund_dead_line_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_total_amount_converted_from_currency
     *
     * @return the value of inquiry_order_details.inq_total_amount_converted_from_currency
     *
     * @mbggenerated
     */
    public String getInq_total_amount_converted_from_currency() {
        return inq_total_amount_converted_from_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_total_amount_converted_from_currency
     *
     * @param inq_total_amount_converted_from_currency the value for inquiry_order_details.inq_total_amount_converted_from_currency
     *
     * @mbggenerated
     */
    public void setInq_total_amount_converted_from_currency(String inq_total_amount_converted_from_currency) {
        this.inq_total_amount_converted_from_currency = inq_total_amount_converted_from_currency == null ? null : inq_total_amount_converted_from_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_total_amount_converted_from_value
     *
     * @return the value of inquiry_order_details.inq_total_amount_converted_from_value
     *
     * @mbggenerated
     */
    public Double getInq_total_amount_converted_from_value() {
        return inq_total_amount_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_total_amount_converted_from_value
     *
     * @param inq_total_amount_converted_from_value the value for inquiry_order_details.inq_total_amount_converted_from_value
     *
     * @mbggenerated
     */
    public void setInq_total_amount_converted_from_value(Double inq_total_amount_converted_from_value) {
        this.inq_total_amount_converted_from_value = inq_total_amount_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_total_amount_currency
     *
     * @return the value of inquiry_order_details.inq_total_amount_currency
     *
     * @mbggenerated
     */
    public String getInq_total_amount_currency() {
        return inq_total_amount_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_total_amount_currency
     *
     * @param inq_total_amount_currency the value for inquiry_order_details.inq_total_amount_currency
     *
     * @mbggenerated
     */
    public void setInq_total_amount_currency(String inq_total_amount_currency) {
        this.inq_total_amount_currency = inq_total_amount_currency == null ? null : inq_total_amount_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_total_amount_value
     *
     * @return the value of inquiry_order_details.inq_total_amount_value
     *
     * @mbggenerated
     */
    public Double getInq_total_amount_value() {
        return inq_total_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_total_amount_value
     *
     * @param inq_total_amount_value the value for inquiry_order_details.inq_total_amount_value
     *
     * @mbggenerated
     */
    public void setInq_total_amount_value(Double inq_total_amount_value) {
        this.inq_total_amount_value = inq_total_amount_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inquiry_quantity
     *
     * @return the value of inquiry_order_details.inquiry_quantity
     *
     * @mbggenerated
     */
    public Integer getInquiry_quantity() {
        return inquiry_quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inquiry_quantity
     *
     * @param inquiry_quantity the value for inquiry_order_details.inquiry_quantity
     *
     * @mbggenerated
     */
    public void setInquiry_quantity(Integer inquiry_quantity) {
        this.inquiry_quantity = inquiry_quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_details_item_picture_url
     *
     * @return the value of inquiry_order_details.item_details_item_picture_url
     *
     * @mbggenerated
     */
    public String getItem_details_item_picture_url() {
        return item_details_item_picture_url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_details_item_picture_url
     *
     * @param item_details_item_picture_url the value for inquiry_order_details.item_details_item_picture_url
     *
     * @mbggenerated
     */
    public void setItem_details_item_picture_url(String item_details_item_picture_url) {
        this.item_details_item_picture_url = item_details_item_picture_url == null ? null : item_details_item_picture_url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_details_item_price_converted_from_currency
     *
     * @return the value of inquiry_order_details.item_details_item_price_converted_from_currency
     *
     * @mbggenerated
     */
    public String getItem_details_item_price_converted_from_currency() {
        return item_details_item_price_converted_from_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_details_item_price_converted_from_currency
     *
     * @param item_details_item_price_converted_from_currency the value for inquiry_order_details.item_details_item_price_converted_from_currency
     *
     * @mbggenerated
     */
    public void setItem_details_item_price_converted_from_currency(String item_details_item_price_converted_from_currency) {
        this.item_details_item_price_converted_from_currency = item_details_item_price_converted_from_currency == null ? null : item_details_item_price_converted_from_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_details_item_price_converted_from_value
     *
     * @return the value of inquiry_order_details.item_details_item_price_converted_from_value
     *
     * @mbggenerated
     */
    public Double getItem_details_item_price_converted_from_value() {
        return item_details_item_price_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_details_item_price_converted_from_value
     *
     * @param item_details_item_price_converted_from_value the value for inquiry_order_details.item_details_item_price_converted_from_value
     *
     * @mbggenerated
     */
    public void setItem_details_item_price_converted_from_value(Double item_details_item_price_converted_from_value) {
        this.item_details_item_price_converted_from_value = item_details_item_price_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_details_item_price_currency
     *
     * @return the value of inquiry_order_details.item_details_item_price_currency
     *
     * @mbggenerated
     */
    public String getItem_details_item_price_currency() {
        return item_details_item_price_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_details_item_price_currency
     *
     * @param item_details_item_price_currency the value for inquiry_order_details.item_details_item_price_currency
     *
     * @mbggenerated
     */
    public void setItem_details_item_price_currency(String item_details_item_price_currency) {
        this.item_details_item_price_currency = item_details_item_price_currency == null ? null : item_details_item_price_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_details_item_price_value
     *
     * @return the value of inquiry_order_details.item_details_item_price_value
     *
     * @mbggenerated
     */
    public Double getItem_details_item_price_value() {
        return item_details_item_price_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_details_item_price_value
     *
     * @param item_details_item_price_value the value for inquiry_order_details.item_details_item_price_value
     *
     * @mbggenerated
     */
    public void setItem_details_item_price_value(Double item_details_item_price_value) {
        this.item_details_item_price_value = item_details_item_price_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_details_item_title
     *
     * @return the value of inquiry_order_details.item_details_item_title
     *
     * @mbggenerated
     */
    public String getItem_details_item_title() {
        return item_details_item_title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_details_item_title
     *
     * @param item_details_item_title the value for inquiry_order_details.item_details_item_title
     *
     * @mbggenerated
     */
    public void setItem_details_item_title(String item_details_item_title) {
        this.item_details_item_title = item_details_item_title == null ? null : item_details_item_title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.item_details_view_purchased_item_url
     *
     * @return the value of inquiry_order_details.item_details_view_purchased_item_url
     *
     * @mbggenerated
     */
    public String getItem_details_view_purchased_item_url() {
        return item_details_view_purchased_item_url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.item_details_view_purchased_item_url
     *
     * @param item_details_view_purchased_item_url the value for inquiry_order_details.item_details_view_purchased_item_url
     *
     * @mbggenerated
     */
    public void setItem_details_view_purchased_item_url(String item_details_view_purchased_item_url) {
        this.item_details_view_purchased_item_url = item_details_view_purchased_item_url == null ? null : item_details_view_purchased_item_url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_history
     *
     * @return the value of inquiry_order_details.inq_his_history
     *
     * @mbggenerated
     */
    public String getInq_his_history() {
        return inq_his_history;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_history
     *
     * @param inq_his_history the value for inquiry_order_details.inq_his_history
     *
     * @mbggenerated
     */
    public void setInq_his_history(String inq_his_history) {
        this.inq_his_history = inq_his_history == null ? null : inq_his_history.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_additional_info
     *
     * @return the value of inquiry_order_details.inq_his_additional_info
     *
     * @mbggenerated
     */
    public String getInq_his_additional_info() {
        return inq_his_additional_info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_additional_info
     *
     * @param inq_his_additional_info the value for inquiry_order_details.inq_his_additional_info
     *
     * @mbggenerated
     */
    public void setInq_his_additional_info(String inq_his_additional_info) {
        this.inq_his_additional_info = inq_his_additional_info == null ? null : inq_his_additional_info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_buyer_requested
     *
     * @return the value of inquiry_order_details.inq_his_buyer_requested
     *
     * @mbggenerated
     */
    public String getInq_his_buyer_requested() {
        return inq_his_buyer_requested;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_buyer_requested
     *
     * @param inq_his_buyer_requested the value for inquiry_order_details.inq_his_buyer_requested
     *
     * @mbggenerated
     */
    public void setInq_his_buyer_requested(String inq_his_buyer_requested) {
        this.inq_his_buyer_requested = inq_his_buyer_requested == null ? null : inq_his_buyer_requested.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_carrier
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_carrier
     *
     * @mbggenerated
     */
    public String getInq_his_shipment_tracking_carrier() {
        return inq_his_shipment_tracking_carrier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_carrier
     *
     * @param inq_his_shipment_tracking_carrier the value for inquiry_order_details.inq_his_shipment_tracking_carrier
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_carrier(String inq_his_shipment_tracking_carrier) {
        this.inq_his_shipment_tracking_carrier = inq_his_shipment_tracking_carrier == null ? null : inq_his_shipment_tracking_carrier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_current_status
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_current_status
     *
     * @mbggenerated
     */
    public String getInq_his_shipment_tracking_current_status() {
        return inq_his_shipment_tracking_current_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_current_status
     *
     * @param inq_his_shipment_tracking_current_status the value for inquiry_order_details.inq_his_shipment_tracking_current_status
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_current_status(String inq_his_shipment_tracking_current_status) {
        this.inq_his_shipment_tracking_current_status = inq_his_shipment_tracking_current_status == null ? null : inq_his_shipment_tracking_current_status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq_his_shipment_tracking_estimate_form_date_formatted_value() {
        return inq_his_shipment_tracking_estimate_form_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_formatted_value
     *
     * @param inq_his_shipment_tracking_estimate_form_date_formatted_value the value for inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_estimate_form_date_formatted_value(String inq_his_shipment_tracking_estimate_form_date_formatted_value) {
        this.inq_his_shipment_tracking_estimate_form_date_formatted_value = inq_his_shipment_tracking_estimate_form_date_formatted_value == null ? null : inq_his_shipment_tracking_estimate_form_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_value
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_value
     *
     * @mbggenerated
     */
    public Date getInq_his_shipment_tracking_estimate_form_date_value() {
        return inq_his_shipment_tracking_estimate_form_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_value
     *
     * @param inq_his_shipment_tracking_estimate_form_date_value the value for inquiry_order_details.inq_his_shipment_tracking_estimate_form_date_value
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_estimate_form_date_value(Date inq_his_shipment_tracking_estimate_form_date_value) {
        this.inq_his_shipment_tracking_estimate_form_date_value = inq_his_shipment_tracking_estimate_form_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_formatted_value
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_formatted_value
     *
     * @mbggenerated
     */
    public String getInq_his_shipment_tracking_estimate_to_date_formatted_value() {
        return inq_his_shipment_tracking_estimate_to_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_formatted_value
     *
     * @param inq_his_shipment_tracking_estimate_to_date_formatted_value the value for inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_formatted_value
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_estimate_to_date_formatted_value(String inq_his_shipment_tracking_estimate_to_date_formatted_value) {
        this.inq_his_shipment_tracking_estimate_to_date_formatted_value = inq_his_shipment_tracking_estimate_to_date_formatted_value == null ? null : inq_his_shipment_tracking_estimate_to_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_value
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_value
     *
     * @mbggenerated
     */
    public Date getInq_his_shipment_tracking_estimate_to_date_value() {
        return inq_his_shipment_tracking_estimate_to_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_value
     *
     * @param inq_his_shipment_tracking_estimate_to_date_value the value for inquiry_order_details.inq_his_shipment_tracking_estimate_to_date_value
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_estimate_to_date_value(Date inq_his_shipment_tracking_estimate_to_date_value) {
        this.inq_his_shipment_tracking_estimate_to_date_value = inq_his_shipment_tracking_estimate_to_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_number
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_number
     *
     * @mbggenerated
     */
    public String getInq_his_shipment_tracking_number() {
        return inq_his_shipment_tracking_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_number
     *
     * @param inq_his_shipment_tracking_number the value for inquiry_order_details.inq_his_shipment_tracking_number
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_number(String inq_his_shipment_tracking_number) {
        this.inq_his_shipment_tracking_number = inq_his_shipment_tracking_number == null ? null : inq_his_shipment_tracking_number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.inq_his_shipment_tracking_URL
     *
     * @return the value of inquiry_order_details.inq_his_shipment_tracking_URL
     *
     * @mbggenerated
     */
    public String getInq_his_shipment_tracking_URL() {
        return inq_his_shipment_tracking_URL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.inq_his_shipment_tracking_URL
     *
     * @param inq_his_shipment_tracking_URL the value for inquiry_order_details.inq_his_shipment_tracking_URL
     *
     * @mbggenerated
     */
    public void setInq_his_shipment_tracking_URL(String inq_his_shipment_tracking_URL) {
        this.inq_his_shipment_tracking_URL = inq_his_shipment_tracking_URL == null ? null : inq_his_shipment_tracking_URL.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_address_line1
     *
     * @return the value of inquiry_order_details.return_details_address_address_line1
     *
     * @mbggenerated
     */
    public String getReturn_details_address_address_line1() {
        return return_details_address_address_line1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_address_line1
     *
     * @param return_details_address_address_line1 the value for inquiry_order_details.return_details_address_address_line1
     *
     * @mbggenerated
     */
    public void setReturn_details_address_address_line1(String return_details_address_address_line1) {
        this.return_details_address_address_line1 = return_details_address_address_line1 == null ? null : return_details_address_address_line1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_address_line2
     *
     * @return the value of inquiry_order_details.return_details_address_address_line2
     *
     * @mbggenerated
     */
    public String getReturn_details_address_address_line2() {
        return return_details_address_address_line2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_address_line2
     *
     * @param return_details_address_address_line2 the value for inquiry_order_details.return_details_address_address_line2
     *
     * @mbggenerated
     */
    public void setReturn_details_address_address_line2(String return_details_address_address_line2) {
        this.return_details_address_address_line2 = return_details_address_address_line2 == null ? null : return_details_address_address_line2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_address_type
     *
     * @return the value of inquiry_order_details.return_details_address_address_type
     *
     * @mbggenerated
     */
    public String getReturn_details_address_address_type() {
        return return_details_address_address_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_address_type
     *
     * @param return_details_address_address_type the value for inquiry_order_details.return_details_address_address_type
     *
     * @mbggenerated
     */
    public void setReturn_details_address_address_type(String return_details_address_address_type) {
        this.return_details_address_address_type = return_details_address_address_type == null ? null : return_details_address_address_type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_city
     *
     * @return the value of inquiry_order_details.return_details_address_city
     *
     * @mbggenerated
     */
    public String getReturn_details_address_city() {
        return return_details_address_city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_city
     *
     * @param return_details_address_city the value for inquiry_order_details.return_details_address_city
     *
     * @mbggenerated
     */
    public void setReturn_details_address_city(String return_details_address_city) {
        this.return_details_address_city = return_details_address_city == null ? null : return_details_address_city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_country
     *
     * @return the value of inquiry_order_details.return_details_address_country
     *
     * @mbggenerated
     */
    public String getReturn_details_address_country() {
        return return_details_address_country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_country
     *
     * @param return_details_address_country the value for inquiry_order_details.return_details_address_country
     *
     * @mbggenerated
     */
    public void setReturn_details_address_country(String return_details_address_country) {
        this.return_details_address_country = return_details_address_country == null ? null : return_details_address_country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_county
     *
     * @return the value of inquiry_order_details.return_details_address_county
     *
     * @mbggenerated
     */
    public String getReturn_details_address_county() {
        return return_details_address_county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_county
     *
     * @param return_details_address_county the value for inquiry_order_details.return_details_address_county
     *
     * @mbggenerated
     */
    public void setReturn_details_address_county(String return_details_address_county) {
        this.return_details_address_county = return_details_address_county == null ? null : return_details_address_county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_is_transliterated
     *
     * @return the value of inquiry_order_details.return_details_address_is_transliterated
     *
     * @mbggenerated
     */
    public Boolean getReturn_details_address_is_transliterated() {
        return return_details_address_is_transliterated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_is_transliterated
     *
     * @param return_details_address_is_transliterated the value for inquiry_order_details.return_details_address_is_transliterated
     *
     * @mbggenerated
     */
    public void setReturn_details_address_is_transliterated(Boolean return_details_address_is_transliterated) {
        this.return_details_address_is_transliterated = return_details_address_is_transliterated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_national_region
     *
     * @return the value of inquiry_order_details.return_details_address_national_region
     *
     * @mbggenerated
     */
    public String getReturn_details_address_national_region() {
        return return_details_address_national_region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_national_region
     *
     * @param return_details_address_national_region the value for inquiry_order_details.return_details_address_national_region
     *
     * @mbggenerated
     */
    public void setReturn_details_address_national_region(String return_details_address_national_region) {
        this.return_details_address_national_region = return_details_address_national_region == null ? null : return_details_address_national_region.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_postal_code
     *
     * @return the value of inquiry_order_details.return_details_address_postal_code
     *
     * @mbggenerated
     */
    public String getReturn_details_address_postal_code() {
        return return_details_address_postal_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_postal_code
     *
     * @param return_details_address_postal_code the value for inquiry_order_details.return_details_address_postal_code
     *
     * @mbggenerated
     */
    public void setReturn_details_address_postal_code(String return_details_address_postal_code) {
        this.return_details_address_postal_code = return_details_address_postal_code == null ? null : return_details_address_postal_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_script
     *
     * @return the value of inquiry_order_details.return_details_address_script
     *
     * @mbggenerated
     */
    public String getReturn_details_address_script() {
        return return_details_address_script;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_script
     *
     * @param return_details_address_script the value for inquiry_order_details.return_details_address_script
     *
     * @mbggenerated
     */
    public void setReturn_details_address_script(String return_details_address_script) {
        this.return_details_address_script = return_details_address_script == null ? null : return_details_address_script.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_state_or_province
     *
     * @return the value of inquiry_order_details.return_details_address_state_or_province
     *
     * @mbggenerated
     */
    public String getReturn_details_address_state_or_province() {
        return return_details_address_state_or_province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_state_or_province
     *
     * @param return_details_address_state_or_province the value for inquiry_order_details.return_details_address_state_or_province
     *
     * @mbggenerated
     */
    public void setReturn_details_address_state_or_province(String return_details_address_state_or_province) {
        this.return_details_address_state_or_province = return_details_address_state_or_province == null ? null : return_details_address_state_or_province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_transliterated_from_script
     *
     * @return the value of inquiry_order_details.return_details_address_transliterated_from_script
     *
     * @mbggenerated
     */
    public String getReturn_details_address_transliterated_from_script() {
        return return_details_address_transliterated_from_script;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_transliterated_from_script
     *
     * @param return_details_address_transliterated_from_script the value for inquiry_order_details.return_details_address_transliterated_from_script
     *
     * @mbggenerated
     */
    public void setReturn_details_address_transliterated_from_script(String return_details_address_transliterated_from_script) {
        this.return_details_address_transliterated_from_script = return_details_address_transliterated_from_script == null ? null : return_details_address_transliterated_from_script.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_address_world_region
     *
     * @return the value of inquiry_order_details.return_details_address_world_region
     *
     * @mbggenerated
     */
    public String getReturn_details_address_world_region() {
        return return_details_address_world_region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_address_world_region
     *
     * @param return_details_address_world_region the value for inquiry_order_details.return_details_address_world_region
     *
     * @mbggenerated
     */
    public void setReturn_details_address_world_region(String return_details_address_world_region) {
        this.return_details_address_world_region = return_details_address_world_region == null ? null : return_details_address_world_region.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_editable
     *
     * @return the value of inquiry_order_details.return_details_editable
     *
     * @mbggenerated
     */
    public Boolean getReturn_details_editable() {
        return return_details_editable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_editable
     *
     * @param return_details_editable the value for inquiry_order_details.return_details_editable
     *
     * @mbggenerated
     */
    public void setReturn_details_editable(Boolean return_details_editable) {
        this.return_details_editable = return_details_editable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_first_name
     *
     * @return the value of inquiry_order_details.return_details_first_name
     *
     * @mbggenerated
     */
    public String getReturn_details_first_name() {
        return return_details_first_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_first_name
     *
     * @param return_details_first_name the value for inquiry_order_details.return_details_first_name
     *
     * @mbggenerated
     */
    public void setReturn_details_first_name(String return_details_first_name) {
        this.return_details_first_name = return_details_first_name == null ? null : return_details_first_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_last_name
     *
     * @return the value of inquiry_order_details.return_details_last_name
     *
     * @mbggenerated
     */
    public String getReturn_details_last_name() {
        return return_details_last_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_last_name
     *
     * @param return_details_last_name the value for inquiry_order_details.return_details_last_name
     *
     * @mbggenerated
     */
    public void setReturn_details_last_name(String return_details_last_name) {
        this.return_details_last_name = return_details_last_name == null ? null : return_details_last_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.return_details_RMA
     *
     * @return the value of inquiry_order_details.return_details_RMA
     *
     * @mbggenerated
     */
    public String getReturn_details_RMA() {
        return return_details_RMA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.return_details_RMA
     *
     * @param return_details_RMA the value for inquiry_order_details.return_details_RMA
     *
     * @mbggenerated
     */
    public void setReturn_details_RMA(String return_details_RMA) {
        this.return_details_RMA = return_details_RMA == null ? null : return_details_RMA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.seller_makeIt_right_by_date_formatted_value
     *
     * @return the value of inquiry_order_details.seller_makeIt_right_by_date_formatted_value
     *
     * @mbggenerated
     */
    public String getSeller_makeIt_right_by_date_formatted_value() {
        return seller_makeIt_right_by_date_formatted_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.seller_makeIt_right_by_date_formatted_value
     *
     * @param seller_makeIt_right_by_date_formatted_value the value for inquiry_order_details.seller_makeIt_right_by_date_formatted_value
     *
     * @mbggenerated
     */
    public void setSeller_makeIt_right_by_date_formatted_value(String seller_makeIt_right_by_date_formatted_value) {
        this.seller_makeIt_right_by_date_formatted_value = seller_makeIt_right_by_date_formatted_value == null ? null : seller_makeIt_right_by_date_formatted_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.seller_makeIt_right_by_date_value
     *
     * @return the value of inquiry_order_details.seller_makeIt_right_by_date_value
     *
     * @mbggenerated
     */
    public Date getSeller_makeIt_right_by_date_value() {
        return seller_makeIt_right_by_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.seller_makeIt_right_by_date_value
     *
     * @param seller_makeIt_right_by_date_value the value for inquiry_order_details.seller_makeIt_right_by_date_value
     *
     * @mbggenerated
     */
    public void setSeller_makeIt_right_by_date_value(Date seller_makeIt_right_by_date_value) {
        this.seller_makeIt_right_by_date_value = seller_makeIt_right_by_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.shipping_cost_converted_from_currency
     *
     * @return the value of inquiry_order_details.shipping_cost_converted_from_currency
     *
     * @mbggenerated
     */
    public String getShipping_cost_converted_from_currency() {
        return shipping_cost_converted_from_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.shipping_cost_converted_from_currency
     *
     * @param shipping_cost_converted_from_currency the value for inquiry_order_details.shipping_cost_converted_from_currency
     *
     * @mbggenerated
     */
    public void setShipping_cost_converted_from_currency(String shipping_cost_converted_from_currency) {
        this.shipping_cost_converted_from_currency = shipping_cost_converted_from_currency == null ? null : shipping_cost_converted_from_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.shipping_cost_converted_from_value
     *
     * @return the value of inquiry_order_details.shipping_cost_converted_from_value
     *
     * @mbggenerated
     */
    public Double getShipping_cost_converted_from_value() {
        return shipping_cost_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.shipping_cost_converted_from_value
     *
     * @param shipping_cost_converted_from_value the value for inquiry_order_details.shipping_cost_converted_from_value
     *
     * @mbggenerated
     */
    public void setShipping_cost_converted_from_value(Double shipping_cost_converted_from_value) {
        this.shipping_cost_converted_from_value = shipping_cost_converted_from_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.shipping_cost_currency
     *
     * @return the value of inquiry_order_details.shipping_cost_currency
     *
     * @mbggenerated
     */
    public String getShipping_cost_currency() {
        return shipping_cost_currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.shipping_cost_currency
     *
     * @param shipping_cost_currency the value for inquiry_order_details.shipping_cost_currency
     *
     * @mbggenerated
     */
    public void setShipping_cost_currency(String shipping_cost_currency) {
        this.shipping_cost_currency = shipping_cost_currency == null ? null : shipping_cost_currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.shipping_cost_value
     *
     * @return the value of inquiry_order_details.shipping_cost_value
     *
     * @mbggenerated
     */
    public Double getShipping_cost_value() {
        return shipping_cost_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.shipping_cost_value
     *
     * @param shipping_cost_value the value for inquiry_order_details.shipping_cost_value
     *
     * @mbggenerated
     */
    public void setShipping_cost_value(Double shipping_cost_value) {
        this.shipping_cost_value = shipping_cost_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.state
     *
     * @return the value of inquiry_order_details.state
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.state
     *
     * @param state the value for inquiry_order_details.state
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.status
     *
     * @return the value of inquiry_order_details.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.status
     *
     * @param status the value for inquiry_order_details.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inquiry_order_details.view_PPTrasanction_url
     *
     * @return the value of inquiry_order_details.view_PPTrasanction_url
     *
     * @mbggenerated
     */
    public String getView_PPTrasanction_url() {
        return view_PPTrasanction_url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inquiry_order_details.view_PPTrasanction_url
     *
     * @param view_PPTrasanction_url the value for inquiry_order_details.view_PPTrasanction_url
     *
     * @mbggenerated
     */
    public void setView_PPTrasanction_url(String view_PPTrasanction_url) {
        this.view_PPTrasanction_url = view_PPTrasanction_url == null ? null : view_PPTrasanction_url.trim();
    }
}