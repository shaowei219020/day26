package com.qf.jsonlib;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
public class JsonLibDemo1 {
    @Test
    public void test1() throws JSONException {
        String json="{name:'小明',age:12}";
        JSONObject jsonObject = new JSONObject(json);
        String name=jsonObject.getString("name");
        int age=jsonObject.getInt("age");
        System.out.println(age);
        System.out.println(name);

    }


}
