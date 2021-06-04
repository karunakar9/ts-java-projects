package mapsPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {
	List<Hospital> hospitalList=new ArrayList<>();
	public int addHospital( String hospitalName, List<String> listOfTreatments, String contactPerson,
			long contactNum, String location) {
		//List<Hospital> list=new ArrayList<>();
		Hospital h=new Hospital(hospitalName, listOfTreatments, contactPerson, contactNum, location);
		hospitalList.add(h);
		return h.getHospitalCode();

	}

	public Map getHospitals() {
		Map<Integer,String>mapList=new LinkedHashMap<Integer, String>();
		for(Hospital h:hospitalList)
		mapList.put(h.getHospitalCode(),h.getHospitalName());
		return mapList;

	}

	public Hospital getHospitalDetails(int hospitalCode) {
		for(Hospital h:hospitalList)
			if(h.getHospitalCode()==hospitalCode)
				return h;
		return null;

	}

}
