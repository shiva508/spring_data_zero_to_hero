package com.pool.service.associations.onetomany.bidirectional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.mapper.schedule.ScheduleMapper;
import com.pool.model.associations.onetomany.bidirectional.Schedule;
import com.pool.repository.associations.onetomany.bidirectional.ScheduleRepository;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository scheduleRepository;
	
	@Autowired
	private ScheduleMapper scheduleMapper;
	

	@Override
	@Transactional
	public Schedule saveSchedule(Schedule schedule) {
		scheduleMapper.scheduleObjectMapper(schedule);
		return scheduleRepository.save(schedule);
	}

	@Override
	@Transactional
	public Schedule updateSchedule(Schedule schedule) {
		scheduleMapper.scheduleObjectMapper(schedule);
		return scheduleRepository.save(schedule);
	}

	@Override
	@Transactional
	public Schedule findScheduleByScheduleId(Long scheduleId) {
		
		return scheduleRepository.findById(scheduleId).get();
	}

	@Override
	@Transactional
	public List<Schedule> getAllSchedules() {
		
		return scheduleRepository.findAll();
	}

	@Override
	@Transactional
	public void deleteScheduleById(Long scheduleId) {
		scheduleRepository.deleteById(scheduleId);
	}

}
