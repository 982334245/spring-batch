package com.batch.design.patterns.command;

/**
 * Created by longbao on 18/7/5.
 */
public class CommandPatternDemo {
    /**
     * @Author lb
     * @Description 测试main方法
     * @Date 16:14 18/7/5
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
