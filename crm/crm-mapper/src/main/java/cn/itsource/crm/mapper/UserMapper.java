package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.User;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/11/30 11:35
 * @Version v1.0
 **/
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
