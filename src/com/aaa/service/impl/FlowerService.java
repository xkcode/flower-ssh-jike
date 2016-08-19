package com.aaa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.aaa.dao.IFlowerDao;
import com.aaa.model.Flower;
import com.aaa.service.IFlowerService;

/**
 * flower的service层实现类
 */
public class FlowerService implements IFlowerService{

	private IFlowerDao flowerDao;
	
	public IFlowerDao getFlowerDao() {
		return flowerDao;
	}

	public void setFlowerDao(IFlowerDao flowerDao) {
		this.flowerDao = flowerDao;
	}

	/**
	 * 获取最新上架的四款鲜花
	 */
	@Override
	public List<Flower> getNewFlowers() {
		List<Flower> flowers = flowerDao.getNewFlowers();
		return flowers;
	}

}