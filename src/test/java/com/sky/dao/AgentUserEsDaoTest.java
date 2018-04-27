package com.sky.dao;

import com.sky.beans.AgentUserHistory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestServiceApplication.class)
public class AgentUserEsDaoTest {

    @Autowired
    public AgentUserHistoryDao agentUserHistoryDao;

    @Test
    public void createAgentUserHistory(){
        AgentUserHistory auh = new AgentUserHistory();
        auh.setUserId(123l);
        auh.setNicename("nicename");
        agentUserHistoryDao.save(auh);
        agentUserHistoryDao.refresh();
    }
}
