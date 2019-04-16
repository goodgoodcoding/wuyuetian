package com.xnt.dhq;

import com.xnt.dhq.model.ShopInfo;
import com.xnt.dhq.service.impl.ShopInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DhqAdminApplicationTests {

	@Autowired
	ShopInfoServiceImpl shopInfoService;

	@Test
	public void test() {
		System.out.println(shopInfoService.selectAll(1,5).size());
	}

}
