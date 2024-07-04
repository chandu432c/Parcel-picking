package com.BY.DashBoradMS.DashBoardService;


import com.BY.DashBoradMS.Config.Parcel;
import com.BY.DashBoradMS.DashboardRepo.DashBoardrepo;
import com.BY.DashBoradMS.Entity.DashBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {


        @Autowired
       DashBoardrepo dashBoardrepo;



    public String registerparcel(Parcel parcel) {
                DashBoard dashBoard = new DashBoard();
                dashBoard.setParcelId(parcel.getParcelid());
                dashBoard.setVendorId(parcel.getVendorid());
                dashBoard.setSource(parcel.getParcelsource());
                dashBoard.setDestination(parcel.getParceldestination());
                dashBoard.setStatus(parcel.getParcelstatus());
                dashBoardrepo.save(dashBoard);
            return "success";
    }


    public String updateparcel(int parcelId, int destinationvendorId, String status) {
            DashBoard dashBoard = dashBoardrepo.findByParcelId(parcelId);
            dashBoard.setDestinationVendorId(destinationvendorId);
            dashBoard.setStatus(status);
            dashBoardrepo.save(dashBoard);
            return "success";
    }
    public List<DashBoard> getallparcels() {
            return dashBoardrepo.findAll();
    }

    public String updateuserstatus(int parcelId, int userId, String status) {
            DashBoard dashBoard = dashBoardrepo.findByParcelId(parcelId);
            dashBoard.setUserId(userId);
            dashBoard.setStatus(status);
            dashBoardrepo.save(dashBoard);
            return "success";
    }
}
