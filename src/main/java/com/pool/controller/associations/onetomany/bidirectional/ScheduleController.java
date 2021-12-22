package com.pool.controller.associations.onetomany.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pool.model.associations.onetomany.bidirectional.Schedule;
import com.pool.service.associations.onetomany.bidirectional.ScheduleService;

@RestController
@RequestMapping("/onetomany")
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;

	@PostMapping("/save")
	public Schedule saveSchedule(@RequestBody Schedule schedule) {
		return scheduleService.saveSchedule(schedule);
	}

	@PutMapping("/update")
	public Schedule updateSchedule(@RequestBody Schedule schedule) {
		return scheduleService.updateSchedule(schedule);
	}

	@GetMapping("/findbyscheduleid/{scheduleId}")
	public Schedule findScheduleByScheduleId(@PathVariable("scheduleId") Long scheduleId) {
		return scheduleService.findScheduleByScheduleId(scheduleId);
	}

	@GetMapping("/getall")
	public List<Schedule> getAllSchedules() {
		return scheduleService.getAllSchedules();
	}

	@DeleteMapping("/deletebyid/{scheduleId}")
	public void deleteScheduleById(@PathVariable("scheduleId") Long scheduleId) {
		scheduleService.deleteScheduleById(scheduleId);
	}
}
