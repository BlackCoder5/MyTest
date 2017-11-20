/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: liyang[li_yang@suixingpay.com]
 * @date: 2017年10月25日 上午10:09:22
 * @Copyright ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.core.service.impl;

import com.Service.UserService;
import com.domain.User;
import com.suixingpay.common.core.orm.cache.support.CacheKey;
import com.suixingpay.core.orm.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by gz on 2017/11/7
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.save(user);
    }


    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public void delete(String s) {
        userMapper.delete(s);
    }

    @Override
    public void deleteAll(List<String> list) {
        userMapper.deleteAll(list);
    }

    @Override
    public User findOne(String s) {
        return userMapper.findOne(s);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findAll(List<String> list) {
        return userMapper.findAll();
    }

    @Override
    public List<User> find(User user) {
        return userMapper.find(user);
    }

    @Override
    public <O extends Number> O count(User user) {
        return null;
    }

    @Override
    public void flush(CacheKey cacheKey) {

    }

    @Override
    public void flushAll() {

    }

    @Override
    public String getCacheGroup() {
        return null;
    }
}
