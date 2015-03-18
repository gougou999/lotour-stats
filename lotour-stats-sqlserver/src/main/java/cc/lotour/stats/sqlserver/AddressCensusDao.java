package cc.lotour.stats.sqlserver;

import java.util.List;

import cc.lotour.stats.sqlserver.mapping.AddressCensus;


public interface AddressCensusDao {
	
	public List<AddressCensus> getAddressCensuses(String chName);
	
	public List<AddressCensus> getAddressCensuses();
	
}
