package pkuhit.iih.ass.lab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pkuhit.xap.ass.LabReportItem;
import xap.sv.model.ArrayResult;
import xap.sv.servlet.mvc.annotation.RequestParam;

public interface LabRepItemService {
	
	/**
	 *  【检验报告项目】查询服务（多记录）
	 * @param  LabReportItemService condition
	 * @return List<LabReportItem>
	 * @
	 */
	@RequestMapping(value = "/lab/rep/report/items", method = RequestMethod.GET)
	ArrayResult<LabReportItem> search(@RequestParam("labRpPk") String labRpPk,@RequestParam("currentPageIndex") String currentPageIndex ,@RequestParam("pageSize") String pageSize) ;
}
