package com.sportspunchin.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "comment")
public class Comment {

    @TableId(value = "comid", type = IdType.AUTO)
    private long comid;

    private String username;
    private String comclass;
    private String comcoach;
    private String comments;
}
