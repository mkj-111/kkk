package com.jk.mkj.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class Alipay {

    public static String app_id = "2016102700768491";


    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCvFVwU8sHl3O/KMSfClSok3U1hgspKBPF/HJ0XMcCl40QTFSLfJESQncNbAEVbvWmdqR2lFn5HXAcRJaOdti4bFcAOSi9/ZhuNrJ7ntdUdeeAK3LRX9FQRE4Foq0dDFfzcHcmKDPwIrh8snr5KhgxoI8z8Of6SWvK+wqaTtXizjqMVJZdGDjDfR5QW78vx7BrXo8XKBbUr9xUPL5x/TjWkkVmOcMyqVEHrhy0CLC6gUelR3Q1s3z/S9KqSF/NND8mXrWQhZiazdi6VrL+sLks4bFqVnVYtyhqAuUnZpFcJblLSY8G2utMRn2dOdZGT9XQGqvbDBif8Tcn0vlsKosk7AgMBAAECggEAImNHmrWzb7pdPpE5BfbWODdfI2/U24TtCdJM6GlVNT/V9wmHt9wfu2fBHvaGqOYjAFxe/jXUx59DpBKIeEl39Mno1uWrPpKHhuQIsen82bU+U+PVaBENEe2K1UwOyxZee70+AGdceTf514G2TlzVwv6FHGUnowdJ9j21Cf3ynxFpGD3ZdUy2CuxmOSEF0dq+Jgo5gm7O9lECUFqxsjGgS+jtfso0AbJ9C1fUSWKHfLMLayyHBpuKk+xudoOabxkD1pm3MFAoGTILwKPD8cH6a2gdN+auMXFBeCVO5aBQqOW9u/LQuIUr0IjBI7wq/Wjb3iWXiKrhUKiOIY7i9hjzAQKBgQDvsCg5TpmniAEVtnStz/HgiBCuge6mp3uyA9fG46Ucl0EAiLzFHcyaTdduzNiG5gKwvSfbYX8ijSsj9iJzs9wE+W1KBI+1KYDynJH9gy5gFx4vbsjLWjKw/sXl9nbzPgsp6YzMs1alUW7DUVcL5rDjOep9NpSQUreofhhfmm048QKBgQC6/6kqrBNqe1f479l85vA0P9DVKQ7qI78nMZZ7I6EX1AL+p/8SSl9EYKb/5QCVw6V0HyFX2V2LiwSBnk3xJU4e/1pl9ySOT11Zg2Ba80N0fWB0BX/vsll2XgRu92Y5cswyQ1wI/oBBDE95QmIqy+YIJfsSUvVzeaicaN2UPTfE6wKBgQCOEy4Uogmka5KxCyDocm1eeWjh9/S9ZmOE5pA9vWx+oQ2Pwn2angpMoL2FWPk0JR0NJGJ+wLD6ixE6VMihKsjNTghBKqkAaqSbqsFCs0KHBM0IsrNlDocjsTEfGdPyZSF664xhPiCrB7UPI6TkUg8h8Y+UPwka710cC/pomQILEQKBgE7HyqMZn4xqrmNH2N6QBH5erEJBa/EkYjHG6Fi0Z/e78A8NA57XCk+qUHDaL2bo59mGC+wQvSI+zQU2hiujxce1WIZAmnwB35gIix2GAtMexvXaI03+W0ZM0Z1WSRDG1lQOoMWBQtMkto6lcuoIwL6KEb5kiNe/V1Odskvzhn1FAoGAHM8ezAR1N1Njl+ipz2EIcspNyEJOH0AncmBfpc+SgmZ0T+PxUZuXv+QEzAE7Jd9aIAlPhb52QLGjVjm6rNdEmra4D5cMbQ5MD5OSEuAXyduOzVX9mHk9KFJcGFeSX0Sb6GKh22wIXjJqlrZG+KkIXfb55cykN82WBgKm9aS44HU=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0gQjrymUlb/BEtE1+F2qc8NkAHbqTldebmO34HoVf+3O7W1z+2U82Lbb0cCxSuNWyz6H6iIii7pLqlnEE/+horEAirfJV2nC3exTZrOICahOJyATsTVqy/iefwO9Uy0d3BUTqLSOWmJZuMAyssoYxwwsSGGBb1olpbqZnvvXO0+UK3Doot1DTbH/dgtt6SkGDTgw5KdELRbI7L3sZgOIRbkqbAl2GraUPM3EE/PLBrZfZFwUiR5TQAtamxk5x/5OuKYE1T+cRI13Sa9/p0mfZM/F8MPz86/tRvuFGjP31NSgl4fYuSPMyPw3SOr6fhGIPqhJC4P8qlCSvcbIghkEqQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\桌面";

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

