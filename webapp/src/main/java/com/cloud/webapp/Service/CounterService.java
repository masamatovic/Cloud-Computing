package com.cloud.webapp.Service;

import com.cloud.webapp.Model.Counter;
import com.cloud.webapp.Repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CounterService {

  //  @Autowired
  //  CounterRepository counterRepository;

    /*public Integer inc(){
        Counter c = counterRepository.findById((long)1).orElse(null);
        if ( c == null){
            Counter counter = new Counter();
            counter.setCount(0);
            counterRepository.save(counter);
            return counter.getCount();
        } else {
            c.setCount(c.getCount()+1);
            counterRepository.save(c);
            return c.getCount();
        }

    }*/
}
