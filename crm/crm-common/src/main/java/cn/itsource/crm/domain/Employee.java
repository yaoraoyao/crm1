package cn.itsource.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/12/2 14:45
 * @Version v1.0
 **/
@Getter
@Setter
@ToString
public class Employee {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String headImage;
    private Integer age;
    private Long department_id;

    private Department department;


}
