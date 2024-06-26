package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaofeiqingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaofeiqingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaofeiqingdanView;


/**
 * 缴费清单
 *
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface JiaofeiqingdanService extends IService<JiaofeiqingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaofeiqingdanVO> selectListVO(Wrapper<JiaofeiqingdanEntity> wrapper);
   	
   	JiaofeiqingdanVO selectVO(@Param("ew") Wrapper<JiaofeiqingdanEntity> wrapper);
   	
   	List<JiaofeiqingdanView> selectListView(Wrapper<JiaofeiqingdanEntity> wrapper);
   	
   	JiaofeiqingdanView selectView(@Param("ew") Wrapper<JiaofeiqingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaofeiqingdanEntity> wrapper);
   	
}

