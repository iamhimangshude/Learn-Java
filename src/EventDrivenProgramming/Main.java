package EventDrivenProgramming;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

// 1. Custom Event Object
class OrderStatusEvent extends EventObject {
    private final String orderId;
    private final String oldStatus;
    private final String newStatus;

    public OrderStatusEvent(Object source, String orderId, String oldStatus, String newStatus) {
        super(source);
        this.orderId = orderId;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }
}

// 2. Listener Interface Contract
@FunctionalInterface
interface OrderStatusListener {
    void onOrderStatusChanged(OrderStatusEvent event);
}

// 3. Event Publisher (Source)
class OrderService {
    private final List<OrderStatusListener> listeners = new ArrayList<>();

    public void addListener(OrderStatusListener listener) {
        listeners.add(listener);
    }

    public void removeListener(OrderStatusListener listener) {
        listeners.remove(listener);
    }

    public void updateOrderStatus(String orderId, String oldStatus, String newStatus) {
        System.out.println(" Order " + orderId + " updated: " + oldStatus + " -> " + newStatus);

        // Construct event
        OrderStatusEvent event = new OrderStatusEvent(this, orderId, oldStatus, newStatus);

        // Dispatch to registered listeners
        notifyListeners(event);
    }

    private void notifyListeners(OrderStatusEvent event) {
        for (OrderStatusListener listener : listeners) {
            listener.onOrderStatusChanged(event);
        }
    }
}

// 4. Execution
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        // Register Listener 1: Email Notification Service
        orderService.addListener(event -> System.out.println("[Email Service] Sending email for Order #"
                + event.getOrderId() + ": Status is now " + event.getNewStatus()));

        // Register Listener 2: Audit Logging Service
        orderService.addListener(event -> System.out.println("[Audit Service] Logged change for Order #"
                + event.getOrderId() + " (" + event.getOldStatus() + " -> " + event.getNewStatus() + ")"));

        // Trigger Event
        orderService.updateOrderStatus("ORD-9901", "PROCESSING", "SHIPPED");
    }
}