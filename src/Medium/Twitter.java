package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class User{
	int userId;
	HashMap<Integer, Long> tweet = new HashMap<>();
	ArrayList<Integer> followers = new ArrayList<>();
}


public class Twitter {
	
	static HashSet<User> map = new HashSet<>();
	User user = new User();
	public Twitter(){
		
	}
	
	public void postTweet(int userId, int tweetId) {
		user.userId = userId;
		
		if(!map.contains(user.userId)){
			user.tweet.put(tweetId, System.currentTimeMillis());
			map.add(user);
		}
		
		
	}
	
//	public List<Integer> getNewsFeed(int userId) {
//		if (map.contains(userId)) {
//			
//		}
//	}
	
	public void follow(int followerId, int followeeId) {
		user.userId = followerId;
		if(!map.contains(user.userId)){
			
			user.followers.add(followeeId);
			map.add(user);
		}
	}
	
	public void unfollow(int followerId, int followeeId) {
		user.userId = followerId;
		if(!map.contains(user.userId)){
			user.followers.remove(followeeId);
			map.add(user);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Twitter twitter = new Twitter();
		twitter.postTweet(1, 11);
		twitter.postTweet(2, 12);
		twitter.postTweet(3, 13);
		twitter.postTweet(1, 14);
		
		System.out.println(map.iterator().next().userId);
		

	}

}
