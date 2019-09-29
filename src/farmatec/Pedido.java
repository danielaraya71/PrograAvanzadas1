/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmatec;

/**
 *
 * @author Ericka
 */
public class Pedido {
    private int idPharmacy;
    private int IDOrder;
    private String OrderDate;
    private int IdClient;
    private int StatusOrder;
    private int OrderType;
    private String OrderDetail;

    public int getIdPharmacy() {
        return idPharmacy;
    }

    public void setIdPharmacy(int idPharmacy) {
        this.idPharmacy = idPharmacy;
    }

    public int getIDOrder() {
        return IDOrder;
    }

    public void setIDOrder(int IDOrder) {
        this.IDOrder = IDOrder;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int IdClient) {
        this.IdClient = IdClient;
    }

    public int getStatusOrder() {
        return StatusOrder;
    }

    public void setStatusOrder(int StatusOrder) {
        this.StatusOrder = StatusOrder;
    }

    public int getOrderType() {
        return OrderType;
    }

    public void setOrderType(int OrderType) {
        this.OrderType = OrderType;
    }

    public String getOrderDetail() {
        return OrderDetail;
    }

    public void setOrderDetail(String OrderDetail) {
        this.OrderDetail = OrderDetail;
    }
}
