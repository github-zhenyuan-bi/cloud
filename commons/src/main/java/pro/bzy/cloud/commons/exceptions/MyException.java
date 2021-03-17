package pro.bzy.cloud.commons.exceptions;


/**
 * 自定义 异常类接口
 */
public interface MyException {

    /**
     * 异常码
     * @return
     */
    int getCode();



    /**
     * 异常信息
     * @return
     */
    String getMsg();

}
