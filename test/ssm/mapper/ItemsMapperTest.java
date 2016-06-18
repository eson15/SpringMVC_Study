package ssm.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ssm.po.Items;

public class ItemsMapperTest {

	ApplicationContext applicationContext = null;
	@Before
	public void setUp() throws Exception {
		
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	}

	@Test
	public void testSelectByPrimaryKey() {
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
		Items items = itemsMapper.selectByPrimaryKey(1);
		System.out.println(items);
	}

}
