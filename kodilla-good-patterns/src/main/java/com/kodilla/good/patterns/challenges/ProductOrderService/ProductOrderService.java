package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ProductOrderService {
    private Mail mailService;
    private Payment paymentService;

    public ProductOrderService(Mail mailService, Payment paymentService) {
        this.mailService = mailService;
        this.paymentService = paymentService;
    }

    public OrderDto processOrder(OrderRequest orderRequest) {
        boolean isPayed = paymentService.processPayment(orderRequest.getOrder());
        if(isPayed) {
            mailService.sendProduct(orderRequest.getOrder());
            return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(),true,true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(),false,false);
        }
    }
}
