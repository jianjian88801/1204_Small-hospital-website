package com.dao;

import com.entity.JiaofeiqingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaofeiqingdanVO;
import com.entity.view.JiaofeiqingdanView;


/**
 * 缴费清单
 * 
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface JiaofeiqingdanDao extends BaseMapper<JiaofeiqingdanEntity> {
	
	List<JiaofeiqingdanVO> selectListVO(@Param("ew") Wrapper<JiaofeiqingdanEntity> wrapper);
	
	JiaofeiqingdanVO selectVO(@Param("ew") Wrapper<JiaofeiqingdanEntity> wrapper);
	
	List<JiaofeiqingdanView> selectListView(@Param("ew") Wrapper<JiaofeiqingdanEntity> wrapper);

	List<JiaofeiqingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaofeiqingdanEntity> wrapper);
	
	JiaofeiqingdanView selectView(@Param("ew") Wrapper<JiaofeiqingdanEntity> wrapper);
	
}
