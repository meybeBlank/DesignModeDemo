package com.example.ffengz.designmode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 火车票卖出工厂，进行卖票的操作
 *
 * @author fengzhen
 * @version 1.0, 2017/5/25
 */
public class TicketFactory {
    // 将创建的对象进行存储
    private static Map<String, Ticket> ticketShop = new HashMap<>();

    /**
     * 提供方法获取Ticket
     */
    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (ticketShop.containsKey(key)) {
            return ticketShop.get(key);
        }
        Ticket ticket = new TrainTicket(from, to);
        ticketShop.put(key,ticket);
        return ticket;
    }

}
