package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.mapper.EmployeeMapper;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.crm.service.IEmployeeService;
import cn.itsource.crm.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/12/2 14:48
 * @Version v1.0
 **/
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    protected BaseMapper<Employee> getMapper() {
        return employeeMapper;
    }

    @Override
    public PageList<Employee> page(EmployeeQuery query) {

        //查询总条目数
        long total = employeeMapper.count(query);
        //查询当前页的数据
        List<Employee> rows = employeeMapper.selectByQuery(query);
        //封装PageList返回
        return new PageList<>(total,rows);
    }
}
