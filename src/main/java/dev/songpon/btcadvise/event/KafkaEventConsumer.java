package dev.songpon.btcadvise.event;

import dev.songpon.btcadvise.service.AdviserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventConsumer {
    private Logger log = LoggerFactory.getLogger(KafkaEventConsumer.class);

    private AdviserService service;

    @Autowired
    public KafkaEventConsumer(AdviserService service) {
        this.service = service;
    }

//    @KafkaListener(topics = "advise_event", groupId = "openAPI")
    public void listenEvent(String message) {
        log.info("Received Message in advise_event: {}", message);
        var advise = this.service.getAdvise(message);
        log.info("Exchange Rate: {}", advise.getExchangeRate());
        log.info("Base Coin: {}", advise.getBaseCoin());
        log.info("Guide : {}", advise.getGuide());
    }
}
