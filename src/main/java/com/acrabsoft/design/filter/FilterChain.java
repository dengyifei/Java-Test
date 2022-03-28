package com.acrabsoft.design.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{

    List<Filter> filters = new ArrayList<Filter>();

    private int index;
    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }

    @Override
    public void doFilter(Filter chain) {
        if(index==filters.size()){
            return;
        }
        //每添加一个过滤规则，index自增1
        Filter f=filters.get(index);
        index++;
        //根据索引值获取对应的规律规则对字符串进行处理
        f.doFilter(chain);
    }
}
