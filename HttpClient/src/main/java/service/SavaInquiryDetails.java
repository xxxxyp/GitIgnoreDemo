package service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import entity.inquirydetails.Address;
import entity.inquirydetails.AppealDetails;
import entity.inquirydetails.BuyerFinalAcceptRefundAmt;
import entity.inquirydetails.BuyerInitExpectRefundAmt;
import entity.inquirydetails.ClaimAmount;
import entity.inquirydetails.InquiryDetails;
import entity.inquirydetails.InquiryHistoryDetails;
import entity.inquirydetails.InquiryInfo;
import entity.inquirydetails.InquiryOrderDetails;
import entity.inquirydetails.InternationalRefundAmount;
import entity.inquirydetails.ItemDetails;
import entity.inquirydetails.RefundAmount;
import entity.inquirydetails.RefundAmounts;
import entity.inquirydetails.ReturnDetails;
import entity.inquirydetails.ShipmentTrackingDetails;
import entity.inquirydetails.ShippingCost;
import entity.inquirydetails.TotalAmount;



public class SavaInquiryDetails {
	public InquiryOrderDetails handleInquiryOrderDetails (InquiryInfo inquiryInfo,Integer user_id,Integer shop_id) throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		InquiryOrderDetails inquiryOrderDetails=new InquiryOrderDetails();
		inquiryOrderDetails.setInquiry_id(
				inquiryInfo.getInquiryId());
		inquiryOrderDetails.setUser_id(user_id);
		inquiryOrderDetails.setShop_id(shop_id);
		inquiryOrderDetails.setTransaction_id(
				inquiryInfo.getTransactionId());
		if(inquiryInfo.getClaimAmount()!=null){
			ClaimAmount claimAmount=inquiryInfo.getClaimAmount();
			inquiryOrderDetails.setClaim_amount_converted_from_currency(
					claimAmount.getConvertedFromCurrency());
			inquiryOrderDetails.setClaim_amount_converted_from_value(
					claimAmount.getConvertedFromValue());
			inquiryOrderDetails.setClaim_amount_currency(
					claimAmount.getCurrency());
			inquiryOrderDetails.setClaim_amount_value(
					claimAmount.getValue());
		}
		
