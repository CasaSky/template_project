package com.casasky.earth_ws.service;


import javax.persistence.EntityManager;

import com.casasky.core.service.TemplateBaseService;
import org.springframework.stereotype.Service;


@Service
public class EarthlingService extends TemplateBaseService {

    public EarthlingService(EntityManager em) {
        super(em);
    }

}
