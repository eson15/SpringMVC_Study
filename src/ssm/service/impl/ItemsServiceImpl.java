package ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ssm.mapper.ItemsMapperCustom;
import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;
import ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		
		//通过itemsMapperCustom查询数据库
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}
		
}
