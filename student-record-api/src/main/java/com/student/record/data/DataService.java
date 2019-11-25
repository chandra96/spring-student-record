package com.student.record.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
	@Autowired
	private DataRepositary dataRepositary;
	
	public List<Data> getAllData()
	{
		List<Data> data=new ArrayList<>();
		dataRepositary.findAll().forEach(data::add);
		return data;
	}
	public Data getData(String sid)
	{
		return dataRepositary.findById(sid).orElse(null);
	}
	
	public void addData(Data data)
	{
		dataRepositary.save(data);
	}
	
	public void updateData(String sid,Data data)
	{
		dataRepositary.save(data);
	}
	
	public void deleteData(String sid)
	{
		dataRepositary.deleteById(sid);
	}
}
