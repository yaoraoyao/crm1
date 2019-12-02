package cn.itsource.crm.util;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter//自动生成getter方法
@Setter//自动生成setter方法
@NoArgsConstructor//无参构造方法
@AllArgsConstructor//全参构造方法
public class PageList<T> {

    private long total = 0;

    private List<T> rows = new ArrayList<>();

}
