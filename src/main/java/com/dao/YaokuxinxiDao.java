package com.dao;

import com.entity.YaokuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaokuxinxiVO;
import com.entity.view.YaokuxinxiView;


/**
 * 药库信息
 * 
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YaokuxinxiDao extends BaseMapper<YaokuxinxiEntity> {
	
	List<YaokuxinxiVO> selectListVO(@Param("ew") Wrapper<YaokuxinxiEntity> wrapper);
	
	YaokuxinxiVO selectVO(@Param("ew") Wrapper<YaokuxinxiEntity> wrapper);
	
	List<YaokuxinxiView> selectListView(@Param("ew") Wrapper<YaokuxinxiEntity> wrapper);

	List<YaokuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YaokuxinxiEntity> wrapper);
	
	YaokuxinxiView selectView(@Param("ew") Wrapper<YaokuxinxiEntity> wrapper);
	
}
