package cn.kgc.domain;

import java.util.HashMap;
import java.util.Map;

/**  
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class SendMsgUtil {
	//用户名
	private static String Uid = "xiaorao6";
	
	//接口安全秘钥
	private static String Key = "d41d8cd98f00b204e980";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob = "13800000000";
	
	//短信内容
	private static String smsText = "验证码：8888";


	public  int sendMsg(String tel,String msg) {
		HttpClientUtil client = HttpClientUtil.getInstance();
		//UTF发送
		int result = client.sendMsgUtf8(Uid, Key, msg, tel);
		return result;
	}
}
