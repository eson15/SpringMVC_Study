package ssm.service;

import java.util.List;

import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;

public interface ItemsService {
	
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
}
