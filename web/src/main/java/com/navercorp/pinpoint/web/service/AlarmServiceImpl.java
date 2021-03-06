/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navercorp.pinpoint.web.alarm.vo.Rule;
import com.navercorp.pinpoint.web.dao.AlarmDao;

/**
 * @author minwoo.jung
 */
@Service
public class AlarmServiceImpl implements AlarmService {

    @Autowired
    AlarmDao alarmDao;
    
    @Override
    public String insertRule(Rule rule) {
        return alarmDao.insertRule(rule);
        
    }

    @Override
    public void deleteRule(Rule rule) {
        alarmDao.deleteRule(rule);
    }

    @Override
    public List<Rule> selectRuleByUserGroupId(String userGroupId) {
        return alarmDao.selectRuleByUserGroupId(userGroupId);
    }

    @Override
    public List<Rule> selectRuleByApplicationId(String applicationId) {
        return alarmDao.selectRuleByApplicationId(applicationId);
    }

    @Override
    public void updateRule(Rule rule) {
        alarmDao.updateRule(rule);
    }


}
