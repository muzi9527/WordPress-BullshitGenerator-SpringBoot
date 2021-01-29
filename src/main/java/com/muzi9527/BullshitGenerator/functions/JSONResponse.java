package com.muzi9527.BullshitGenerator.functions;

import com.alibaba.fastjson.JSONObject;

public class JSONResponse {
   public static JSONObject response_200(String title, String content){
       JSONObject result = new JSONObject();
       result.put("msg", "200");
       result.put("method", "insert");
       result.put("title", title);
       result.put("content", content);
       return result;
   }
    public static JSONObject response_400(String error_msg){
        JSONObject result = new JSONObject();
        result.put("msg", "400");
        result.put("method", "insert");
        result.put("error", error_msg);
        return result;
    }
}
