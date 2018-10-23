package controller.bts;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 	thuong.hoang@vhc.com.vn
 * 	create by: 20 - 9 - 2018
 * 
 * */

import vo.bts.BtsMetro;

@Controller
@RequestMapping("/bts/baocao-slcb-Metro-theo-thietbi/*")
public class BaoCaoslcbMetroTheoThietBiController {

	@RequestMapping(value = "list")
	public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
		List<BtsMetro> MDmetroData = null;
		model.addAttribute("MatDienMetroData", MDmetroData);
		System.out.println("thuonght");
		return "jspbts/formNodeMangMetro/BaoCaoslcbMetroTheoThietBi";
	}

}
