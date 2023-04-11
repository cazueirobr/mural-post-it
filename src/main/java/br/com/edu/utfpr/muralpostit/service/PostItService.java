package br.com.edu.utfpr.muralpostit.service;

import br.com.edu.utfpr.muralpostit.model.dao.PostItDAO;
import br.com.edu.utfpr.muralpostit.model.domain.PostIt;

public class PostItService extends AbstractService<Long, PostIt>{

    public PostItService() {
        dao = new PostItDAO();
    }


}