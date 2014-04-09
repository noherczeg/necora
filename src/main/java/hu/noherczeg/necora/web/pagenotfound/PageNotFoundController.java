package hu.noherczeg.necora.web.pagenotfound;

import hu.noherczeg.necora.web.DetailedMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
class PageNotFoundController {

	@RequestMapping(value = "/pagenotfound", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public DetailedMessageDTO processPageNotFoundError() {
		return new DetailedMessageDTO(HttpStatus.NOT_FOUND.value(), "Not Found", null, "The requested page could not be found!");
	}

}
