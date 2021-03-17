package pro.bzy.cloud.commons.exceptions;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MyAbstractException implements MyException {

    protected int code;

    protected  String msg;
}
