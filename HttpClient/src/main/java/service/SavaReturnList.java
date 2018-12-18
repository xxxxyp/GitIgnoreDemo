package service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import entity.returnsummary.ActualRefundAmount;
import entity.returnsummary.BuyerEscalationEligibilityInfo;
import entity.returnsummary.BuyerTotalRefund;
import entity.returnsummary.Comments;
import entity.returnsummary.CreationInfo;
import entity.returnsummary.EscalationInfo;
import entity.returnsummary.EstimatedRefundAmount;
import entity.returnsummary.Item;
import entity.returnsummary.Members;
import entity.returnsummary.ReturnOrderList;
import entity.returnsummary.SellerEscalationEligibilityInfo;
import entity.returnsummary.SellerTotalRefund;

public class SavaReturnList {
	public ReturnOrderList handleReturnList(Members members,Integer user_id,Integer shop_id) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		ReturnOrderList returnOrderList=new ReturnOrderList();
		returnOrderList.setUser_id(user_id);
		returnOrderList.setShop_id(shop_id);
		returnOrderList.setReturnId(
				members.getReturnId());
		returnOrderList.setBuyer_login_name(
				members.getBuyerLoginName());
		returnOrderList.setSeller_login_name(
				members.getBuyerLoginName());
		returnOrderList.setCurrent_type(
				members.getCurrentType());
		returnOrderList.setState(
				members.getState());
		returnOrderList.setStatus(
				members.getStatus());
		returnOrderList.setTimeout_date_value(
				members.getTimeoutDate().getValue());
		if(members.getCreationInfo()!=null){
			CreationInfo creationInfo=members.getCreationInfo();
			if(members.getCreationInfo().getItem()!=null){
				Item item=creationInfo.getItem();
				returnOrderList.setCreation_info_item_id(
						item.getItemId());
				returnOrderList.setCreation_info_transaction_id(
						item.getTransactionId());
				returnOrderList.setCreation_info_return_quantity(
						item.getReturnQuantity());
				returnOrderList.setCreation_info_item_title(
						item.getItemTitle());
			}
			if(creationInfo.getComments()!=null){
				Comments comments=creationInfo.getComments();
				returnOrderList.setCreation_info_comments_content(
						comments.getContent());
			}
			if(creationInfo.getCreationDate()!=null){
				returnOrderList.setCreation_info_creation_date_value(
						members.getCreationInfo().getCreationDate().getValue());
			}
			returnOrderList.setCreation_info_type(
					creationInfo.getType());
			returnOrderList.setCreation_info_reason(
					creationInfo.getReason());
			returnOrderList.setCreation_info_reason_type(
					creationInfo.getReasonType());
		}
		if(members.getSellerTotalRefund()!=null){
			SellerTotalRefund sellerTotalRefund=members.getSellerTotalRefund();
			if(sellerTotalRefund.getEstimatedRefundAmount()!=null){
				EstimatedRefundAmount estimatedRefundAmount=sellerTotalRefund.getEstimatedRefundAmount();
				returnOrderList.setSeller_total_estimated_refund_amount_currency(
						estimatedRefundAmount.getCurrency());
				returnOrderList.setSeller_total_estimated_refund_amount_value(
						estimatedRefundAmount.getValue());
			}
			if(members.getSellerTotalRefund().getActualRefundAmount()!=null){
				ActualRefundAmount actualRefundAmount=members.getSellerTotalRefund().getActualRefundAmount();
				returnOrderList.setSeller_total_actual_refund_amount_currency(
						actualRefundAmount.getCurrency());
				returnOrderList.setSeller_total_actual_refund_amount_value(
						actualRefundAmount.getValue());
			}
		}
		if(members.getBuyerTotalRefund()!=null){
			BuyerTotalRefund buyerTotalRefund=members.getBuyerTotalRefund();
			if(buyerTotalRefund.getEstimatedRefundAmount()!=null){
				EstimatedRefundAmount estimatedRefundAmount=buyerTotalRefund.getEstimatedRefundAmount();
				returnOrderList.setBuyer_total_estimated_refund_amount_currency(
						estimatedRefundAmount.getCurrency());
				returnOrderList.setBuyer_total_estimated_refund_amount_value(
						estimatedRefundAmount.getValue());
			}
			if(buyerTotalRefund.getActualRefundAmount()!=null){
				ActualRefundAmount actualRefundAmount=buyerTotalRefund.getActualRefundAmount();
				returnOrderList.setBuyer_total_actual_refund_amount_value(
						actualRefundAmount.getValue());
				returnOrderList.setBuyer_total_refund_actual_refund_amount_currency(
						actualRefundAmount.getCurrency());
			}
		}
		if(members.getSellerResponseDue()!=null){
			returnOrderList.setSeller_response_due_activity_due(
					members.getSellerResponseDue().getActivityDue());
			returnOrderList.setSeller_response_due_respond_by_date_value(
					members.getSellerResponseDue().getRespondByDate().getValue());
		}
		if(members.getBuyerResponseDue()!=null){
			returnOrderList.setBuyer_response_due_activity_due(
					members.getBuyerResponseDue().getActivityDue());
			returnOrderList.setBuyer_response_due_respond_by_date_value(
					members.getBuyerResponseDue().getRespondByDate().getValue());
		}
		if(members.getEscalationInfo()!=null){
			EscalationInfo escalationInfo=members.getEscalationInfo();
			if(escalationInfo.getBuyerEscalationEligibilityInfo()!=null){
				BuyerEscalationEligibilityInfo buyerEscalationEligibilityInfo=
						escalationInfo.getBuyerEscalationEligibilityInfo();
				returnOrderList.setBuyer_escalation_eligibility_info_start_time(
						buyerEscalationEligibilityInfo.getStartTime());
				returnOrderList.setBuyer_escalation_eligibility_info_end_time(
						buyerEscalationEligibilityInfo.getEndTime());
				returnOrderList.setBuyer_escalation_eligibility_info_eligible(
						buyerEscalationEligibilityInfo.getEligible());
			}
			if(escalationInfo.getSellerEscalationEligibilityInfo()!=null){
				SellerEscalationEligibilityInfo sellerEscalationEligibilityInfo=
						escalationInfo.getSellerEscalationEligibilityInfo();
				returnOrderList.setSeller_escalation_eligibility_Info_start_time(
						sellerEscalationEligibilityInfo.getStartTime());
				returnOrderList.setSeller_escalation_eligibility_Info_end_time(
						sellerEscalationEligibilityInfo.getEndTime());
				returnOrderList.setSeller_escalation_eligibility_info_eligible(
						sellerEscalationEligibilityInfo.getEligible());
			}
		}
		if(members.getReturnPolicy()!=null){
			returnOrderList.setReturn_policy_multiple_return_address(
					members.getReturnPolicy().getMultipleReturnAddresses());
			returnOrderList.setReturn_policy_rmarequired(
					members.getReturnPolicy().getRmarequired());
		}
		if(members.getSellerAvailableOptions()!=null){
			returnOrderList.setSeller_available_options(
					mapper.writeValueAsString(members.getSellerAvailableOptions()));
		}
		if(members.getBuyerAvailableOptions()!=null){
			returnOrderList.setBuyer_available_options(
					mapper.writeValueAsString(members.getBuyerAvailableOptions()));
		}
		if(members.getFlags()!=null){
			returnOrderList.setFlags(mapper.writeValueAsString(members.getFlags()));
		}
		return returnOrderList;
	}
}
