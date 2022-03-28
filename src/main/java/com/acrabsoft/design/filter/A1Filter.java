package com.acrabsoft.design.filter;

public class A1Filter implements Filter{
    @Override
    public void doFilter(Filter chain) {
        System.out.println("A1Filter--before");
        chain.doFilter(chain);
        System.out.println("A1Filter--after");
    }
}
