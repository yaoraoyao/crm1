package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.crm.util.PageList;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/12/2 14:48
 * @Version v1.0
 **/
public interface IEmployeeService extends IBaseService<Employee> {

    PageList<Employee> page(EmployeeQuery query);
}
