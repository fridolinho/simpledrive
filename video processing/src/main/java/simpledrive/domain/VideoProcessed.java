package simpledrive.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import simpledrive.domain.*;
import simpledrive.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private Integer url;

    public VideoProcessed(Video aggregate) {
        super(aggregate);
    }

    public VideoProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
