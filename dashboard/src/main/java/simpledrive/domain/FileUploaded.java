package simpledrive.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import simpledrive.infra.AbstractEvent;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private Long userId;
    private String fileName;
    private String fileType;
    private Long fileSize;
}
