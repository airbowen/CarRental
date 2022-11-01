package com.yjq.programmer.service;

import com.yjq.programmer.dto.PageDTO;
import com.yjq.programmer.dto.RentalDTO;
import com.yjq.programmer.dto.ResponseDTO;

import java.util.List;


public interface IRentalService {

    // 保存租赁信息
    ResponseDTO<Boolean> saveRental(RentalDTO rentalDTO);

    // 分页获取租赁数据
    ResponseDTO<PageDTO<RentalDTO>> getRentalList(PageDTO<RentalDTO> pageDTO);

    // 审核租赁信息
    ResponseDTO<Boolean> replyRental(RentalDTO rentalDTO);

    // 删除租赁信息
    ResponseDTO<Boolean> deleteRental(RentalDTO rentalDTO);

    // 统计租赁总数
    ResponseDTO<Integer> totalRental();

    // 根据时间范围和租赁状态获取交易完成的租赁总数
    ResponseDTO<List<Integer>> getRentalTotalByDateAndState();
}
