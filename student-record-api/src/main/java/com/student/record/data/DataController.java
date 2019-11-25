package com.student.record.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	@Autowired
	private DataService dataService;
	@RequestMapping("/data")
	public List<Data> getAllData()
	{
		return dataService.getAllData();
	}
	@RequestMapping("/data/{sid}")
	public Data getData(@PathVariable String sid)
	{
		return dataService.getData(sid);
	}
	@PostMapping("/data")
	public void addData(@RequestBody Data data)
	{
		dataService.addData(data);
	}
	@PutMapping("/data/{sid}")
	public void updateData(@PathVariable String sid,@RequestBody Data data)
	{
		dataService.updateData(sid, data);
	}
	@DeleteMapping("/data/{sid}")
	public void deleteData(@PathVariable String sid)
	{
		dataService.deleteData(sid);
	}
}
