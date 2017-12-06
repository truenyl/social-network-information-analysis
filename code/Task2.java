package weibo4j.examples.timeline;

import weibo4j.Timeline;
import weibo4j.Friendships;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.User;
import weibo4j.model.Status;
import weibo4j.model.StatusWapper;
import weibo4j.model.UserWapper;
import weibo4j.model.WeiboException;

public class Task2 {

	public static void main(String[] args) {
		String access_token = "2.00ysrTZFbBIMZD5260143324JNGXCC";
		String uid = "5104954572";
		Friendships fm = new Friendships(access_token);

		//funs	
		try {
			UserWapper users = fm.getFollowersById(uid);
			for (User u: users.getUsers()) {
				Log.logInfo(u.toString());
			}
			System.out.println(users.getNextCursor());
			System.out.println(users.getPreviousCursor());
			System.out.println(users.getTotalNumber());

		} catch (WeiboException e) {
			e.printStackTrace();
		}

		//focus
		try {
			UserWapper users = fm.getFriendsByID(uid);
			for (User u: users.getUsers()) {
				Log.logInfo(u.toString());
			}
			System.out.println(users.getNextCursor());
			System.out.println(users.getPreviousCursor());
			System.out.println(users.getTotalNumber());

		} catch (WeiboException e) {
			e.printStackTrace();
		}

		//weibo
		Timeline tm = new Timeline(access_token);
		try {
			StatusWapper status = tm.getUserTimeline();
			for (Status s: status.getStatuses()) {
				Log.logInfo(s.toString());
				System.out.println("\n");
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}