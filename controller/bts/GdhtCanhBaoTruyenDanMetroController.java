package controller.bts;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.bts.BtsMetro;

@Controller
@RequestMapping("/bts/canh-bao-truyen-dan-Metro/*")
public class GdhtCanhBaoTruyenDanMetroController {

	@RequestMapping(value = "list")
	public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
		List<BtsMetro> data = null;
		model.addAttribute("data", data);
		model.addAttribute("center", "TTNOC");
		System.out.println("thuonght");
		return "jspbts/qlCanhBaoTruyenDanMetro/viewCanhBaoTruyenDanMeTro";
	}

	
}
