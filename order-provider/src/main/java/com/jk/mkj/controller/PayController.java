package com.jk.mkj.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.jk.mkj.utils.Alipay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("aliPay")
public class PayController {


    /**
     *
     * @param integerdzhi
     * @param gid
     * @param gname   商品名称
     * @param bzongjia  交易金额
     * @param gnumber  订单号
     * @return
     * @throws AlipayApiException
     */
    @RequestMapping("topay")
    @ResponseBody
    public String AliPay(Integer integerdzhi,Integer gid,String gname,Double bzongjia,String gnumber) throws AlipayApiException {


        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(Alipay.gatewayUrl, Alipay.app_id, Alipay.merchant_private_key, "json", Alipay.charset, Alipay.alipay_public_key, Alipay.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(Alipay.return_url);
        alipayRequest.setNotifyUrl(Alipay.notify_url);
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ gnumber +"\","
                + "\"total_amount\":\""+ bzongjia +"\","
                + "\"subject\":\""+ gname +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String result;
        result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println("*********************\n返回结果为："+result);
        return result;
    }

}
