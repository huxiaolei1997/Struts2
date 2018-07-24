package com.struts2.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡晓磊
 * @create 2018-07-03 16:18
 * @email huxiaolei1997@gmail.com
 */
public class HelloWorldAction {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String, Object>();
        context.put("key1", "value1");
        context.put("key2", "value2");
        valueStack.push(context);
        System.out.println("Size of the valueStack: " + valueStack.size());
        System.out.println("invoke execute()");
        return "success";
    }
}
