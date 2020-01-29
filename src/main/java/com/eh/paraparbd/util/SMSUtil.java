package com.eh.paraparbd.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eh.paraparbd.entity.CommonUser;
import com.eh.paraparbd.service.CommonUserService;

@Component
public class SMSUtil {

    @Autowired
    CommonUserService commonUserService;

    public String smsForBooking(int commonUserId, int orderNo) throws IOException {
        String response = null;
        CommonUser userDetails = commonUserService.findByCommonUserId(commonUserId);
        System.out.println(userDetails.getPhoneNo());
        String phoneNo = userDetails.getPhoneNo();
        response = sendSMS(phoneNo, orderNo);

        return response;
    }

    public String sendSMS(String phoneNo, int orderNo) throws IOException {
        HttpURLConnection connection = null;
        String data= null;
        String api = "75762";
        String text = "TEXT";
        String textBody = "Your Order No " + orderNo + ",Your Booking Request Sent Successfully Please Wait For Call. \n parapar  \n Hot Line: 09617 XXX XXX";

        URL url = new URL(getOneToOne(api, text, phoneNo, textBody, "", ""));
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setUseCaches(false);
        connection.setDoOutput(true);

        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
        outputStream.close();

        //Get Response  
        InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        bufferedReader.close();
        data = textBody + "~" + response;

        return data;
    }

    public String getOneToOne(String apiKey, String type, String mobile, String smsText, String maskName, String campaignName) throws UnsupportedEncodingException {
        String oneByone = "https://api2.onnorokomsms.com/HttpSendSms.ashx?op=NumberSms&apiKey=";
        String smsType = "&type=";
        String reciverNumber = "&mobile=";
        String smsBody = "&smsText=";
        String smsMask = "&maskName=";
        String smscampaign = "&campaignName=";

        return oneByone + apiKey + smsType + type + reciverNumber + mobile + smsBody + URLEncoder.encode(smsText, "UTF-8").replace("\\+", "%20") + smsMask + maskName + smscampaign + campaignName;
    }

    public String getGetBalance(String apiKey) {
        String balance = "https://api2.onnorokomsms.com/HttpSendSms.ashx?op=GetCurrentBalance&apiKey=";
        return balance + apiKey;
    }
}
