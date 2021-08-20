package org.care.mapper;

import org.care.domain.DetailInfo;
import org.care.domain.StoreInfo;
import org.care.dto.DetailDTO;
import org.care.dto.StoreDTO;

public interface StoreMapper {

	public StoreDTO selectByStore(StoreDTO storeDTO);
	
	public void insert(StoreDTO storeDTO);
	
	public void update(StoreDTO storeDTO);
	
	public void changeInfo(StoreInfo sInfo);

	public DetailInfo selectDetail(DetailInfo dInfo);

	public void changeDetail(DetailDTO dto);

}
