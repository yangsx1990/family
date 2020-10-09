package com.family.project.wxpay;

import java.io.*;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/9 上午10:14
 * @modified By:
 */
public class MyConfig extends WXPayConfig {

    private byte[] certData;

    public MyConfig() throws IOException {
        String certPath="/path/to/apiclient_cert.pl2";
        File file=new File(certPath);
        InputStream inputStream=new FileInputStream(file);
        this.certData=new byte[(int)file.length()];
        inputStream.read(this.certData);
        inputStream.close();
    }
    @Override
    String getAppID() {
        return "appId";
    }

    @Override
    String getMchID() {
        return "mchId";
    }

    @Override
    String getKey() {
        return "key";
    }

    @Override
    InputStream getCertStream() {
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(this.certData);
        return byteArrayInputStream;
    }

    @Override
    IWXPayDomain getWXPayDomain() {
        IWXPayDomain iwxPayDomain=new IWXPayDomain() {
            @Override
            public void report(String domain, long elapsedTimeMillis, Exception ex) {

            }

            @Override
            public DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API,true);
            }
        };

        return iwxPayDomain;
    }
}