		inquiryOrderDetails.setExt_transaction_id(
				inquiryInfo.getExtTransactionId());
		inquiryOrderDetails.setInitiator(
				inquiryInfo.getInitiator());
		if(inquiryInfo.getInquiryDetails()!=null){
			InquiryDetails inquiryDetails=inquiryInfo.getInquiryDetails();
			if(inquiryDetails.getAppealDetails()!=null){
				AppealDetails appealDetails=inquiryDetails.getAppealDetails();
				inquiryOrderDetails.setInq__appeal_details_appeal_close_reason_enum(
						appealDetails.getAppealCloseReasonEnum());
				inquiryOrderDetails.setInq__appeal_details_appeal_date_formatted_value(
						appealDetails.getAppealDate().getFormattedValue());
				inquiryOrderDetails.setInq__appeal_details_appeal_date_value(
						appealDetails.getAppealDate().getValue());
				inquiryOrderDetails.setInq__appeal_details_appeal_reason_code(
						appealDetails.getAppealReasonCode());
				inquiryOrderDetails.setInq__appeal_details_appeal_appeal_sataus(
						appealDetails.getAppealStatus());
				inquiryOrderDetails.setInq__appeal_details_appeal_status_enum(
						appealDetails.getAppealStatusEnum());
				inquiryOrderDetails.setInq__appeal_details_eligible_for_appeal(
						appealDetails.getEligibleForAppeal());
			}
			if(inquiryDetails.getCreationDate()!=null){
				inquiryOrderDetails.setInq_creation_date_formatted_value(
						inquiryDetails.getCreationDate().getFormattedValue());
				inquiryOrderDetails.setInq_creation_date_value(
						inquiryDetails.getCreationDate().getValue());
			}
			if(inquiryDetails.getEscalationDate()!=null){
				inquiryOrderDetails.setInq_escalation_date_formatted_value(
						inquiryDetails.getEscalationDate().getFormattedValue());
				inquiryOrderDetails.setInq_escalation_date_value(
						inquiryDetails.getEscalationDate().getValue());
			}
			if(inquiryDetails.getExpirationDate()!=null){
				inquiryOrderDetails.setInq_expiration_date_formatted_value(
						inquiryDetails.getExpirationDate().getFormattedValue());
				inquiryOrderDetails.setInq_expiration_date_value(
						inquiryDetails.getExpirationDate().getValue());
			}
			if(inquiryDetails.getLastBuyerRespDate()!=null){
				inquiryOrderDetails.setInq_last_buyer_resp_date_formatted_value(
						inquiryDetails.getLastBuyerRespDate().getFormattedValue());
				inquiryOrderDetails.setInq_last_buyer_resp_date_value(
						inquiryDetails.getLastBuyerRespDate().getValue());
			}
			if(inquiryDetails.getRefundAmounts()!=null){
				RefundAmounts refundAmounts=inquiryDetails.getRefundAmounts();
				if(refundAmounts.getBuyerFinalAcceptRefundAmt()!=null){
					BuyerFinalAcceptRefundAmt buyerFinalAcceptRefundAmt=
							refundAmounts.getBuyerFinalAcceptRefundAmt();
					inquiryOrderDetails.setInq_rf_amt_buyer_final_accept_refund_amt_converted_from_currency(
							buyerFinalAcceptRefundAmt.getConvertedFromCurrency());
					inquiryOrderDetails.setInq_rf_amt_buyer_final_accept_refund_amt_converted_from_value(
							buyerFinalAcceptRefundAmt.getConvertedFromValue());
					inquiryOrderDetails.setInq_rf_amt_buyer_final_accept_refund_amt_currency(
							buyerFinalAcceptRefundAmt.getCurrency());
					inquiryOrderDetails.setInq_rf_amt_buyer_final_accept_refund_amt_value(
							buyerFinalAcceptRefundAmt.getValue());
				}
				if(refundAmounts.getBuyerInitExpectRefundAmt()!=null){
					BuyerInitExpectRefundAmt buyerInitExpectRefundAmt=
							refundAmounts.getBuyerInitExpectRefundAmt();
					inquiryOrderDetails.setInq_rf_amt_buyer_init_expect_refund_amt_converted_from_currency(
							buyerInitExpectRefundAmt.getConvertedFromCurrency());
					inquiryOrderDetails.setInq_rf_amt_buyer_init_expect_refund_amt_converted_from_value(
							buyerInitExpectRefundAmt.getConvertedFromValue());
					inquiryOrderDetails.setInq_rf_amt_buyer_init_expect_refund_amt_currency(
							buyerInitExpectRefundAmt.getCurrency());
					inquiryOrderDetails.setInq_rf_amt_buyer_init_expect_refund_amt_value(
							buyerInitExpectRefundAmt.getValue());
				}
				if(refundAmounts.getInternationalRefundAmount()!=null){
					InternationalRefundAmount InternationalRefundAmount=
							refundAmounts.getInternationalRefundAmount();
					
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_converted_form_currecy(
							InternationalRefundAmount.getConvertedFromCurrency());
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_converted_form_value(
							InternationalRefundAmount.getConvertedFromValue());
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_currency(
							InternationalRefundAmount.getCurrency());
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_value(
							InternationalRefundAmount.getValue());
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_converted_form_currecy(
							InternationalRefundAmount.getConvertedFromCurrency());
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_converted_form_value(
							InternationalRefundAmount.getConvertedFromValue());
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_currency(
							InternationalRefundAmount.getCurrency());
					inquiryOrderDetails.setInq_rf_amt_international_refund_amount_value(
							InternationalRefundAmount.getValue());
				}
				if(refundAmounts.getRefundAmount()!=null){
					RefundAmount  refundAmount=refundAmounts.getRefundAmount();
					inquiryOrderDetails.setInq_rf_amt_refund_amount_converted_from_currency(
							refundAmount.getConvertedFromCurrency());
					inquiryOrderDetails.setInq_rf_amt_refund_amount_converted_from_value(
							refundAmount.getConvertedFromValue());
					inquiryOrderDetails.setInq_rf_amt_refund_amount_currency(
							refundAmount.getCurrency());
					inquiryOrderDetails.setInq_rf_amt_refund_amount_value(
							refundAmount.getValue());
				}				
			}
			if(inquiryDetails.getRefundDeadlineDate()!=null){
				inquiryOrderDetails.setInq_refund_dead_line_date_formatted_value(
						inquiryDetails.getRefundDeadlineDate().getFormattedValue());
				inquiryOrderDetails.setInq_refund_dead_line_date_value(
						inquiryDetails.getRefundDeadlineDate().getValue());
			}
			if(inquiryDetails.getTotalAmount()!=null){
				TotalAmount totalAmount=inquiryDetails.getTotalAmount();
				inquiryOrderDetails.setInq_total_amount_converted_from_currency(
						totalAmount.getConvertedFromCurrency());
				inquiryOrderDetails.setInq_total_amount_converted_from_value(
						totalAmount.getConvertedFromValue());
				inquiryOrderDetails.setInq_total_amount_currency(
						totalAmount.getCurrency());
				inquiryOrderDetails.setInq_total_amount_value(
						totalAmount.getValue());
			}
			
		}
		if(inquiryInfo.getInquiryQuantity()!=null){
			inquiryOrderDetails.setInquiry_quantity(
					inquiryInfo.getInquiryQuantity());
		}
		if(inquiryInfo.getItemDetails()!=null){
			ItemDetails itemDetails=inquiryInfo.getItemDetails();
			
			inquiryOrderDetails.setItem_details_item_picture_url(
					itemDetails.getItemPictureUrl());
			inquiryOrderDetails.setItem_details_item_price_converted_from_currency(
					itemDetails.getItemPrice().getConvertedFromCurrency());
			inquiryOrderDetails.setItem_details_item_price_converted_from_value(
					itemDetails.getItemPrice().getConvertedFromValue());
			inquiryOrderDetails.setItem_details_item_price_currency(
					itemDetails.getItemPrice().getCurrency());
			inquiryOrderDetails.setItem_details_item_price_value(
					itemDetails.getItemPrice().getValue());
			inquiryOrderDetails.setItem_details_item_title(
					itemDetails.getItemTitle());
			inquiryOrderDetails.setItem_details_view_purchased_item_url(
					itemDetails.getViewPurchasedItemUrl());
		}
		if(inquiryInfo.getItemId()!=null){
			inquiryOrderDetails.setItem_id(
					inquiryInfo.getItemId());
		}
	
