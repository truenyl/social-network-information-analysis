import weibo4j.Timeline;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.StatusWapper;
import weibo4j.model.WeiboException;


public class Task1 {

	public static void main(String[] args) {
		String access_token = "2.00ysrTZFbBIMZD5260143324JNGXCC";
		Timeline tm = new Timeline(access_token);
		try {
			for (int i = 0; i < 1000; i++) {
				StatusWapper status = tm.getPublicTimeline(200, 0);
				System.out.println(status.MytoString());
				//Log.logInfo(status.toString());
				Thread.sleep(10000);
			}

		} catch (WeiboException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

