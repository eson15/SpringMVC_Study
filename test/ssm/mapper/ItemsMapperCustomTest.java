package ssm.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;

public class ItemsMapperCustomTest {

	ApplicationContext applicationContext = null;
	@Before
	public void setUp() throws Exception {
		
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	}


	@Test
	public void testFindItemsList() throws Exception {
		ItemsMapperCustom itemsMapper = (ItemsMapperCustom) applicationContext.getBean("itemsMapperCustom");
		
		ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
		ItemsCustom itemsCustom = new ItemsCustom();
		itemsCustom.setName("ÊÖ»ú");
		itemsQueryVo.setItemsCustom(itemsCustom);
		
		
		List<ItemsCustom> itemsCustomList = itemsMapper.findItemsList(itemsQueryVo);
		System.out.println(itemsCustomList);
	}

}
