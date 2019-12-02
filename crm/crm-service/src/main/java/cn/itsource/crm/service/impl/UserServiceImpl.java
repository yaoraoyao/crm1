package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.User;
import cn.itsource.crm.mapper.UserMapper;
import cn.itsource.crm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 *  SUPPORTS 如果当前有事务，加入到当前事务中
 *           如果当前没有事务，则以非事务状态运行
 *  REQUIRED 如果当前有事务，加入到当前事务中
 *           如果当前没有事务，则创建一个新的事务运行
 * @Author solargen
 * @Date 2019/11/30 11:52
 * @Version v1.0
 **/
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    protected BaseMapper<User> getMapper() {
        return userMapper;
    }

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    @Override
    public User getByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
