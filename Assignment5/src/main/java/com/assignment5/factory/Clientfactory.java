package com.assignment5.factory;

import com.assignment5.domain.client.ClientOther;
import com.assignment5.domain.client.ClientType;
import com.assignment5.domain.client.ClientGeneral;
import com.assignment5.domain.client.ClientPremium;

/**
 * Created by student on 2016/03/31.
 */
public class Clientfactory {

    public static String getClientType(long value){
        ClientType chain = setUpChain();
        return chain.handleRequest(value);
    }

    public static ClientType setUpChain(){
        ClientType a = new ClientPremium();
        ClientType b = new ClientGeneral();
        ClientType c = new ClientOther();
        a.setNextType(b);
        b.setNextType(c);
        return a;
    }
}
