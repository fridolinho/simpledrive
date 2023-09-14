package simpledrive.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import simpledrive.domain.*;
import simpledrive.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private Long userId;
    private String fileName;
    private String fileType;
    private Long fileSize;

    public FileUploaded(File aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}
//>>> DDD / Domain Event
