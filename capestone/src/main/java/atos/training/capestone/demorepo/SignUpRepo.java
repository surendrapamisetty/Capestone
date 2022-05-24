package atos.training.capestone.demorepo;

import org.springframework.data.jpa.repository.JpaRepository;

import atos.training.capestone.demomodel.SignUpModel;

public interface SignUpRepo extends JpaRepository<SignUpModel ,Integer> {

}
