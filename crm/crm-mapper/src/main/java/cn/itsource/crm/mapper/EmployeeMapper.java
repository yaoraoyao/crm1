package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.query.EmployeeQuery;

import java.util.List;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/12/2 14:50
 * @Version v1.0
 **/
public interface EmployeeMapper extends BaseMapper<Employee>{

    long count(EmployeeQuery query);

    List<Employee> selectByQuery(EmployeeQuery query);
}
