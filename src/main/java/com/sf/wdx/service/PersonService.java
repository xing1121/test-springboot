package com.sf.wdx.service;

import com.sf.wdx.domain.Person;

/**
 * 描述：PersonService
 * @author 80002888
 * @date   2018年8月29日
 */
public interface PersonService {

	/**
	 * 保存
	 *	@ReturnType	void 
	 *	@Date	2018年8月29日	下午5:26:19
	 *  @Param  @param person
	 */
	public void insert(Person person);

	/**
	 * 根据id删除
	 *	@ReturnType	void 
	 *	@Date	2018年8月29日	下午5:26:57
	 *  @Param  @param id
	 */
	public void deleteById(Long id);
	
	/**
	 * 根据id更新
	 *	@ReturnType	void 
	 *	@Date	2018年8月29日	下午5:27:23
	 *  @Param  @param person
	 */
	public void updateById(Person person);
	
	/**
	 * 根据id查询
	 *	@ReturnType	Person 
	 *	@Date	2018年8月29日	下午5:26:40
	 *  @Param  @param id
	 *  @Param  @return
	 */
	public Person selectById(Long id);

	
}