package com.pool.service.scan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pool.domine.Scan;
import com.pool.repository.ScanRepository;

@Service
public class ScanServiceImpl implements ScanService {
	
	@Autowired
	private ScanRepository scanRepository;

	@Transactional
	@Override
	public Scan saveScan(Scan scan) {
		return scanRepository.save(scan);
	}

	@Transactional
	@Override
	public Scan updateScan(Scan scan) {
		return scanRepository.saveAndFlush(scan);
	}

	@Transactional
	@Override
	public List<Scan> getAllScans() {
		return scanRepository.findAll();
	}

}
