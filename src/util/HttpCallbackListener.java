package util;


//请求放回接口
public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
}
