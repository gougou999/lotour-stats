package cc.lotour.stats.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.lotour.stats.service.AddressCensusService;
import cc.lotour.stats.sqlserver.AddressCensusDao;
import cc.lotour.stats.sqlserver.mapping.AddressCensus;

@Service("addressCensusService")
public class AddressCensusServiceImpl implements AddressCensusService{

	@Resource
	private AddressCensusDao addressCensusDao;
	
	@Override
	public List<AddressCensus> getAddressCensusList(String chName) {
		return addressCensusDao.getAddressCensuses(chName);
	}

	@Override
	public List<AddressCensus> getAddressCensusList() {
		return addressCensusDao.getAddressCensuses();
	}

}
