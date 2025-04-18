package fit.iuh.edu.vn.order_service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(OrderKafkaConsumer.class);

    @KafkaListener(topics = "product-topic", groupId = "order-group")
    public void consume(String message) {
        logger.info("Received message: {}", message);
        // Xử lý logic khi nhận thông điệp, ví dụ: kiểm tra tồn kho
    }
}
