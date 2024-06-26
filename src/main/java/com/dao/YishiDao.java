package com.dao;

import com.entity.YishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishiVO;
import com.entity.view.YishiView;


/**
 * 医师
 * 
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YishiDao extends BaseMapper<YishiEntity> {
	
	List<YishiVO> selectListVO(@Param("ew") Wrapper<YishiEntity> wrapper);
	
	YishiVO selectVO(@Param("ew") Wrapper<YishiEntity> wrapper);
	
	List<YishiView> selectListView(@Param("ew") Wrapper<YishiEntity> wrapper);

	List<YishiView> selectListView(Pagination page,@Param("ew") Wrapper<YishiEntity> wrapper);
	
	YishiView selectView(@Param("ew") Wrapper<YishiEntity> wrapper);
	
}
