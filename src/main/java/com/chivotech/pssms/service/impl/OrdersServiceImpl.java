package com.chivotech.pssms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chivotech.pssms.entity.Orders;
import com.chivotech.pssms.service.OrdersService;
import com.chivotech.pssms.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【orders】的数据库操作Service实现
* @createDate 2024-08-27 14:50:19
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




