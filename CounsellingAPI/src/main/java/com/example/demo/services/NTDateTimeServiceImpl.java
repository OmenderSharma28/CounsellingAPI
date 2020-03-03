package com.example.demo.services;



import com.example.demo.model.NTDateTimeRoleVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;



@Service
public class NTDateTimeServiceImpl{

    @Autowired
    INTDateTimeService counselingAPI;

    //create operation
    public NTDateTimeRoleVO insertCounseling(NTDateTimeRoleVO dateTimeRoleVO) {
        
        NTDateTimeRoleVO results = counselingAPI.findByFirstNameAndLastNameAndRoleAndTime(dateTimeRoleVO.getFirstName(), dateTimeRoleVO.getLastName(), 
        		dateTimeRoleVO.getRole(), dateTimeRoleVO.getTime());
        if(results==null) {
        	return counselingAPI.insert(new NTDateTimeRoleVO(dateTimeRoleVO.getFirstName(), dateTimeRoleVO.getLastName(), dateTimeRoleVO.getRole()
            		, dateTimeRoleVO.getTime()));
        }else {
        	return results;
        }
     
    }

    //update operation
    public NTDateTimeRoleVO updateCounseling(NTDateTimeRoleVO dateTimeRoleVO) {
    	List<NTDateTimeRoleVO> dateTimeRoleVos = counselingAPI.findByFirstName(dateTimeRoleVO.getFirstName());
    	NTDateTimeRoleVO dateTimeRoleVo = new NTDateTimeRoleVO();
    	if(dateTimeRoleVos != null && dateTimeRoleVos.size() > 0) {
    		dateTimeRoleVo = dateTimeRoleVos.get(0);
    	}
    	dateTimeRoleVo.setFirstName(dateTimeRoleVO.getFirstName());
    	dateTimeRoleVo.setLastName(dateTimeRoleVO.getLastName());
    	dateTimeRoleVo.setRole(dateTimeRoleVO.getRole());
    	dateTimeRoleVo.setTime(dateTimeRoleVO.getTime());
    	if(dateTimeRoleVo.getId() != null) {
    	counselingAPI.delete(dateTimeRoleVo);
    	}
    	return counselingAPI.insert(dateTimeRoleVo);
    	
    }

    public List<NTDateTimeRoleVO> getAllDateTimeRoles(){
        return (List<NTDateTimeRoleVO>) counselingAPI.findAll();
    }


    public void deleteCounseling(NTDateTimeRoleVO dateTimeRoleVO) {
    	NTDateTimeRoleVO selectedAppointment = counselingAPI.findByFirstNameAndLastNameAndRoleAndTime(dateTimeRoleVO.getFirstName(),
    			dateTimeRoleVO.getLastName(), dateTimeRoleVO.getRole(), dateTimeRoleVO.getTime());
    	if(selectedAppointment != null && selectedAppointment.getId() != null) {
    		counselingAPI.delete(selectedAppointment);
    	}

    }

    public void deleteAllCounseling(){
        counselingAPI.deleteAll();
    }

    public List<NTDateTimeRoleVO> getCounseling(String firstname, String lastName){
        List<NTDateTimeRoleVO> resultVos = new ArrayList<>();

            List<NTDateTimeRoleVO> dateTimeRoleVOS = counselingAPI.findAll();
            for(NTDateTimeRoleVO dateTimeRoleVO1 : dateTimeRoleVOS){
                if(dateTimeRoleVO1.getFirstName().equalsIgnoreCase(firstname) && dateTimeRoleVO1.getLastName().equalsIgnoreCase(lastName)){
                    resultVos.add(dateTimeRoleVO1);
                }
            }
            return  resultVos;

    }
}

