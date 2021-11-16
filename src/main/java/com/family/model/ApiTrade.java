package com.family.model;

//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableId;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 作者: guo yao
 * 日期: 2021年08月23日
 * 时间: 下午0:05
 */
@Data
public class ApiTrade {

//    @TableId(value = "rec_id", type = IdType.AUTO)
    @SerializedName("rec_id")
    private Long recId;
    @SerializedName("platform_id")
    private Integer platformId;
    @SerializedName("shop_id")
    private Integer shopId;
    @SerializedName("tid")
    private String tid;
    @SerializedName("process_status")
    private Integer processStatus;
    @SerializedName("trade_status")
    private Integer tradeStatus;
    @SerializedName("guarantee_mode")
    private Integer guaranteeMode;
    @SerializedName("pay_status")
    private Integer payStatus;
    @SerializedName("delivery_term")
    private Integer deliveryTerm;
    @SerializedName("pay_method")
    private Integer payMethod;
    @SerializedName("refund_status")
    private Integer refundStatus;
    @SerializedName("is_new")
    private Integer isNew;
    @SerializedName("bad_reason")
    private Integer badReason;
    @SerializedName("modify_flag")
    private Integer modifyFlag;
    @SerializedName("fenxiao_type")
    private Integer fenxiaoType;
    @SerializedName("purchase_id")
    private String purchaseId;
    @SerializedName("fenxiao_nick")
    private String fenxiaoNick;
    @SerializedName("order_count")
    private Integer orderCount;
    @SerializedName("goods_count")
    private BigDecimal goodsCount;
    @SerializedName("trade_time")
    private String tradeTime;
    @SerializedName("pay_time")
    private String payTime;
    @SerializedName("end_time")
    private String endTime;
    @SerializedName("buyer_message")
    private String buyerMessage;
    @SerializedName("remark")
    private String remark;
    @SerializedName("remark_flag")
    private Integer remarkFlag;
    @SerializedName("buyer_nick")
    private String buyerNick;
    @SerializedName("buyer_name")
    private String buyerName;
    @SerializedName("buyer_email")
    private String buyerEmail;
    @SerializedName("buyer_area")
    private String buyerArea;
    @SerializedName("id_card_type")
    private Integer idCardType;
    @SerializedName("id_card")
    private String idCard;
    @SerializedName("pay_id")
    private String payId;
    @SerializedName("pay_account")
    private String payAccount;
    @SerializedName("receiver_name")
    private String receiverName;
    @SerializedName("receiver_country")
    private String receiverCountry;
    @SerializedName("receiver_province")
    private Integer receiverProvince;
    @SerializedName("receiver_city")
    private Integer receiverCity;
    @SerializedName("receiver_district")
    private Integer receiverDistrict;
    @SerializedName("receiver_address")
    private String receiverAddress;
    @SerializedName("receiver_mobile")
    private String receiverMobile;
    @SerializedName("receiver_telno")
    private String receiverTelno;
    @SerializedName("receiver_zip")
    private String receiverZip;
    @SerializedName("receiver_area")
    private String receiverArea;
    @SerializedName("receiver_ring")
    private String receiverRing;
    @SerializedName("to_deliver_time")
    private String toDeliverTime;
    @SerializedName("pre_charge_time")
    private String preChargeTime;
    @SerializedName("currency")
    private String currency;
    @SerializedName("is_prev_notify")
    private Integer isPrevNotify;
    @SerializedName("receiver_hash")
    private String receiverHash;
    @SerializedName("goods_amount")
    private BigDecimal goodsAmount;
    @SerializedName("post_amount")
    private BigDecimal postAmount;
    @SerializedName("other_amount")
    private BigDecimal otherAmount;
    @SerializedName("discount")
    private BigDecimal discount;
    @SerializedName("receivable")
    private BigDecimal receivable;
    @SerializedName("paid")
    private BigDecimal paid;
    @SerializedName("credit_card_paid")
    private BigDecimal creditCardPaid;
    @SerializedName("platform_cost")
    private BigDecimal platformCost;
    @SerializedName("received")
    private BigDecimal received;
    @SerializedName("trade_prepay")
    private BigDecimal tradePrepay;
    @SerializedName("dap_amount")
    private BigDecimal dapAmount;
    @SerializedName("cod_amount")
    private BigDecimal codAmount;
    @SerializedName("pi_amount")
    private BigDecimal piAmount;
    @SerializedName("ext_cod_fee")
    private BigDecimal extCodFee;
    @SerializedName("refund_amount")
    private BigDecimal refundAmount;
    @SerializedName("commission")
    private BigDecimal commission;
    @SerializedName("logistics_type")
    private Integer logisticsType;
    @SerializedName("logistics_no")
    private String logisticsNo;
    @SerializedName("invoice_type")
    private Integer invoiceType;
    @SerializedName("invoice_title")
    private String invoiceTitle;
    @SerializedName("invoice_content")
    private String invoiceContent;
    @SerializedName("trade_from")
    private Integer tradeFrom;
    @SerializedName("trade_mask")
    private Integer tradeMask;
    @SerializedName("wms_type")
    private Integer wmsType;
    @SerializedName("warehouse_no")
    private String warehouseNo;
    @SerializedName("stockout_no")
    private String stockoutNo;
    @SerializedName("is_auto_wms")
    private Integer isAutoWms;
    @SerializedName("arrive_interval")
    private Integer arriveInterval;
    @SerializedName("consign_interval")
    private Integer consignInterval;
    @SerializedName("arrive_cut_time")
    private String arriveCutTime;
    @SerializedName("score")
    private String score;
    @SerializedName("real_score")
    private Integer realScore;
    @SerializedName("got_score")
    private Integer gotScore;
    @SerializedName("is_sealed")
    private Integer isSealed;
    @SerializedName("cust_data")
    private String custData;
    @SerializedName("x_salesman_id")
    private Integer xSalesmanId;
    @SerializedName("deliver_trade_id")
    private Integer deliverTradeId;
    @SerializedName("is_preorder")
    private Integer isPreorder;
    @SerializedName("x_customer_id")
    private Integer xCustomerId;
    @SerializedName("x_logistics_id")
    private Integer xLogisticsId;
    @SerializedName("x_trade_flag")
    private Integer xTradeFlag;
    @SerializedName("x_is_freezed")
    private Integer xIsFreezed;
    @SerializedName("x_warehouse_id")
    private Integer xWarehouseId;
    @SerializedName("is_external")
    private Integer isExternal;
    @SerializedName("reserve_field1")
    private Integer reserveField1;
    @SerializedName("oaid_md5")
    private String oaidMd5;
    @SerializedName("modified")
    private String modified;
    @SerializedName("created")
    private String created;
}
