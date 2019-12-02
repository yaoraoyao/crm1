package cn.itsource.crm.web.controller;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.crm.service.IEmployeeService;
import cn.itsource.crm.util.AjaxResult;
import cn.itsource.crm.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/12/2 14:44
 * @Version v1.0
 **/
@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> list(){
        return employeeService.getAll();
    }

    @PostMapping("/employee/page")
    public PageList<Employee> page(@RequestBody EmployeeQuery query){
        return employeeService.page(query);
    }

    @DeleteMapping("/employee/{id}")
    public AjaxResult delete(@PathVariable("id") Long id){
        try {
            employeeService.removeById(id);
            return AjaxResult.me().setMessage("删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("删除失败!"+e.getMessage());
        }
    }

    @PostMapping("/employee")
    public AjaxResult save(@RequestBody Employee employee){
        try {
            if(employee.getId()!=null){
                //修改
                employeeService.updateById(employee);
            }else{
                //添加
                //初始化密码
                employee.setPassword("admin");
                employeeService.add(employee);
            }
            return AjaxResult.me().setMessage("保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("保存失败!"+e.getMessage());
        }
    }
}
