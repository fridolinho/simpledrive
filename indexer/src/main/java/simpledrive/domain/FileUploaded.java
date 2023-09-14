package simpledrive.domain;

import java.util.*;
import lombok.*;
import simpledrive.domain.*;
import simpledrive.infra.AbstractEvent;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private Long userId;
    private String fileName;
    private String fileType;
    private Long fileSize;
}
