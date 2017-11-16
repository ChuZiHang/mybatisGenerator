package com.dongsport.common.model.ds2;

import java.io.Serializable;
import java.util.Date;

public class OrderInfo implements Serializable {
    private Long orderId;

    private Integer orderType;

    private Integer isSplit;

    private Long productId;

    private Integer productType;

    private Integer productNum;

    private Double orderMoney;

    private Date orderDate;

    private Long custId;

    private Long orderCustId;

    private Date travelDate;

    private Integer getType;

    private Double getPrice;

    private Integer state;

    private Integer refundSet;

    private Date cancelDate;

    private Date confirmDate;

    private Integer isOnlinepay;

    private String payId;

    private String linkMan;

    private String linkPhone;

    private String linkAddress;

    private String linkCode;

    private String linkEmail;

    private Integer linkCreditType;

    private String linkCreditNo;

    private Double payMoney;

    private Integer isConfirm;

    private String userId;

    private String confirmUser;

    private String cancelUser;

    private Integer payType;

    private Date finishDate;

    private Integer finishNum;

    private Double finishMoney;

    private Date payDate;

    private String payUser;

    private String finishUser;

    private Integer isSend;

    private String sendContent;

    private Date sendDate;

    private String sendUser;

    private Double cancelMoney;

    private Integer isEdit;

    private Integer isCancel;

    private Date sendmsgDate;

    private Integer ticketType;

    private String interfaceOrderId;

    private String interfaceId;

    private Integer interfaceEditState;

    private String orderPassword;

    private Integer isSingle;

    private Long parentCustId;

    private String interfaceProdId;

    private Integer sendMsgId;

    private Double memPayMoney;

    private Double memOrderMoney;

    private Double oldMemOrderMoney;

    private Double payServiceFee;

    private Integer accountType;

    private String orderCode;

    private Integer isPackage;

    private Date endTravelDate;

    private Long cancelCustId;

    private Integer cancelState;

    private Date printDate;

    private String printUser;

    private String printExcode;

    private String sendContent1;

    private String sendContent2;

    private Integer isPrint;

    private String printExcode2;

    private Double accountMoney;

    private Date accountDate;

    private String accountUserId;

    private String prodDetail;

    private Double agentReturnMoney;

    private Date agentReturnDate;

    private String agentReturnUserId;

    private String orderMemo;

    private String orderFiles;

    private Integer isSend2;

    private Date needSendmsgDate;

    private Integer mergeOrderId;

    private Integer orderSource;

    private Integer payMinute;

    private String sendmsgUser;

    private Integer accountCurrencyType;

    private Double accountExchangeRate;

    private Double accountMoney2;

    private Integer areaId;

    private String settleType;

    private Integer isStock;

    private Integer fromAreaId;

    private Integer isAutofinish;

    private String priceCodex;

    private String orderSourceId;

    private Integer cancelNum;

    private String memberId;

    private Double cashCouponMoney;

    private Integer cashCouponStatus;

    private Long cashCouponNo;

    private Date cashCouponDate;

    private Double memCancelMoney;

    private Double orderVenueFee;

    private Integer isChange;

    private Integer editCustId;

    private Integer isLock;

    private Integer inferfaceCheckState;

    private Double memPointMoney;

    private Double allPayFee;

    private String custMemo;

    private String accountInnerMemo;

    private String innerMemo;

    private String adjust;

    private Integer changeState;

    private String applyUserId;

    private Double returnCustomMoney;

    private String interfaceCustId;

    private String custSmsContent;

    private Integer confirmMinute;

    private Long venueId;

