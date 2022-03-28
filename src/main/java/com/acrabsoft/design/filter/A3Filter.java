package com.acrabsoft.design.filter;

public class A3Filter implements Filter{
    @Override
    public void doFilter(Filter chain) {
        System.out.println("A3Filter--before");
        chain.doFilter(chain);
        System.out.println("A3Filter--after");
    }
}
