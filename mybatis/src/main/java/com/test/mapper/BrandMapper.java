package com.test.mapper;

import com.test.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
   List<Brand> selectALL();

   Brand selectById(int id);
   //条件查询
   //散装参数、对象参数、map参数
   //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param ( "brandName") String brandName);

   //List<Brand> selectByCondition(Brand brand);
   List<Brand> selectByCondition(Map map);
//单条件动态查询
   List<Brand> selectByConditionSingle(Brand brand);
   void add(Brand brand);
   int update(Brand brand);
   void del(int id);
   //批量删除
   void deleteByIds(@Param("ids")int[] ids);
//   MyBatis参数封装:
//*单个参数:
//1.POJ0类型:直接使用，属性名和参数占位符名称一致
//2. Map集合:直接使用，键名和参数占位符名称一致
//3. Collection:封装为Map集合
//map.put( "arg0" , collection集合);
//map . put( "collection" , collection集合);
// 4. List:封装为Map集合
//map . put( "arg0" ,list集合);
//map.put("collection " ,list集合);map. put( "list" ,list集合);
//5.Array:封装为Map集合
//map .put( "arg0",数组);map.put( "array "，数组);
// 6．其他类型:直接使用



}
