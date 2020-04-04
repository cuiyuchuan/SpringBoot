package cn.cych.service.impl;


import cn.cych.dao.ItemsDao;
import cn.cych.domains.Items;
import cn.cych.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;


    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
