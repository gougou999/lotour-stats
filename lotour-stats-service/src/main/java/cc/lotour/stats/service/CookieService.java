package cc.lotour.stats.service;

import java.util.List;

import cc.lotour.stats.sqlserver.mapping.CookieInfo;

public interface CookieService {
	  
	public List<CookieInfo> getUserDataList();
	
	public List<CookieInfo> getUserData(String cookieId);
	
	public List<CookieInfo> getUserData(String currentUrl, String dateSeq);
	
	public String test();
	
}
