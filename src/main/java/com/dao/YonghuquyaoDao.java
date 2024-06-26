package com.dao;

import com.entity.YonghuquyaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuquyaoVO;
import com.entity.view.YonghuquyaoView;


/**
 * 用户取药
 * 
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YonghuquyaoDao extends BaseMapper<YonghuquyaoEntity> {
	
	List<YonghuquyaoVO> selectListVO(@Param("ew") Wrapper<YonghuquyaoEntity> wrapper);
	
	YonghuquyaoVO selectVO(@Param("ew") Wrapper<YonghuquyaoEntity> wrapper);
	
	List<YonghuquyaoView> selectListView(@Param("ew") Wrapper<YonghuquyaoEntity> wrapper);

	List<YonghuquyaoView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuquyaoEntity> wrapper);
	
	YonghuquyaoView selectView(@Param("ew") Wrapper<YonghuquyaoEntity> wrapper);
	
}
