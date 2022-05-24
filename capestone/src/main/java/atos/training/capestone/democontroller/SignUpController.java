package atos.training.capestone.democontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atos.training.capestone.demomodel.SignUpModel;
import atos.training.capestone.demorepo.SignUpRepo;
@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class SignUpController {

@Autowired
private SignUpRepo signuprepo;


@PostMapping("/signuprepo")
public SignUpModel createRegister( @RequestBody SignUpModel regi) {
	return signuprepo.save(regi);
}
	}


