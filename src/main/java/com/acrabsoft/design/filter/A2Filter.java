package com.acrabsoft.design.filter;

public class A2Filter implements Filter{
    @Override
    public void doFilter(Filter chain) {
        System.out.println("A2Filter--before");
        chain.doFilter(chain);
        System.out.println("A2Filter--after");
    }
}
