package cn.itsource.base.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.IBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/11/30 10:46
 * @Version v1.0
 **/
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    /**
     * 所有的Service的实现类重写这个方法
     * @return
     */
    protected abstract BaseMapper<T> getMapper();

    @Override
    public void add(T t) {
        getMapper().insert(t);
    }

    @Override
    public void removeById(Serializable id) {
        getMapper().deleteById(id);
    }

    @Override
    public void updateById(T t) {
        getMapper().updateById(t);
    }

    @Override
    public T getById(Serializable id) {
        return getMapper().selectById(id);
    }

    @Override
    public List<T> getAll() {
        return getMapper().selectAll();
    }
}