    private Long siteId;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(Integer isSplit) {
        this.isSplit = isSplit;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getOrderCustId() {
        return orderCustId;
    }

    public void setOrderCustId(Long orderCustId) {
        this.orderCustId = orderCustId;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    public Double getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(Double getPrice) {
        this.getPrice = getPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRefundSet() {
        return refundSet;
    }

    public void setRefundSet(Integer refundSet) {
        this.refundSet = refundSet;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Integer getIsOnlinepay() {
        return isOnlinepay;
    }

    public void setIsOnlinepay(Integer isOnlinepay) {
        this.isOnlinepay = isOnlinepay;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }

    public Integer getLinkCreditType() {
        return linkCreditType;
    }

    public void setLinkCreditType(Integer linkCreditType) {
        this.linkCreditType = linkCreditType;
    }

    public String getLinkCreditNo() {
        return linkCreditNo;
    }

    public void setLinkCreditNo(String linkCreditNo) {
        this.linkCreditNo = linkCreditNo;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Integer isConfirm) {
        this.isConfirm = isConfirm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConfirmUser() {
        return confirmUser;
    }

    public void setConfirmUser(String confirmUser) {
        this.confirmUser = confirmUser;
    }

    public String getCancelUser() {
        return cancelUser;
    }

    public void setCancelUser(String cancelUser) {
        this.cancelUser = cancelUser;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Integer getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Integer finishNum) {
        this.finishNum = finishNum;
    }

    public Double getFinishMoney() {
        return finishMoney;
    }

    public void setFinishMoney(Double finishMoney) {
        this.finishMoney = finishMoney;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getPayUser() {
        return payUser;
    }

    public void setPayUser(String payUser) {
        this.payUser = payUser;
    }

    public String getFinishUser() {
        return finishUser;
    }

    public void setFinishUser(String finishUser) {
        this.finishUser = finishUser;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendUser() {
        return sendUser;
    }

    public void setSendUser(String sendUser) {
        this.sendUser = sendUser;
    }

    public Double getCancelMoney() {
        return cancelMoney;
    }

    public void setCancelMoney(Double cancelMoney) {
        this.cancelMoney = cancelMoney;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }

    public Integer getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(Integer isCancel) {
        this.isCancel = isCancel;
    }

    public Date getSendmsgDate() {
        return sendmsgDate;
    }

    public void setSendmsgDate(Date sendmsgDate) {
        this.sendmsgDate = sendmsgDate;
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public String getInterfaceOrderId() {
        return interfaceOrderId;
    }

    public void setInterfaceOrderId(String interfaceOrderId) {
        this.interfaceOrderId = interfaceOrderId;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Integer getInterfaceEditState() {
        return interfaceEditState;
    }

    public void setInterfaceEditState(Integer interfaceEditState) {
        this.interfaceEditState = interfaceEditState;
    }

    public String getOrderPassword() {
        return orderPassword;
    }

    public void setOrderPassword(String orderPassword) {
        this.orderPassword = orderPassword;
    }

    public Integer getIsSingle() {
        return isSingle;
    }

    public void setIsSingle(Integer isSingle) {
        this.isSingle = isSingle;
    }

    public Long getParentCustId() {
        return parentCustId;
    }

    public void setParentCustId(Long parentCustId) {
        this.parentCustId = parentCustId;
    }

    public String getInterfaceProdId() {
        return interfaceProdId;
    }

    public void setInterfaceProdId(String interfaceProdId) {
        this.interfaceProdId = interfaceProdId;
    }

    public Integer getSendMsgId() {
        return sendMsgId;
    }

    public void setSendMsgId(Integer sendMsgId) {
        this.sendMsgId = sendMsgId;
    }

    public Double getMemPayMoney() {
        return memPayMoney;
    }

    public void setMemPayMoney(Double memPayMoney) {
        this.memPayMoney = memPayMoney;
    }

    public Double getMemOrderMoney() {
        return memOrderMoney;
    }

    public void setMemOrderMoney(Double memOrderMoney) {
        this.memOrderMoney = memOrderMoney;
    }

    public Double getOldMemOrderMoney() {
        return oldMemOrderMoney;
    }

    public void setOldMemOrderMoney(Double oldMemOrderMoney) {
        this.oldMemOrderMoney = oldMemOrderMoney;
    }

    public Double getPayServiceFee() {
        return payServiceFee;
    }

    public void setPayServiceFee(Double payServiceFee) {
        this.payServiceFee = payServiceFee;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Integer isPackage) {
        this.isPackage = isPackage;
    }

    public Date getEndTravelDate() {
        return endTravelDate;
    }

    public void setEndTravelDate(Date endTravelDate) {
        this.endTravelDate = endTravelDate;
    }

    public Long getCancelCustId() {
        return cancelCustId;
    }

    public void setCancelCustId(Long cancelCustId) {
        this.cancelCustId = cancelCustId;
    }

    public Integer getCancelState() {
        return cancelState;
    }

    public void setCancelState(Integer cancelState) {
        this.cancelState = cancelState;
    }

    public Date getPrintDate() {
        return printDate;
    }

    public void setPrintDate(Date printDate) {
        this.printDate = printDate;
    }

    public String getPrintUser() {
        return printUser;
    }

    public void setPrintUser(String printUser) {
        this.printUser = printUser;
    }

    public String getPrintExcode() {
        return printExcode;
    }

    public void setPrintExcode(String printExcode) {
        this.printExcode = printExcode;
    }

    public String getSendContent1() {
        return sendContent1;
    }

    public void setSendContent1(String sendContent1) {
        this.sendContent1 = sendContent1;
    }

    public String getSendContent2() {
        return sendContent2;
    }

    public void setSendContent2(String sendContent2) {
        this.sendContent2 = sendContent2;
    }

    public Integer getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(Integer isPrint) {
        this.isPrint = isPrint;
    }

    public String getPrintExcode2() {
        return printExcode2;
    }

    public void setPrintExcode2(String printExcode2) {
        this.printExcode2 = printExcode2;
    }

    public Double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getAccountUserId() {
        return accountUserId;
    }

    public void setAccountUserId(String accountUserId) {
        this.accountUserId = accountUserId;
    }

    public String getProdDetail() {
        return prodDetail;
    }

    public void setProdDetail(String prodDetail) {
        this.prodDetail = prodDetail;
    }

    public Double getAgentReturnMoney() {
        return agentReturnMoney;
    }

    public void setAgentReturnMoney(Double agentReturnMoney) {
        this.agentReturnMoney = agentReturnMoney;
    }

    public Date getAgentReturnDate() {
        return agentReturnDate;
    }

    public void setAgentReturnDate(Date agentReturnDate) {
        this.agentReturnDate = agentReturnDate;
    }

    public String getAgentReturnUserId() {
        return agentReturnUserId;
    }

    public void setAgentReturnUserId(String agentReturnUserId) {
        this.agentReturnUserId = agentReturnUserId;
    }

    public String getOrderMemo() {
        return orderMemo;
    }

    public void setOrderMemo(String orderMemo) {
        this.orderMemo = orderMemo;
    }

    public String getOrderFiles() {
        return orderFiles;
    }

    public void setOrderFiles(String orderFiles) {
        this.orderFiles = orderFiles;
    }

    public Integer getIsSend2() {
        return isSend2;
    }

    public void setIsSend2(Integer isSend2) {
        this.isSend2 = isSend2;
    }

    public Date getNeedSendmsgDate() {
        return needSendmsgDate;
    }

    public void setNeedSendmsgDate(Date needSendmsgDate) {
        this.needSendmsgDate = needSendmsgDate;
    }

    public Integer getMergeOrderId() {
        return mergeOrderId;
    }

    public void setMergeOrderId(Integer mergeOrderId) {
        this.mergeOrderId = mergeOrderId;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getPayMinute() {
        return payMinute;
    }

    public void setPayMinute(Integer payMinute) {
        this.payMinute = payMinute;
    }

    public String getSendmsgUser() {
        return sendmsgUser;
    }

    public void setSendmsgUser(String sendmsgUser) {
        this.sendmsgUser = sendmsgUser;
    }

    public Integer getAccountCurrencyType() {
        return accountCurrencyType;
    }

    public void setAccountCurrencyType(Integer accountCurrencyType) {
        this.accountCurrencyType = accountCurrencyType;
    }

    public Double getAccountExchangeRate() {
        return accountExchangeRate;
    }

    public void setAccountExchangeRate(Double accountExchangeRate) {
        this.accountExchangeRate = accountExchangeRate;
    }

    public Double getAccountMoney2() {
        return accountMoney2;
    }

    public void setAccountMoney2(Double accountMoney2) {
        this.accountMoney2 = accountMoney2;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public Integer getIsStock() {
        return isStock;
    }

    public void setIsStock(Integer isStock) {
        this.isStock = isStock;
    }

    public Integer getFromAreaId() {
        return fromAreaId;
    }

    public void setFromAreaId(Integer fromAreaId) {
        this.fromAreaId = fromAreaId;
    }

    public Integer getIsAutofinish() {
        return isAutofinish;
    }

    public void setIsAutofinish(Integer isAutofinish) {
        this.isAutofinish = isAutofinish;
    }

    public String getPriceCodex() {
        return priceCodex;
    }

    public void setPriceCodex(String priceCodex) {
        this.priceCodex = priceCodex;
    }

    public String getOrderSourceId() {
        return orderSourceId;
    }

    public void setOrderSourceId(String orderSourceId) {
        this.orderSourceId = orderSourceId;
    }

    public Integer getCancelNum() {
        return cancelNum;
    }

    public void setCancelNum(Integer cancelNum) {
        this.cancelNum = cancelNum;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Double getCashCouponMoney() {
        return cashCouponMoney;
    }

    public void setCashCouponMoney(Double cashCouponMoney) {
        this.cashCouponMoney = cashCouponMoney;
    }

    public Integer getCashCouponStatus() {
        return cashCouponStatus;
    }

    public void setCashCouponStatus(Integer cashCouponStatus) {
        this.cashCouponStatus = cashCouponStatus;
    }

    public Long getCashCouponNo() {
        return cashCouponNo;
    }

    public void setCashCouponNo(Long cashCouponNo) {
        this.cashCouponNo = cashCouponNo;
    }

    public Date getCashCouponDate() {
        return cashCouponDate;
    }

    public void setCashCouponDate(Date cashCouponDate) {
        this.cashCouponDate = cashCouponDate;
    }

    public Double getMemCancelMoney() {
        return memCancelMoney;
    }

    public void setMemCancelMoney(Double memCancelMoney) {
        this.memCancelMoney = memCancelMoney;
    }

    public Double getOrderVenueFee() {
        return orderVenueFee;
    }

    public void setOrderVenueFee(Double orderVenueFee) {
        this.orderVenueFee = orderVenueFee;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Integer getEditCustId() {
        return editCustId;
    }

    public void setEditCustId(Integer editCustId) {
        this.editCustId = editCustId;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public Integer getInferfaceCheckState() {
        return inferfaceCheckState;
    }

    public void setInferfaceCheckState(Integer inferfaceCheckState) {
        this.inferfaceCheckState = inferfaceCheckState;
    }

    public Double getMemPointMoney() {
        return memPointMoney;
    }

    public void setMemPointMoney(Double memPointMoney) {
        this.memPointMoney = memPointMoney;
    }

    public Double getAllPayFee() {
        return allPayFee;
    }

    public void setAllPayFee(Double allPayFee) {
        this.allPayFee = allPayFee;
    }

    public String getCustMemo() {
        return custMemo;
    }

    public void setCustMemo(String custMemo) {
        this.custMemo = custMemo;
    }

    public String getAccountInnerMemo() {
        return accountInnerMemo;
    }

    public void setAccountInnerMemo(String accountInnerMemo) {
        this.accountInnerMemo = accountInnerMemo;
    }

    public String getInnerMemo() {
        return innerMemo;
    }

    public void setInnerMemo(String innerMemo) {
        this.innerMemo = innerMemo;
    }

    public String getAdjust() {
        return adjust;
    }

    public void setAdjust(String adjust) {
        this.adjust = adjust;
    }

    public Integer getChangeState() {
        return changeState;
    }

    public void setChangeState(Integer changeState) {
        this.changeState = changeState;
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public Double getReturnCustomMoney() {
        return returnCustomMoney;
    }

    public void setReturnCustomMoney(Double returnCustomMoney) {
        this.returnCustomMoney = returnCustomMoney;
    }

    public String getInterfaceCustId() {
        return interfaceCustId;
    }

    public void setInterfaceCustId(String interfaceCustId) {
        this.interfaceCustId = interfaceCustId;
    }

    public String getCustSmsContent() {
        return custSmsContent;
    }

    public void setCustSmsContent(String custSmsContent) {
        this.custSmsContent = custSmsContent;
    }

    public Integer getConfirmMinute() {
        return confirmMinute;
    }

    public void setConfirmMinute(Integer confirmMinute) {
        this.confirmMinute = confirmMinute;
    }

    public Long getVenueId() {
        return venueId;
    }

    public void setVenueId(Long venueId) {
        this.venueId = venueId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }
}