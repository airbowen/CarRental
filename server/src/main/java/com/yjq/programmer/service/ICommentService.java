package com.yjq.programmer.service;

import com.yjq.programmer.dto.CommentDTO;
import com.yjq.programmer.dto.PageDTO;
import com.yjq.programmer.dto.ResponseDTO;

import java.util.List;


public interface ICommentService {

    // 评价租赁体验
    ResponseDTO<Boolean> addComment(CommentDTO commentDTO);

    // 删除评价信息
    ResponseDTO<Boolean> deleteComment(CommentDTO commentDTO);

    // 分页获取评价信息
    ResponseDTO<PageDTO<CommentDTO>> getCommentList(PageDTO<CommentDTO> pageDTO);

    // 根据汽车查看评价信息
    ResponseDTO<List<CommentDTO>> viewCommentListByCarId(CommentDTO commentDTO);

    // 统计评价总数
    ResponseDTO<Integer> totalComment();
}
