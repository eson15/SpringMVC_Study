package ssm.mapper;

import java.util.List;

import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;

public interface ItemsMapperCustom {

	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
