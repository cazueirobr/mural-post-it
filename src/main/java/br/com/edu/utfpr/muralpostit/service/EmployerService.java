package br.com.edu.utfpr.muralpostit.service;

import br.com.edu.utfpr.muralpostit.model.dao.EmployerDAO;
import br.com.edu.utfpr.muralpostit.model.domain.Employer;

public class EmployerService extends AbstractService<Long, Employer>{

    public EmployerService() {
        dao = new EmployerDAO();
    }


}