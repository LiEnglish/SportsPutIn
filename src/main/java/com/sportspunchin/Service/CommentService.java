package com.sportspunchin.Service;


import com.sportspunchin.pojo.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    List<Comment> findmyAllcomment();

}
