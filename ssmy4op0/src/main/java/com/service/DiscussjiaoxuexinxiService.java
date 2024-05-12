package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoxuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoxuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoxuexinxiView;


/**
 * 教学信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-03 11:19:32
 */
public interface DiscussjiaoxuexinxiService extends IService<DiscussjiaoxuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoxuexinxiVO> selectListVO(Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
   	
   	DiscussjiaoxuexinxiVO selectVO(@Param("ew") Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
   	
   	List<DiscussjiaoxuexinxiView> selectListView(Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
   	
   	DiscussjiaoxuexinxiView selectView(@Param("ew") Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
   	

}

