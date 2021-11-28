package hello.upload.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by sskim on 2021/11/28
 * Github : http://github.com/sskim91
 */
@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;
}
