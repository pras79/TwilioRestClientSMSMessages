/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vakatip.twilliorestclientforsmsmessage;

/**
 *
 * @author vakatip
 */
// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.instance.ShortCode;
import com.twilio.sdk.resource.list.ShortCodeList;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
 
public class TwilloSmsUrl { 
 
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "AC7c6c0996adff409aeef17883a5c2c3ac";
  public static final String AUTH_TOKEN = "cf03cf6c732db33f6275609da0c7aa8a";
 
  public static void main(String[] args) throws TwilioRestException {
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
    // Get an object from its sid. If you do not have a sid,
    // check out the list resource examples on this page
    ShortCode shortCode = client.getAccount().getShortCode("AC7c6c0996adff409aeef17883a5c2c3ac");
    System.out.println ("exeucting values ::::" + shortCode.getShortCode()) ;
        
    
    // Build a filter for the ShortCodeList
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("SmsUrl", "http://demo.twilio.com/docs/sms.xml"));
    shortCode.update(params);
    
    
    
     
  }
}
