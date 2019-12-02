package cn.itsource.crm.web.controller;

import cn.itsource.crm.domain.User;
import cn.itsource.crm.service.IUserService;
import cn.itsource.crm.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/11/30 14:45
 * @Version v1.0
 **/
@RestController //Controller+ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;

    //@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    //@RequestMapping(value = "/users",method = RequestMethod.GET)
    @GetMapping("/users")
    public List<User> getAll(){
        return userService.getAll();
    }

    //@RequestMapping(value = "/user",method = RequestMethod.POST)
    //username=aaa&password=bbb
    //springmvc中如何接收一个json参数并且封装到对象中 {"username":"aaa","password":"bbb"}
    //适用@ReqestBody接收请求中的json参数，自动封装到对象中
    //json对象的属性名称和参数的属性名称保持一致
    @PostMapping("/user")
    public AjaxResult save(@RequestBody User user){
        try {
            if(user.getId()!=null){
                //修改
                userService.updateById(user);
            }else{
                //添加
                userService.add(user);
            }
            return AjaxResult.me().setMessage("保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("保存失败!"+e.getMessage());
        }
    }

    //@RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public AjaxResult save(@PathVariable("id") Long id){
        try {
            userService.removeById(id);
            return AjaxResult.me().setMessage("删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("删除失败!"+e.getMessage());
        }
    }



}
