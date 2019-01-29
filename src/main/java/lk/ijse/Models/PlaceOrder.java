package lk.ijse.Models;

import org.springframework.data.domain.jaxb.SpringDataJaxb;

import java.util.List;

public class PlaceOrder {

    private Item item;
    private SpringDataJaxb.OrderDto orderDto;
    private List<OrderDetails> orderDetails;

    public PlaceOrder(){

    }

    public PlaceOrder(Item item, SpringDataJaxb.OrderDto orderDto, List<OrderDetails> orderDetails) {
        this.item = item;
        this.orderDto = orderDto;
        this.orderDetails = orderDetails;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public SpringDataJaxb.OrderDto getOrderDto() {
        return orderDto;
    }

    public void setOrderDto(SpringDataJaxb.OrderDto orderDto) {
        this.orderDto = orderDto;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "item=" + item +
                ", orderDto=" + orderDto +
                ", orderDetails=" + orderDetails +
                '}';
    }
}

