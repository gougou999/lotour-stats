package cc.lotour.stats.sqlserver;

import java.util.List;

import cc.lotour.stats.sqlserver.mapping.CookieInfo;

public interface CookieInfoDao {
	
	public List<CookieInfo> getUserDataList();
	
	public List<CookieInfo> getUserData(String cookieId);
	
	public List<CookieInfo> getUserData(String currentUrl, String dateSeq);
	
}
