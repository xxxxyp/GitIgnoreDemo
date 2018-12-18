package service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import entity.returndetails.ActualRefund;
import entity.returndetails.ActualRefundDetail;
import entity.returndetails.Address;
import entity.returndetails.BuyerAddress;
import entity.returndetails.CloseInfo;
import entity.returndetails.DestinationAddress;
import entity.returndetails.Detail;
import entity.returndetails.EstimatedRefundDetail;
import entity.returndetails.HoldInfo;
import entity.returndetails.ItemDetail;
import entity.returndetails.OriginAddress;
import entity.returndetails.RefundInfo;
import entity.returndetails.ReturnDetails;
import entity.returndetails.ReturnOrderDetail;
import entity.returndetails.ReturnShipmentInfo;
import entity.returndetails.SellerAddress;
import entity.returndetails.ShipmentTracking;
import entity.returndetails.ShippingLabelCost;

public class SavaReturnDetails {
	public ReturnOrderDetail handleReturnDetails(ReturnDetails returnDetails,Integer user_id,Integer shop_id) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		ReturnOrderDetail returnOrderDetail=new ReturnOrderDetail();
		returnOrderDetail.setReturn_id(
				returnDetails.getSummary().getReturnId());
		returnOrderDetail.setUser_id(
				user_id);
		returnOrderDetail.setShop_id(
				shop_id);
		if(returnDetails.getDetail()!=null){
			Detail detail=returnDetails.getDetail();
		
			returnOrderDetail.setMarket_place_id(
					detail.getMarketplaceId());
			if(detail.getItemDetail()!=null){
				ItemDetail itemDetail=detail.getItemDetail();
				returnOrderDetail.setItem_id(
						itemDetail.getItemId());
				returnOrderDetail.setTransaction_id(
						itemDetail.getTransactionId());
				returnOrderDetail.setItem_listing_site_id(
						itemDetail.getListingSiteId());
				returnOrderDetail.setItem_return_quantity(
						itemDetail.getReturnQuantity());
				returnOrderDetail.setItem_title(
						itemDetail.getItemTitle());
				returnOrderDetail.setItem_pic_url(
						itemDetail.getItemPicUrl());
				returnOrderDetail.setItem_transaction_date_value(
						itemDetail.getTransactionDate().getValue());
				returnOrderDetail.setItem_price_currency(
						itemDetail.getItemPrice().getCurrency());
				returnOrderDetail.setItem_price_value(
						itemDetail.getItemPrice().getValue());
				returnOrderDetail.setItem_ebay_plus_txn(
						itemDetail.getEbayPlusTxn());
			}		
			returnOrderDetail.setBuyer_login_name(
					detail.getBuyerLoginName());
			returnOrderDetail.setSeller_login_name(
					detail.getSellerLoginName());
			returnOrderDetail.setBuyer_email_address(
					detail.getBuyerEmailAddress());
			returnOrderDetail.setSeller_email_address(
					detail.getSellerEmailAddress());
			returnOrderDetail.setCheck_out_type(
					detail.getCheckoutType());
			returnOrderDetail.setResponse_history(
					mapper.writeValueAsString(detail.getResponseHistory()));
			if(detail.getRefundInfo()!=null){
				RefundInfo refundInfo=detail.getRefundInfo();
				if(refundInfo.getEstimatedRefundDetail()!=null){
					EstimatedRefundDetail estimatedRefundDetail=refundInfo.getEstimatedRefundDetail();
					returnOrderDetail.setItemized_refund_details(
							mapper.writeValueAsString(estimatedRefundDetail.getItemizedRefundDetails()));
					returnOrderDetail.setIs_rtn_shipping_editable(
							estimatedRefundDetail.getIsRtnShippingEditable());
				}
				if(refundInfo.getActualRefundDetail()!=null){
					ActualRefundDetail actualRefundDetail=refundInfo.getActualRefundDetail();
					if(actualRefundDetail.getActualRefund()!=null){
						ActualRefund actualRefund=actualRefundDetail.getActualRefund();
						if(actualRefund.getTotalAmount()!=null){
							returnOrderDetail.setActual_refund_detail_total_amount_value(
									actualRefund.getTotalAmount().getValue());
							returnOrderDetail.setActual_refund_detail_total_amount_currency(
									actualRefund.getTotalAmount().getCurrency());
						}
						returnOrderDetail.setItemized_refund_detail(
								mapper.writeValueAsString(actualRefund.getItemizedRefundDetail()));
					}
					returnOrderDetail.setRefund_status(
							actualRefundDetail.getRefundStatus());
					returnOrderDetail.setRefund_issued_date_value(
							actualRefundDetail.getRefundIssuedDate().getValue());
				}	
			}
			if(detail.getHoldInfo()!=null){
				HoldInfo holdInfo=detail.getHoldInfo();
				returnOrderDetail.setHold_creation_date_value(
						holdInfo.getHoldCreationDate().getValue());
				returnOrderDetail.setHold_release_date_value(
						holdInfo.getHoldReleaseDate().getValue());
				returnOrderDetail.setHold_status(
						holdInfo.getHoldStatus());
				returnOrderDetail.setHold_reference_id(
						holdInfo.getHoldReferenceId());
				returnOrderDetail.setHold_transaction_id(
						holdInfo.getHoldTransactionId());
			}
			returnOrderDetail.setMoney_movement_info(
					mapper.writeValueAsString(detail.getMoneyMovementInfo()));
			if(detail.getBuyerAddress()!=null){
				BuyerAddress buyerAddress=detail.getBuyerAddress();
				returnOrderDetail.setBuyer_address_name(
						buyerAddress.getName());
				if(buyerAddress.getAddress() != null){
					Address address=buyerAddress.getAddress();
					returnOrderDetail.setBuyer_address_country(
							address.getCountry());
					returnOrderDetail.setBuyer_address_postal_code(
							address.getPostalCode());
					returnOrderDetail.setBuyer_address_state_or_province(
							address.getStateOrProvince());
					returnOrderDetail.setBuyer_address_city(
							address.getCity());
					returnOrderDetail.setBuyer_address_address_line1(
							address.getAddressLine1());
					returnOrderDetail.setBuyer_address_address_line2(
							address.getAddressLine2());
				}
			}
			if(detail.getSellerAddress()!=null){
				SellerAddress sellerAddress=detail.getSellerAddress();
				returnOrderDetail.setSeller_address_name(
						sellerAddress.getName());
				if(sellerAddress.getAddress()!=null){
					Address address=sellerAddress.getAddress();
					returnOrderDetail.setSeller_address_country(
							address.getCountry());
					returnOrderDetail.setSeller_address_postal_code(
							address.getPostalCode());
					returnOrderDetail.setSeller_address_state_or_province(
							address.getStateOrProvince());
					returnOrderDetail.setSeller_address_city(
							address.getCity());
					returnOrderDetail.setSeller_address_address_line1(
							address.getAddressLine1());
					returnOrderDetail.setSeller_address_address_line2(
							address.getAddressLine2());
				}
			}
			if(detail.getReturnShipmentInfo()!=null){
				ReturnShipmentInfo returnShipmentInfo=detail.getReturnShipmentInfo();
				if(returnShipmentInfo.getShipmentTracking()!=null){
					ShipmentTracking shipmentTracking=returnShipmentInfo.getShipmentTracking();
					returnOrderDetail.setReturn_shipment_info_shipping_method(
							shipmentTracking.getShippingMethod());
					returnOrderDetail.setReturn_shipment_shipped_by(
							shipmentTracking.getShippedBy());
					returnOrderDetail.setReturn_shipment_carrier_id(
							shipmentTracking.getCarrierId());
					returnOrderDetail.setReturn_shipment_carrier_enum(
							shipmentTracking.getCarrierEnum());
					returnOrderDetail.setReturn_shipment_carrier_name(
							shipmentTracking.getCarrierName());
					returnOrderDetail.setReturn_shipment_carrier_used(
							shipmentTracking.getCarrierUsed());
					returnOrderDetail.setReturn_shipment_delivery_status(
							shipmentTracking.getDeliveryStatus());
					returnOrderDetail.setReturn_shipment_mark_as_received(
							shipmentTracking.getMarkAsReceived());
					returnOrderDetail.setReturn_shipment_active(
							shipmentTracking.getActive());
					returnOrderDetail.setReturn_shipment_label_print_expired(
							shipmentTracking.getLabelPrintExpired());
					returnOrderDetail.setReturn_shipment_label_void_expired(
							shipmentTracking.getLabelVoidExpired());
					if(shipmentTracking.getDestinationAddress()!=null){
						DestinationAddress DestinationAddress=shipmentTracking.getDestinationAddress();
						returnOrderDetail.setReturn_shipment_destination_address_name(
								DestinationAddress.getName());
						if(DestinationAddress.getAddress()!=null){
							Address address=DestinationAddress.getAddress();
							returnOrderDetail.setReturn_shipment_destination_address_country(
									address.getCountry());
							returnOrderDetail.setReturn_shipment_destination_address_postal_code(
									address.getPostalCode());
							returnOrderDetail.setReturn_shipment_destination_address_city(
									address.getCity());
							returnOrderDetail.setReturn_shipment_destination_address__line1(
									address.getAddressLine1());
							returnOrderDetail.setReturn_shipment_destination_address__line2(
									address.getAddressLine2());
							returnOrderDetail.setReturn_shipment_destination_address_state_or_province(
									address.getStateOrProvince());
						}
					}
					if(shipmentTracking.getOriginAddress()!=null){
						OriginAddress originAddress=shipmentTracking.getOriginAddress();
						returnOrderDetail.setReturn_shipment_origin_address_name(
								originAddress.getName());
						if(originAddress.getAddress()!=null){
							Address address=originAddress.getAddress();
						returnOrderDetail.setReturn_shipment_origin_address_country(
								address.getCountry());
						returnOrderDetail.setReturn_shipment_origin_address_postal_code(
								address.getPostalCode());
						returnOrderDetail.setReturn_shipment_origin_address_state_or_province(
								address.getStateOrProvince());
						returnOrderDetail.setReturn_shipment_origin_address_city(
								address.getCity());
						returnOrderDetail.setReturn_shipment_origin_address_line1(
								address.getAddressLine1());
						returnOrderDetail.setReturn_shipment_origin_address_line2(
								address.getAddressLine2());
						}
					}
				}
				if(returnShipmentInfo.getShippingLabelCost()!=null){
					ShippingLabelCost shippingLabelCost=returnShipmentInfo.getShippingLabelCost();
					
					returnOrderDetail.setShipping_label_cost_total_amount_value(
							shippingLabelCost.getTotalAmount().getValue());
					returnOrderDetail.setShipping_label_cost_total_amount_currency(
							shippingLabelCost.getTotalAmount().getCurrency());
					
					returnOrderDetail.setItemized_return_shipping_cost(
							mapper.writeValueAsString(shippingLabelCost.getItemizedReturnShippingCost()));				
				}
				returnOrderDetail.setPayee(
						returnShipmentInfo.getPayee());
				returnOrderDetail.setAll_shipment_trackings(
						mapper.writeValueAsString(returnShipmentInfo.getAllShipmentTrackings()));
			}		
			if(detail.getCloseInfo()!=null){
				CloseInfo closeInfo=detail.getCloseInfo();
				returnOrderDetail.setReturn_close_reason(
						closeInfo.getReturnCloseReason());
				returnOrderDetail.setBuyer_close_reason(
						closeInfo.getBuyerCloseReason());
			}
		}
		return returnOrderDetail;
	}
}
