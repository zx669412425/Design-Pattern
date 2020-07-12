package templatePattern.executorService.basic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 基本请求参数
 */
@Setter
@Getter
@ToString
public class BasicTaskBO {

    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * 姓名
     */
    private String name;
}
