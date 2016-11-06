package com.jvmhub.springboot.controller;

import io.swagger.client.ApiException;
import io.swagger.client.api.UsercontrollerApi;
import io.swagger.client.model.ResponseListUser;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Home {

	private final UsercontrollerApi api = new UsercontrollerApi();

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String index(ModelMap model) {
		try {
			ResponseListUser response = api.getUserListUsingGET();
			model.clear();
			model.addAttribute("response", response);
			System.out.println("=====================" + response);
		} catch (ApiException e) {
			e.printStackTrace();
		}
        return "index";
    }

//	@RequestMapping(value ="/setTest", method = RequestMethod.GET)
//	public String setTest(ModelMap model) {
//
//		try {
//			ResponseListUser response = api.getUserListUsingGET();
//			model.clear();
//			model.addAttribute("response", response);
//		} catch (ApiException e) {
//			e.printStackTrace();
//		}
//		return "index";
//	}
}
