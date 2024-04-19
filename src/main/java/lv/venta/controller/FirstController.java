package lv.venta.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lv.venta.model.Product;


@Controller
public class FirstController {
	@GetMapping("/hello")
	public String getHello() {
		System.out.println("First Controller wokrs");
		return "hello-page";
	}
	Random rand = new Random();
	@GetMapping("/hello/msg")
	public String getHelloMsg(Model model) {
		model.addAttribute("mydata", "Zina no Martina "+ rand.nextInt(0,100));
		return "hello-msg-page";
	}
	@GetMapping("/product/test")
	public String getProductTest (Model model) {
		Product product = new Product ("Abols",0.99f,"Sarkans un garsigs",4);
		model.addAttribute("mydata",product);
		return "product-show-one-page";
	}
	@GetMapping ("/product/test/all") 
	public String getProductTestAll(Model model) {
		ArrayList<Product> allProducts= new ArrayList<>(Arrays.asList(new Product("Abols",0.99f,"Garsigs",4)));
		model.addAttribute(allProducts)d
	}
	

}
