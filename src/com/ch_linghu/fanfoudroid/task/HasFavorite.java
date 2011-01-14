package com.ch_linghu.fanfoudroid.task;

import android.content.SharedPreferences;

import com.ch_linghu.fanfoudroid.TwitterApplication;
import com.ch_linghu.fanfoudroid.data.db.TwitterDbAdapter;
import com.ch_linghu.fanfoudroid.helper.ImageManager;
import com.ch_linghu.fanfoudroid.weibo.Weibo;

public interface HasFavorite {
	// Global
	static Weibo nApi = TwitterApplication.nApi;
	static TwitterDbAdapter mDb = TwitterApplication.mDb; 
	SharedPreferences getPreferences();
	ImageManager getImageManager();
	
	void logout();
	
	void doFavorite(String action, String id);
	
	// Callback
	void onFavSuccess();
	void onFavFailure();

}
