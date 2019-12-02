package cn.itsource.crm.web.controller;

import cn.itsource.crm.domain.User;
import cn.itsource.crm.service.IUserService;
import cn.itsource.crm.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/12/2 10:12
 * @Version v1.0
 **/
@RestController
public class LoginController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public AjaxResult login(@RequestBody User loginUser){
        //根据用户名从数据库查询用户信息
        User user = userService.getByUsername(loginUser.getUsername());
        //做登录的判断
        if(user==null){
            return AjaxResult.me().setSuccess(false).setMessage("用户名不存在!");
        }
        if(!user.getPassword().equals(loginUser.getPassword())){
            return AjaxResult.me().setSuccess(false).setMessage("密码错误!");
        }
        user.setPassword(null);
        return AjaxResult.me().setMessage("登录成功").setRestObj(user);
    }

}
