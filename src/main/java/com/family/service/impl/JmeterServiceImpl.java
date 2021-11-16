package com.family.service.impl;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/11/9 下午4:46
 * @modified By:
 */

        import com.family.model.ApiTrade;
        import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;
        import com.google.gson.reflect.TypeToken;
        import lombok.extern.slf4j.Slf4j;
        import org.apache.commons.io.FileUtils;
        import org.apache.commons.io.IOUtils;
        import org.springframework.stereotype.Service;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;

        import java.io.File;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.StringWriter;
        import java.nio.charset.StandardCharsets;

/**
 * @Author: hukaiyang
 * @Date: 2021/11/9
 * @Contact hukaiyang@huice.com
 * @Company 掌上先机 (http://www.huice.com)
 */
//@Service
@Slf4j
public class JmeterServiceImpl {

    private static String trade_base = null;

    private static String trade_update = null;

    private String readData(String path) {
        long startTime = System.currentTimeMillis();
        File file = new File(path);
        String result = null;
        try {
            result = FileUtils.readFileToString(file, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        log.info("本次读取耗时{}毫秒", endTime - startTime);
        return result;
    }

   /* public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Test test=new Test();
            System.out.println("i:"+i);
            test.start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }*/
   public static void main(String[] args) {
       String path = "src/main/resources/json/trade_base.json";

       String json="{\n" +
               "  \"rec_id\": 1,\n" +
               "  \"platform_id\": 89,\n" +
               "  \"shop_id\": 901,\n" +
               "  \"tid\": \"E722401204670113\",\n" +
               "  \"process_status\": 60,\n" +
               "  \"trade_status\": 70,\n" +
               "  \"guarantee_mode\": 1,\n" +
               "  \"pay_status\": 2,\n" +
               "  \"delivery_term\": 2,\n" +
               "  \"pay_method\": 1,\n" +
               "  \"refund_status\": 0,\n" +
               "  \"is_new\": 0,\n" +
               "  \"bad_reason\": 0,\n" +
               "  \"modify_flag\": 0,\n" +
               "  \"fenxiao_type\": 0,\n" +
               "  \"purchase_id\": \"\",\n" +
               "  \"fenxiao_nick\": \"\",\n" +
               "  \"order_count\": 1,\n" +
               "  \"goods_count\": 1,\n" +
               "  \"trade_time\": \"2020-12-06 22:02:15\",\n" +
               "  \"pay_time\": \"2020-12-06 22:02:15\",\n" +
               "  \"end_time\": \"2020-12-06 22:02:15\",\n" +
               "  \"buyer_message\": \"\",\n" +
               "  \"remark\": \"\",\n" +
               "  \"remark_flag\": 0,\n" +
               "  \"buyer_nick\": \"txfy13829269498\",\n" +
               "  \"buyer_name\": \"\",\n" +
               "  \"buyer_email\": \"\",\n" +
               "  \"buyer_area\": \"广东省 广州市 天河区\",\n" +
               "  \"id_card_type\": 0,\n" +
               "  \"id_card\": \"\",\n" +
               "  \"pay_id\": \"\",\n" +
               "  \"pay_account\": \"\",\n" +
               "  \"receiver_name\": \"陈兆金\",\n" +
               "  \"receiver_country\": \"0\",\n" +
               "  \"receiver_province\": 1,\n" +
               "  \"receiver_city\": 1,\n" +
               "  \"receiver_district\": 1,\n" +
               "  \"receiver_address\": \"广东省广州市天河区天源路阅林街38号102房\",\n" +
               "  \"receiver_mobile\": \"13829269498\",\n" +
               "  \"receiver_telno\": \"\",\n" +
               "  \"receiver_zip\": \"\",\n" +
               "  \"receiver_area\": \"天河区\",\n" +
               "  \"receiver_ring\": \"\",\n" +
               "  \"to_deliver_time\": \"\",\n" +
               "  \"pre_charge_time\": \"\",\n" +
               "  \"currency\": \"\",\n" +
               "  \"is_prev_notify\": 0,\n" +
               "  \"receiver_hash\": \"71a713605b3748e1a3b153d248f6e906\",\n" +
               "  \"goods_amount\": 59,\n" +
               "  \"post_amount\": 0,\n" +
               "  \"other_amount\": 0,\n" +
               "  \"discount\": 0,\n" +
               "  \"receivable\": 59,\n" +
               "  \"paid\": 59,\n" +
               "  \"credit_card_paid\": 0,\n" +
               "  \"platform_cost\": 0,\n" +
               "  \"received\": 9,\n" +
               "  \"trade_prepay\": 0,\n" +
               "  \"dap_amount\": 59,\n" +
               "  \"cod_amount\": 0,\n" +
               "  \"pi_amount\": 0,\n" +
               "  \"ext_cod_fee\": 0,\n" +
               "  \"refund_amount\": 0,\n" +
               "  \"commission\": 0,\n" +
               "  \"logistics_type\": -1,\n" +
               "  \"logistics_no\": \"JT5057016921340\",\n" +
               "  \"invoice_type\": 0,\n" +
               "  \"invoice_title\": \"\",\n" +
               "  \"invoice_content\": \"\",\n" +
               "  \"trade_from\": 1,\n" +
               "  \"trade_mask\": 0,\n" +
               "  \"wms_type\": 0,\n" +
               "  \"warehouse_no\": \"\",\n" +
               "  \"stockout_no\": \"\",\n" +
               "  \"is_auto_wms\": 0,\n" +
               "  \"arrive_interval\": 0,\n" +
               "  \"consign_interval\": 0,\n" +
               "  \"arrive_cut_time\": \"\",\n" +
               "  \"score\": \"0\",\n" +
               "  \"real_score\": 0,\n" +
               "  \"got_score\": 0,\n" +
               "  \"is_sealed\": 0,\n" +
               "  \"cust_data\": \"\",\n" +
               "  \"x_salesman_id\": 0,\n" +
               "  \"deliver_trade_id\": 0,\n" +
               "  \"is_preorder\": 0,\n" +
               "  \"x_customer_id\": 0,\n" +
               "  \"x_logistics_id\": 0,\n" +
               "  \"x_trade_flag\": 0,\n" +
               "  \"x_is_freezed\": 0,\n" +
               "  \"x_warehouse_id\": 0,\n" +
               "  \"is_external\": 0,\n" +
               "  \"reserve_field1\": 0,\n" +
               "  \"oaid_md5\": \"\",\n" +
               "  \"modified\": \"2021-07-27 18:23:53\",\n" +
               "  \"created\": \"2021-07-27 18:23:53\"\n" +
               "}\n" +
               "\n";
       ApiTrade apiTrade = transferBean(json);
       System.out.println(apiTrade);

   }

    private static ApiTrade transferBean(String bean) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        long startTime = System.currentTimeMillis();
        ApiTrade apiTrade = gson.fromJson(bean, new TypeToken<ApiTrade>() {
        }.getType());
        long endTime = System.currentTimeMillis();
        log.info("本次转换实际耗时{}秒", endTime - startTime);
        return apiTrade;
    }

    public String getData(String type) {
        String path = "src/main/resources/json/trade_base.json";
        if ("update".equals(type)) {
            path = "src/main/resources/json/trade_update.json";
        }
        return readData(path);
    }

    public String getNewData() {
        String path = "src/main/resources/json/trade_base.json";
        return readData(path);
    }

    public String getUpdateData() {
        String path = "src/main/resources/json/trade_update.json";
        return readData(path);
    }

    public ApiTrade transferData(String type) {
        //if (ApiService.trade_base == null) {
            log.info("trade_base为空，重新生成");
            trade_base = readData("src/main/resources/json/trade_base.json");
        /*}
        if (ApiService.trade_update == null) {
            log.info("trade_update为空，重新生成");
            trade_update = readData("src/main/resources/json/trade_update.json");
        }*/
        if ("update".equals(type)) {
            return transferBean(trade_update);
        } else {
            return transferBean(trade_base);
        }
    }

    /*public ApiTrade transferNewData() {
        if (ApiService.trade_base == null) {
            log.info("trade_base为空，重新生成");
            trade_base = readData("src/main/resources/json/trade_base.json");
        }
        return transferBean(trade_base);
    }

    public ApiTrade transferUpdateData() {
        if (ApiService.trade_update == null) {
            log.info("trade_update为空，重新生成");
            trade_update = readData("src/main/resources/json/trade_update.json");
        }
        return transferBean(trade_update);
    }*/
}