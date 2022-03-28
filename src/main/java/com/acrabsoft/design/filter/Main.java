package com.acrabsoft.design.filter;

public class Main {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilter(new A1Filter());
        chain.addFilter(new A2Filter());
        chain.addFilter(new A3Filter());
        System.out.println(11);
        chain.doFilter(chain);
        System.out.println(22);
    }
}
