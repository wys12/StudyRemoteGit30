package com.yc.taokefu.mapper;

import java.util.List;

import com.yc.taokefu.entity.Job;
/**
 * 职位信息
 * @author wys
 *
 */
public interface JobMapper {

	List<Job> jobFind(Job job);

	Integer jobAdd(Job job);

}
