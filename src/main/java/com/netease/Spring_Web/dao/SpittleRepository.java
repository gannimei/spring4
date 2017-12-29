package com.netease.Spring_Web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.netease.Spring_Web.bean.Spittle;

public interface SpittleRepository {

	@Select("select * from spittle where id<=#{max} limit #{count}")
	public List<Spittle> findSpittles(@Param("max") long max,@Param("count") int count);
	
}
