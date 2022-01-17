package com.pool.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.pool.domine.Scan;

@DataJpaTest
public class ScanRepositoryTest {
	
	@Autowired
	private ScanRepository scanRepository;

	@Test
	public void testSaveScan() {
		Scan scan = new Scan();
		scan.setCreatedDate(new Date()).setScanLocation("HYD").setScanType("IB");
		Scan savedScan=scanRepository.save(scan);
		assertNotNull(savedScan);
	}
}
