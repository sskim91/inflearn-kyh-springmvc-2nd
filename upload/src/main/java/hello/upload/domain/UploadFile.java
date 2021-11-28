package hello.upload.domain;

import lombok.Data;

/**
 * Created by sskim on 2021/11/28
 * Github : http://github.com/sskim91
 */
@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
