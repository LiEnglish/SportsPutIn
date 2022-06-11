package com.sportspunchin.Service;


import com.sportspunchin.mapper.CommentMapper;
import com.sportspunchin.pojo.Comment;
import com.sportspunchin.pojo.PEPlan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommentServiceImpl implements CommentService{
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findmyAllcomment() {
        return commentMapper.selectList(null);
    }

    public boolean deleteComment(Integer id){
        int i = commentMapper.deleteById(id);
        if (i>0){
            return true;
        }else{
            return false;
        }
    }


}
