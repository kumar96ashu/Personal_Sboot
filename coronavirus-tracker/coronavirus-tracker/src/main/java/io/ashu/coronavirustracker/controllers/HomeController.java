package io.ashu.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.ashu.coronavirustracker.models.LocationStats;
import io.ashu.coronavirustracker.services.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronavirusdataservice;

	@GetMapping("/")
	public String home(Model model)
	{
		List<LocationStats> allStats = coronavirusdataservice.getAllStats();
		int totalCases = allStats.stream().mapToInt(stat -> stat.getLastTotalCases()).sum();
		int newCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalCasesReported", totalCases);
		model.addAttribute("newCasesReported", newCases);
		return "home";
	}
}
