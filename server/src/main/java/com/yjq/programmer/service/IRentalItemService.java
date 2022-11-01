package com.yjq.programmer.service;

import com.yjq.programmer.dto.RentalItemDTO;
import com.yjq.programmer.dto.ResponseDTO;

import java.util.List;


public interface IRentalItemService {

    // 保存租赁详情信息
    ResponseDTO<Boolean> saveRentalItem(RentalItemDTO rentalItemDTO);

    // 获取租赁详情数据
    ResponseDTO<List<RentalItemDTO>> getRentalItemList(RentalItemDTO rentalItemDTO);

    // 删除租赁详情数据
    ResponseDTO<Boolean> deleteRentalItem(RentalItemDTO rentalItemDTO);
}
