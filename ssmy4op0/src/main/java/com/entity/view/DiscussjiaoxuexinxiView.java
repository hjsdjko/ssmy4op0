package com.entity.view;

import com.entity.DiscussjiaoxuexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教学信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-03 11:19:32
 */
@TableName("discussjiaoxuexinxi")
public class DiscussjiaoxuexinxiView  extends DiscussjiaoxuexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiaoxuexinxiView(){
	}
 
 	public DiscussjiaoxuexinxiView(DiscussjiaoxuexinxiEntity discussjiaoxuexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiaoxuexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
