package com.mazouri.ketangpai.service.impl;

import com.mazouri.ketangpai.entity.Course;
import com.mazouri.ketangpai.entity.vo.CourseVO;
import com.mazouri.ketangpai.mapper.CourseMapper;
import com.mazouri.ketangpai.service.CourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mazouri
 * @since 2021-06-13
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Override
    public List<CourseVO> getAllCourseById(String id) {
        return baseMapper.getAllCourseById(id);
    }

    @Override
    public CourseVO getCourseByCourseId(String courseId) {
        return baseMapper.getCourseByCourseId(courseId);
    }
}
