package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.User;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/11/30 11:52
 * @Version v1.0
 **/
public interface IUserService extends IBaseService<User> {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getByUsername(String username);
}
