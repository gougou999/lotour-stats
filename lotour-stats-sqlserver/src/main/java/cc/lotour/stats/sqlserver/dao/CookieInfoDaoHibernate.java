package cc.lotour.stats.sqlserver.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cc.lotour.stats.sqlserver.CookieInfoDao;
import cc.lotour.stats.sqlserver.mapping.CookieInfo;

@Repository("cookieInfoDao")
public class CookieInfoDaoHibernate extends BaseDaoHibernate<CookieInfo> 
			implements CookieInfoDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CookieInfo> getUserDataList() {
		String hql = "from CookieInfo";
		Session session = this.getSession();
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(100);
		List<CookieInfo> list = query.list();
		session.close();
		return list;
	}

	@Override
	public List<CookieInfo> getUserData(String cookieId) {
		String hql = "from CookieInfo where cookieId = '" + cookieId + "'";
		return this.list(hql);
	}

	@Override
	public List<CookieInfo> getUserData(String currentUrl, String dateSeq) {
		String hql = "from CookieInfo where currentUrl = '" + currentUrl + "' and dateSeq = '" + dateSeq + "'";
		return this.list(hql);
	}
	
	
}
