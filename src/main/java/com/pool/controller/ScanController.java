package com.pool.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pool.domine.Scan;
import com.pool.service.scan.ScanService;

@RestController
public class ScanController {
	@Autowired
	private ScanService scanService;

	@PostMapping("/savescan")
	public ResponseEntity<?> saveScan(@RequestBody Scan scan) {
		Scan savedSacn = scanService.saveScan(scan);
		return new ResponseEntity<>(savedSacn, HttpStatus.CREATED);
	}

	@PutMapping("/updatescan")
	public ResponseEntity<?> updateScan(@RequestBody Scan scan) {
		Scan updatedSacn = scanService.updateScan(scan);
		return new ResponseEntity<>(updatedSacn, HttpStatus.OK);
	}

	@GetMapping("/allscans")
	public ResponseEntity<?> getAllScans() {
		List<Scan> scans = scanService.getAllScans();
		return new ResponseEntity<>(scans, HttpStatus.OK);
	}
}
