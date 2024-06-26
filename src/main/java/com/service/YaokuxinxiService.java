package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaokuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaokuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaokuxinxiView;


/**
 * 药库信息
 *
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
public interface YaokuxinxiService extends IService<YaokuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaokuxinxiVO> selectListVO(Wrapper<YaokuxinxiEntity> wrapper);
   	
   	YaokuxinxiVO selectVO(@Param("ew") Wrapper<YaokuxinxiEntity> wrapper);
   	
   	List<YaokuxinxiView> selectListView(Wrapper<YaokuxinxiEntity> wrapper);
   	
   	YaokuxinxiView selectView(@Param("ew") Wrapper<YaokuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaokuxinxiEntity> wrapper);
   	
}

