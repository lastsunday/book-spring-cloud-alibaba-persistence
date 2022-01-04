package com.github.lastsunday.cloud.service.impl;

import com.github.lastsunday.cloud.service.PersistenceService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "persistence",version = "1.0.0")
public class PersistenceServiceImpl implements PersistenceService {
    @Override
    public String persistenceTest() {
        return "persistenceTest success";
    }
}
