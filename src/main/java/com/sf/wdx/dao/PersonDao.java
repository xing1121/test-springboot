package com.sf.wdx.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sf.wdx.domain.Person;

/**
 * 描述：PersonDao
 * @author 80002888
 * @date   2018年8月29日
 */
public interface PersonDao {

	/**
	 * 插入一条数据
	 *	@ReturnType	void 
	 *	@Date	2018年8月29日	下午5:12:31
	 *  @Param
	 */
	@Insert(value="insert into person(name, age, email) values (#{name}, #{age}, #{email})")
	public void insert(Person person);
	
	/**
	 * 按照id删除
	 *	@ReturnType	void 
	 *	@Date	2018年8月29日	下午5:16:43
	 *  @Param  @param id
	 */
	@Delete(value="delete from person where id = #{id}")
	
	public void deleteById(Long id);
	/**
	 * 按照id更新
	 *	@ReturnType	void 
	 *	@Date	2018年8月29日	下午5:16:04
	 *  @Param  @param person
	 */
	@Update(value="update person set name = #{name}, age = #{age}, email = #{email} where id = #{id}")
	
	public void updateById(Person person);
	/**
	 * 按照id查询
	 *	@ReturnType	Person 
	 *	@Date	2018年8月29日	下午5:12:26
	 *  @Param  @return
	 */
	@Select(value="select * from person where id = #{id}")
	public Person selectById(Long id);
	
}