		if(inquiryInfo.getInquiryHistoryDetails()!=null){
			InquiryHistoryDetails inquiryHistoryDetails=inquiryInfo.getInquiryHistoryDetails();
			if(inquiryHistoryDetails.getHistory()!=null){
				inquiryOrderDetails.setInq_his_history(
						 mapper.writeValueAsString(inquiryHistoryDetails.getHistory()));
			}
			if(inquiryHistoryDetails.getShipmentTrackingDetails()!=null){
				ShipmentTrackingDetails ShipmentTrackingDetails=
						inquiryHistoryDetails.getShipmentTrackingDetails();
				if(ShipmentTrackingDetails.getEstimateFromDate()!=null){
					inquiryOrderDetails.setInq_his_shipment_tracking_estimate_form_date_formatted_value(
							ShipmentTrackingDetails.getEstimateFromDate().getFormattedValue());
					inquiryOrderDetails.setInq_his_shipment_tracking_estimate_form_date_value(
							ShipmentTrackingDetails.getEstimateFromDate().getValue());
				}
				if(ShipmentTrackingDetails.getEstimateToDate()!=null){
					inquiryOrderDetails.setInq_his_shipment_tracking_estimate_to_date_formatted_value(
							ShipmentTrackingDetails.getEstimateToDate().getFormattedValue());
					inquiryOrderDetails.setInq_his_shipment_tracking_estimate_to_date_value(
							ShipmentTrackingDetails.getEstimateToDate().getValue());
				}
				
				inquiryOrderDetails.setInq_his_shipment_tracking_carrier(
						ShipmentTrackingDetails.getCarrier());
				inquiryOrderDetails.setInq_his_shipment_tracking_current_status(
						ShipmentTrackingDetails.getCurrentStatus());				
				inquiryOrderDetails.setInq_his_shipment_tracking_number(
						ShipmentTrackingDetails.getTrackingNumber());
				inquiryOrderDetails.setInq_his_shipment_tracking_URL(
						ShipmentTrackingDetails.getTrackingURL());
			}
			
		}
		if(inquiryInfo.getReturnDetails()!=null){
			ReturnDetails returnDetails=inquiryInfo.getReturnDetails();
			if(returnDetails.getAddress()!=null){
				Address address=returnDetails.getAddress();
				
				inquiryOrderDetails.setReturn_details_address_address_line1(
						address.getAddressLine1());
				inquiryOrderDetails.setReturn_details_address_address_line2(
						address.getAddressLine2());
				inquiryOrderDetails.setReturn_details_address_address_type(
						address.getAddressType());
				inquiryOrderDetails.setReturn_details_address_city(
						address.getCity());
				inquiryOrderDetails.setReturn_details_address_country(
						address.getCountry());
				inquiryOrderDetails.setReturn_details_address_county(
						address.getCounty());
				inquiryOrderDetails.setReturn_details_address_is_transliterated(
						address.getIsTransliterated());
				inquiryOrderDetails.setReturn_details_address_national_region(
						address.getNationalRegion());
				inquiryOrderDetails.setReturn_details_address_postal_code(
						address.getPostalCode());
				inquiryOrderDetails.setReturn_details_address_script(
						address.getScript());
				inquiryOrderDetails.setReturn_details_address_state_or_province(
						address.getStateOrProvince());
				inquiryOrderDetails.setReturn_details_address_transliterated_from_script(
						address.getTransliteratedFromScript());
				inquiryOrderDetails.setReturn_details_address_world_region(
						address.getWorldRegion());
			}
			inquiryOrderDetails.setReturn_details_editable(
					returnDetails.getEditable());
			inquiryOrderDetails.setReturn_details_first_name(
					returnDetails.getFirstName());
			inquiryOrderDetails.setReturn_details_last_name(
					returnDetails.getLastName());
			inquiryOrderDetails.setReturn_details_RMA(
					returnDetails.getRMA());
		}
		if(inquiryInfo.getSellerMakeItRightByDate()!=null){
			inquiryOrderDetails.setSeller_makeIt_right_by_date_formatted_value(
					inquiryInfo.getSellerMakeItRightByDate().getFormattedValue());
			inquiryOrderDetails.setSeller_makeIt_right_by_date_value(
					inquiryInfo.getSellerMakeItRightByDate().getValue());
		}
		if(inquiryInfo.getShippingCost()!=null){
			ShippingCost ShippingCost=inquiryInfo.getShippingCost();
			
			inquiryOrderDetails.setShipping_cost_converted_from_currency(
					ShippingCost.getConvertedFromCurrency());
			inquiryOrderDetails.setShipping_cost_converted_from_value(
					ShippingCost.getValue());
			inquiryOrderDetails.setShipping_cost_currency(
					ShippingCost.getCurrency());
			inquiryOrderDetails.setShipping_cost_value(
					ShippingCost.getValue());
		}
		inquiryOrderDetails.setState(
				inquiryInfo.getState());
		inquiryOrderDetails.setStatus(
				inquiryInfo.getStatus());
		inquiryOrderDetails.setView_PPTrasanction_url(
				inquiryInfo.getViewPPTrasanctionUrl());
		
		return inquiryOrderDetails;
		
	}

}
