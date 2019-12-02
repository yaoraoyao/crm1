package cn.itsource.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/11/30 11:32
 * @Version v1.0
 **/
@Getter
@Setter
@ToString
public class User {

    private Long id;
    private String username;
    private String password;

}
