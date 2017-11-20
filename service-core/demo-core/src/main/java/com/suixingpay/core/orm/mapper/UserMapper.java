/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: liyang[li_yang@suixingpay.com] 
 * @date: 2017-10-31 16:25:47  
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.core.orm.mapper;


import com.domain.User;
import com.suixingpay.common.core.orm.dao.GenericDao;
import org.springframework.stereotype.Repository;


/**
 * Created by gz on 2017/11/7
 */
@Repository
public interface UserMapper extends GenericDao<User, String> {

}