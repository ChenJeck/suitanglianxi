package com.test;

import com.test.mapper.BrandMapper;
import com.test.mapper.UserMapper;
import com.test.pojo.Brand;
import com.test.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    @Test
    public void  testSelectALL() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectALL();
        System.out.println(brands);
        sqlSession.close();

    }


    @Test
    public void  testSelectById() throws IOException {

        int id=1;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
       Brand brand = brandMapper.selectById(id);
       System.out.println(brand);
        sqlSession.close();

    }
    @Test
    public void  testSelectByCondition() throws IOException {

        int status=1;
        String companyName="华为";
        String brandName="华为";
        //处理参数
        companyName="%"+companyName+"%";
        brandName="%"+brandName+"%";
        //封装对象
//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
        Map map = new HashMap();
        map.put( "status" , status);
        map.put("companyName" , companyName) ;
        //map.put("brandName" , brandName);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands=brandMapper.selectByCondition(status,companyName,brandName);
        List<Brand> brands=brandMapper.selectByCondition(map);
        System.out.println(brands);
        sqlSession.close();

    }
    @Test
    public void  testSelectByConditionSingle() throws IOException {

        int status=1;
        String companyName="华为";
        String brandName="华为";
        //处理参数
        companyName="%"+companyName+"%";
        brandName="%"+brandName+"%";
        //封装对象
        Brand brand = new Brand();
        //brand.setStatus(status);
        //brand.setCompanyName(companyName);
        //brand.setBrandName(brandName);
//        Map map = new HashMap();
//        map.put( "status" , status);
//        map.put("companyName" , companyName) ;
//        map.put("brandName" , brandName);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands=brandMapper.selectByConditionSingle(brand);
       // List<Brand> brands=brandMapper.selectByCondition(map);
        System.out.println(brands);
        sqlSession.close();

    }
    @Test
    public void  add() throws IOException {

        int status=1;
        String companyName="波导手机";
        String brandName="波导";
        String description="波导手机";
        int ordered = 100;

        //处理参数
        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
//        Map map = new HashMap();
//        map.put( "status" , status);
//        map.put("companyName" , companyName) ;
//        map.put("brandName" , brandName);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.add(brand);
        //提交事务
        sqlSession.commit();
        // List<Brand> brands=brandMapper.selectByCondition(map);
        System.out.println(brand);
        sqlSession.close();

    }
    @Test
    public void  add2() throws IOException {

        int status=1;
        String companyName="波导手机";
        String brandName="波导";
        String description="波导手机";
        int ordered = 100;

        //处理参数
        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
//        Map map = new HashMap();
//        map.put( "status" , status);
//        map.put("companyName" , companyName) ;
//        map.put("brandName" , brandName);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.add(brand);
        //提交事务
        sqlSession.commit();
        // List<Brand> brands=brandMapper.selectByCondition(map);
        System.out.println(brand);
        int id= brand.getId();
        System.out.println(id);
        sqlSession.close();

    }
    @Test
    public void  testUpdate() throws IOException {

        int status=3;
        String companyName="波导手机";
        String brandName="波导";
        String description="波导手机，123";
        int ordered = 300;
        int id=7;

        //处理参数
        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);
        brand.setId(id);
//        Map map = new HashMap();
//        map.put( "status" , status);
//        map.put("companyName" , companyName) ;
//        map.put("brandName" , brandName);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.update(brand);
        //提交事务
        sqlSession.commit();
        // List<Brand> brands=brandMapper.selectByCondition(map);
        System.out.println(brand);
        //int id= brand.getId();
        System.out.println(id);
        sqlSession.close();

    }
    @Test
    public void  del() throws IOException {

//        int status=3;
//        String companyName="波导手机";
//        String brandName="波导";
//        String description="波导手机，123";
//        int ordered = 300;
        int id=7;

        //处理参数
        //封装对象
        Brand brand = new Brand();
       // brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);
        brand.setId(id);
//        Map map = new HashMap();
//        map.put( "status" , status);
//        map.put("companyName" , companyName) ;
//        map.put("brandName" , brandName);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.del(id);
        //提交事务
        sqlSession.commit();
        // List<Brand> brands=brandMapper.selectByCondition(map);
        System.out.println(brand);
        //int id= brand.getId();
        System.out.println(id);
        sqlSession.close();

    }
    @Test
    public void  dels() throws IOException {

//        int status=3;
//        String companyName="波导手机";
//        String brandName="波导";
//        String description="波导手机，123";
//        int ordered = 300;
        int[] ids={2,3,6};

        //处理参数
        //封装对象
        Brand brand = new Brand();
        // brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);
        //brand.setId(id);
//        Map map = new HashMap();
//        map.put( "status" , status);
//        map.put("companyName" , companyName) ;
//        map.put("brandName" , brandName);


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        //获取接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.deleteByIds(ids);
        //提交事务
        sqlSession.commit();
        // List<Brand> brands=brandMapper.selectByCondition(map);
        System.out.println(brand);
        //int id= brand.getId();
        System.out.println(ids);
        sqlSession.close();

    }
    @Test
    public void  testselectbyid() throws IOException {


//       1：获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//       2：获取sqlSession对象
        SqlSession sqlSession  = sqlSessionFactory.openSession();
        // List<User> users = sqlSession.selectList("test.selectALL");
        // 3：获取接口代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//        4：执行方法
        User user=userMapper.selectById(1);
        System.out.println(user);
        //提交事务
       // sqlSession.commit();
        // List<Brand> brands=brandMapper.selectByCondition(map);

        sqlSession.close();

    }
}
