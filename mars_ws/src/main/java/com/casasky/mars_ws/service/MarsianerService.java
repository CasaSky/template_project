package com.casasky.mars_ws.service;


import javax.persistence.EntityManager;

import com.casasky.core.service.TemplateBaseService;
import org.springframework.stereotype.Service;


@Service
public class MarsianerService extends TemplateBaseService {

    public MarsianerService(EntityManager em) {
        super(em);
    }

}
