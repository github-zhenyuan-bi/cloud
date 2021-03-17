package pro.bzy.cloud.commons.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pro.bzy.cloud.commons.exceptions.MyException;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {

    /* 结果码 */
    private int code;

    /* 结果提示语 */
    private String msg;

    /* 结果数据 */
    private T data;



    /* 成功状态码 */
    public static final int SUCCESS_CODE = 200;

    /* 失败状态码 */
    public static final int ERROR_CODE = 500;



    /* 常用成功方法 */
    public static final <T> R<T> ofSuccess(String msg, T data) {
        return new R(SUCCESS_CODE, msg, data);
    }

    public static final <T> R<T> ofSuccess(String msg) {
        return ofSuccess(msg, null);
    }

    public static final <T> R<T> ofSuccess(T data) {
        return ofSuccess("OK", data);
    }



    /* 常用失败方法 */
    public static final <T> R<T> ofError(String msg, T data) {
        return new R(ERROR_CODE, msg, data);
    }

    public static final <T> R<T> ofError(String msg) {
        return ofError(msg, null);
    }

    public static final <T> R<T> ofError(MyException me) {
        return new R(me.getCode(), me.getMsg(), null);
    }

    public static final <T> R<T> ofError(Exception e) {
        return ofError(e.getMessage());
    }
}
