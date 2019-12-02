package cn.itsource.base.service;

import java.io.Serializable;
import java.util.List;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/11/30 10:45
 * @Version v1.0
 **/
public interface IBaseService<T> {

    void add(T t);

    void removeById(Serializable id);

    void updateById(T t);

    T getById(Serializable id);

    List<T> getAll();

}
