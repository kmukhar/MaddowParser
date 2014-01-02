package com.mukhar;

import de.vogella.rss.model.Feed;
import de.vogella.rss.model.FeedMessage;
import de.vogella.rss.read.RSSFeedParser;

public class MaddowFeedGenerator {
	public static void main(String[] args) {
		RSSFeedParser parser = new RSSFeedParser(
				"http://www.msnbc.com/feeds/latest");
		Feed feed = parser.readFeed();
		System.out.println(feed);
		for (FeedMessage message : feed.getMessages()) {
			System.out.println(message);
		}
	}
}
