package cn.itsource.base.query;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 基础的Query
 * @Author solargen
 * @Date 2019/11/30 10:40
 * @Version v1.0
 **/
@Getter
@Setter
public class BaseQuery {

    private Integer pageNum = 1;

    private Integer pageSize = 10;

    private String keyword;

    public int getStart(){
        return (pageNum-1)*pageSize;
    }

}
