package cheap.thrills.models;

import java.io.Serializable;

public class Order implements Serializable {
    private String ticketId = "";
    private String Gid = "";
    private String loginId="";
    private String type = "";
    private String isdisabled = "";
    private String count = "";
    private String Name = "";
    private String set_link = "";
    private String Ticket_type = "";
    private String mobile = "";
    private String customer_id = "";
    private String orderId = "";
    private String customer = "";
    private String Tdate = "";
    private String price = "";
    private String adults = "";
    private String kids = "";
    private String total = "";
    private String is_expire = "";
    private String QrCode = "";
    private String ticketOrder = "";
    private boolean iSclicked = false;




    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getIsdisabled() {
        return isdisabled;
    }

    public void setIsdisabled(String isdisabled) {
        this.isdisabled = isdisabled;
    }

    public boolean isiSclicked() {
        return iSclicked;
    }

    public void setiSclicked(boolean iSclicked) {
        this.iSclicked = iSclicked;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getGid() {
        return Gid;
    }

    public void setGid(String gid) {
        Gid = gid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public String getSet_link() {
        return set_link;
    }

    public void setSet_link(String set_link) {
        this.set_link = set_link;
    }

    public String getTicket_type() {
        return Ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        Ticket_type = ticket_type;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTicketOrder() {
        return ticketOrder;
    }

    public void setTicketOrder(String ticketOrder) {
        this.ticketOrder = ticketOrder;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTdate() {
        return Tdate;
    }

    public void setTdate(String tdate) {
        Tdate = tdate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getKids() {
        return kids;
    }

    public void setKids(String kids) {
        this.kids = kids;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIs_expire() {
        return is_expire;
    }

    public void setIs_expire(String is_expire) {
        this.is_expire = is_expire;
    }

    public String getQrCode() {
        return QrCode;
    }

    public void setQrCode(String qrCode) {
        QrCode = qrCode;
    }
}
