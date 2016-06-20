package ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import ssm.mapper.ItemsMapper;
import ssm.mapper.ItemsMapperCustom;
import ssm.po.Items;
import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;
import ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;

	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {

		// 通过itemsMapperCustom查询数据库
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	@Override
	public ItemsCustom findItemsById(Integer id) throws Exception {

		// 通过id查询items信息
		Items items = itemsMapper.selectByPrimaryKey(id);
		// 这里根据实际情况，对商品信息进行业务处理
		// ....
		// 返回扩展类ItemsCustom
		ItemsCustom itemsCustom = new ItemsCustom();
		// 将items的属性拷贝到itemsCustom
		BeanUtils.copyProperties(items, itemsCustom);

		return itemsCustom;
	}

	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom)
			throws Exception {
		// 添加业务校验，通常在service接口对关键参数进行校验
		// 校验 id是否为空，如果为空抛出异常

		// 更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新items表中所有字段，包括 大文本类型字段
		// updateByPrimaryKeyWithBLOBs要求必须转入id
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
	}

}
