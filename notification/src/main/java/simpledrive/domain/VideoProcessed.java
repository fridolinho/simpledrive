package simpledrive.domain;

import java.util.*;
import lombok.*;
import simpledrive.domain.*;
import simpledrive.infra.AbstractEvent;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private Integer url;
}
