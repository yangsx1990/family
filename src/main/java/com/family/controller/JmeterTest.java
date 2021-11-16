package com.family.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/11/9 上午10:23
 * @modified By:
 */
public class JmeterTest {
    private void initDate(String type) throws IOException {
        String path = "/json/trade_base.json";
        if (type.equals("update")){
            path = "/json/trade_update.json";
        }
        InputStream is = this.getClass().getResourceAsStream(path);
        StringWriter writer = new StringWriter();
        IOUtils.copy(is, writer, StandardCharsets.UTF_8.name());
        String json = writer.toString();
        Gson gson = new GsonBuilder().create();
      /*  if (type.equals("update")){
            apiTradeUpdate = gson.fromJson(json, new TypeToken<ApiTrade>() {}.getType());
        }else {
            apiTrade = gson.fromJson(json, new TypeToken<ApiTrade>() {}.getType());
        }*/
    }
}
