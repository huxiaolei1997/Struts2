package com.struts2.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Interceptor
 * <p>
 * version 1.0
 *
 * @create 2018-07-23 10:50
 * @copyright huxiaolei1997@gmail.com
 */
public class Interceptor extends AbstractInterceptor {
    /**
     * Override to handle interception
     *
     * @param invocation
     */
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        /* let us do some pre-processing */
        String output = "Pre-Processing";
        System.out.println(output);

        /* let us call action or next interceptor */
        String result = invocation.invoke();

        /* let us do some post-processing */
        output = "Post-Processing";
        System.out.println(output);

        return result;
    }
}
