package cn.itsource.base.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 基础的Mapper
 * @Author solargen
 * @Date 2019/11/30 10:41
 * @Version v1.0
 **/
public interface BaseMapper<T> {

    void insert(T t);

    void deleteById(Serializable id);

    void updateById(T t);

    T selectById(Serializable id);

    List<T> selectAll();

}
