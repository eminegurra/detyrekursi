package RandomNumberGenerator;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

	@RequestMapping("/")
	public int index() {
//		String style = "\"color:white;font-size:10rem;position: absolute; top: 30%;left: 50%;-moz-transform: translateX(-50%) translateY(-50%);-webkit-transform: translateX(-50%) translateY(-50%);transform: translateX(-50%) translateY(-50%);\"";
//		return "<!doctypehtml><html><head><title>RandomNumber</title></head><body style=\"background:black\"><h1 style="
//				+ style + ">" + new Random().nextInt(1000001) + "</h1></body></html>";

		return new Random().nextInt(1000001);
	}
}
