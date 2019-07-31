package cn.itsource.taobao.service;

import cn.itsource.basic.util.PageList;
import cn.itsource.taobao.domain.Brand;
import cn.itsource.taobao.query.BrandQuery;
import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandServiceTest {

    @Autowired
    private IBrandService brandService;

    @Test
    public void test(){
        brandService.list().forEach(e->{
            System.out.println(e);
        });
    }

    @Test
    public void testPage(){
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.setKeyword("狼");
        PageList<Brand> pageList = brandService.queryPage(brandQuery);
        pageList.getRows().forEach(e->{
            System.out.println(e);
        });
    }
}