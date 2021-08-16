package com.jw.springbootupload.exception;
import com.jw.springbootupload.domain.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @program: spring-boot-action
 * @description: 文件上传错误封装类
 * @author: jiankai
 * @create: 2021-08-16 15:13
 **/
@ControllerAdvice
public class FileUploadExceptionAdvice extends ResponseEntityExceptionHandler{
    /**
     * 功能描述:
     * 文件上传大小限制抛异常
     *
     * @param e:
     * @return org.springframework.http.ResponseEntity<com.jw.springbootupload.domain.Message>
     * @author jiankai
     * @date 2021/8/16 15:31
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<Message> handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e){
        return ResponseEntity.badRequest().body(new Message("Upload file too large."));
    }
}
