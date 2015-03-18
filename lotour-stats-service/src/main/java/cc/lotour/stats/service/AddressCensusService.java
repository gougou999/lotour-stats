package cc.lotour.stats.service;

import java.util.List;

import cc.lotour.stats.sqlserver.mapping.AddressCensus;

public interface AddressCensusService {
	
	public List<AddressCensus> getAddressCensusList(String chName);
	
	public List<AddressCensus> getAddressCensusList();
	
}
