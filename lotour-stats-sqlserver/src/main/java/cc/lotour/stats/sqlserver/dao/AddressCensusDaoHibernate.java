package cc.lotour.stats.sqlserver.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cc.lotour.stats.sqlserver.AddressCensusDao;
import cc.lotour.stats.sqlserver.mapping.AddressCensus;


@Repository("addressCensus")
public class AddressCensusDaoHibernate extends BaseDaoHibernate<AddressCensus> 
		implements AddressCensusDao{

	@Override
	public List<AddressCensus> getAddressCensuses(String chName) {
		String hql = "from AddressCensus where chName = '" +chName+ "'";
		return this.list(hql);
	}

	@Override
	public List<AddressCensus> getAddressCensuses() {
		String hql = "from AddressCensus ";
		return this.list(hql);
	}

}
