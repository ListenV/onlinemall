package cn.sky03.mall.product.exception;

import cn.sky03.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice("cn.sky03.mall.product.controller")
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R validExceptionHandler(MethodArgumentNotValidException e){
        log.error("数据校验出错：{}，异常类型：{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> errMap = new HashMap<>();
        e.getFieldErrors().forEach(fieldError -> {
            errMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(400, "数据校验出现问题").put("data", errMap);
    }

}
