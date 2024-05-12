package com.dao;

import com.entity.DiscussjiaoxuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaoxuexinxiVO;
import com.entity.view.DiscussjiaoxuexinxiView;


/**
 * 教学信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-03 11:19:32
 */
public interface DiscussjiaoxuexinxiDao extends BaseMapper<DiscussjiaoxuexinxiEntity> {
	
	List<DiscussjiaoxuexinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
	
	DiscussjiaoxuexinxiVO selectVO(@Param("ew") Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
	
	List<DiscussjiaoxuexinxiView> selectListView(@Param("ew") Wrapper<DiscussjiaoxuexinxiEntity> wrapper);

	List<DiscussjiaoxuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
	
	DiscussjiaoxuexinxiView selectView(@Param("ew") Wrapper<DiscussjiaoxuexinxiEntity> wrapper);
	

}
