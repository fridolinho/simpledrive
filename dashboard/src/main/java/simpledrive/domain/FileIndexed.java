package simpledrive.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import simpledrive.infra.AbstractEvent;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String keywords;
}
