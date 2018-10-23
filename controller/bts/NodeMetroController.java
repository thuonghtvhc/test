package controller.bts;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.bts.BtsMetroDAO;
import vo.bts.BtsMetro;


/*
 * 	thuong.hoang@vhc.com.vn
 * 	create by: 20 - 9 - 2018
 * 
 * */

@Controller
@RequestMapping("/bts/node-mang-metro/*")
public class NodeMetroController {

	@Autowired
	BtsMetroDAO btsmetrodao;
	
	@RequestMapping(value = "list")
	public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
		List<BtsMetro> metroData = btsmetrodao.getALL();
		model.addAttribute("metroData", metroData);
		System.out.println("thuonght");
		return "jspbts/formNodeMangMetro/nodeMangMetro";
	}

}
