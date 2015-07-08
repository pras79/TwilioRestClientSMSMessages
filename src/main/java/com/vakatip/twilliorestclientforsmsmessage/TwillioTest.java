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
// This will be used to send the SMS messages to any out going cell numbers 

import java.util.*; 
import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
 
public class TwillioTest  { 
 // Find your Account Sid and Token at twilio.com/user/account 
 public static final String ACCOUNT_SID = "AC7c6c0996adff409aeef17883a5c2c3ac"; 
 public static final String AUTH_TOKEN = "cf03cf6c732db33f6275609da0c7aa8a"; 
 
 public static void main(String[]args) throws TwilioRestException { 
	TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
 
	 // Build the parameters 
	 List<NameValuePair> params = new ArrayList<NameValuePair>(); 
	 params.add(new BasicNameValuePair("To", "6105642261")); 
	 params.add(new BasicNameValuePair("From", "+14848689244")); 
	 params.add(new BasicNameValuePair("Body", "Hello Bhashar Godavarthi, \n" +
"This to inform you that we have a great opportunity to for you as a test lead in Vanguard \n" +
"Would be interested if so please send your updated resume \n" +
"John.vsmith@vanguard .com\n" +
"Looking forward to speak with you\n" +
"Thanks \n" +
"John \n" +
"Vanguard " + "")); 
        MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
	 Message message = messageFactory.create(params); 
	 System.out.println(message.getSid()); 
 } 
}
