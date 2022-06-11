package com.sportspunchin.Controller;



import com.sportspunchin.mapper.CommentMapper;
import com.sportspunchin.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/comment")
@RestController
public class CommentController {
    @Autowired
    private CommentMapper commentMapper;


    @GetMapping("/findmyAllcomment")
    public List<Comment> findmyAllcomment(){
        return commentMapper.selectList(null);
    }

    //根据ID查
    public void Selectbuid(@PathVariable("comid") Integer comid){
        Comment comment = commentMapper.selectById(comid);
    }

    //删
    @DeleteMapping("/deleteComment/{comid}")
    public void deleteComment(@PathVariable("comid") Integer comid){
        commentMapper.deleteById(comid);
    }


}
