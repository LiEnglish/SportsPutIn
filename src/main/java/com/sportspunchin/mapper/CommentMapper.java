package com.sportspunchin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sportspunchin.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
