package com.squaretrade.acme.server.wfe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class DictionaryEndpoint {

    @RequestMapping(value = "/dictionary", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public Object getDictionary() {
        return new Date();
    }
}
