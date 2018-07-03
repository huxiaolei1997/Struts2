package com.struts2.action;

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
        return "success";
    }
}
