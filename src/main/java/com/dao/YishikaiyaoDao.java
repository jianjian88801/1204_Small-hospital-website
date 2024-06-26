package com.dao;

import com.entity.YishikaiyaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishikaiyaoVO;
import com.entity.view.YishikaiyaoView;


/**
 * 医师开药
 * 
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YishikaiyaoDao extends BaseMapper<YishikaiyaoEntity> {
	
	List<YishikaiyaoVO> selectListVO(@Param("ew") Wrapper<YishikaiyaoEntity> wrapper);
	
	YishikaiyaoVO selectVO(@Param("ew") Wrapper<YishikaiyaoEntity> wrapper);
	
	List<YishikaiyaoView> selectListView(@Param("ew") Wrapper<YishikaiyaoEntity> wrapper);

	List<YishikaiyaoView> selectListView(Pagination page,@Param("ew") Wrapper<YishikaiyaoEntity> wrapper);
	
	YishikaiyaoView selectView(@Param("ew") Wrapper<YishikaiyaoEntity> wrapper);
	
}
