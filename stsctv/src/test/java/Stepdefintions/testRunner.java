package Stepdefintions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Feature/subcription.feature",glue={"Stepdefintions"},
monochrome=true,
plugin= {"pretty","html:target/Htmlreports"}

		)
public class testRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
