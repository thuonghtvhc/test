package controller.bts;
/*
 * 	thuong.hoang@vhc.com.vn
 * 	create by: 14 - 9 - 2018
 * 
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.bts.Bts_testDAO;


import vo.bts.Bts_test;

@Controller
@RequestMapping("/bts/connect-data/*")
public class BtsDataController {

	@Autowired
	Bts_testDAO btsDao;

	@RequestMapping(value = "list")
	public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		List<Bts_test> btsData = btsDao.selectAll();
		model.addAttribute("btsData", btsData);
		System.out.println("thuonght");
		return "jspbts/databts/listBTS";
	}

	@RequestMapping(value = "delete")
	public @ResponseBody Map<String, Object> delete(Integer id, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> data = new HashMap<String, Object>();
		int row = btsDao.delete(id);
		if (row > 0) {
			data.put("status", "success");

		} else {
			data.put("status", "failed");
			data.put("cause", "delete khong thanh cong!");
		}
		return data;
	}

	// this function isn't full
	@RequestMapping(value = "search")
	public String listSearchName(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		List<Bts_test> btsDatasearch = btsDao.selectAll();
		model.addAttribute("btsData", btsDatasearch);
		System.out.println("thuonght");
		return "jspbts/databts/listBTS";
	}

	@RequestMapping(value = "form")
	public String editAndAdd(ModelMap model, HttpServletRequest request, HttpServletResponse response) {

		if (request.getParameter("id") == null) {
			model.addAttribute("addData", "N");
			return "jspbts/databts/addandEditForm";
		}
		Integer id = -1;
		id = Integer.parseInt(request.getParameter("id"));
		Bts_test bts = id < 0 ? new Bts_test() : btsDao.getBTS(id);
		
		model.addAttribute("addData", "Y");
	
		model.addAttribute("ID", id);
		model.addAttribute("NAME", bts.getName());
		model.addAttribute("TYPE_BTS", bts.getTypeBts());
		model.addAttribute("SYMBOL", bts.getSymbol());
		model.addAttribute("TYPE_TRANSMISSION", bts.getTypeTransmission());
		model.addAttribute("PORT_NUMBER", bts.getPortNumber());

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);

		model.addAttribute("List", list);

		return "jspbts/databts/addandEditForm";
	}

	@RequestMapping(value = "edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {

		Integer id = Integer.parseInt(request.getParameter("id"));
		Bts_test bts = new Bts_test();
		bts.setId(id);
		bts.setName(request.getParameter("bts_name"));
		bts.setTypeBts(Integer.parseInt(request.getParameter("bts_type")));
		bts.setSymbol(request.getParameter("bts_sysbol"));
		bts.setTypeTransmission(Integer.parseInt(request.getParameter("bts_transmission")));
		bts.setPortNumber(Integer.parseInt(request.getParameter("bts_port_number")));

		btsDao.editBTS(bts);
		return "redirect:list.htm";
	}

	@RequestMapping(value = "add")
	public String add(HttpServletRequest request, HttpServletResponse response) {
	
		
		System.out.println("kt");
		Bts_test bts = new Bts_test();
		bts.setName(request.getParameter("bts_name"));
		bts.setTypeBts(Integer.parseInt(request.getParameter("bts_type")));
		bts.setSymbol(request.getParameter("bts_sysbol"));
		bts.setTypeTransmission(Integer.parseInt(request.getParameter("bts_transmission")));
		bts.setPortNumber(Integer.parseInt(request.getParameter("bts_port_number")));

		btsDao.addBTS(bts);
		
		return "redirect:list.htm";
	}
	
}
