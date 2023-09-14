package simpledrive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import simpledrive.config.kafka.KafkaProcessor;
import simpledrive.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    VideoRepository videoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_ProcessVideo(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener ProcessVideo : " + fileUploaded + "\n\n"
        );

        // Sample Logic //
        Video.processVideo(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
