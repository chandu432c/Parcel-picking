package com.BY.DashBoradMS.Controller;


import com.BY.DashBoradMS.Config.Parcel;
import com.BY.DashBoradMS.DashBoardService.DashboardService;
import com.BY.DashBoradMS.Entity.DashBoard;
import jakarta.ws.rs.GET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashBoardController {


    @Autowired
    DashboardService dashboardService;

    @PostMapping("/registerparcel")
    public String registerparcel(@RequestBody Parcel parcel){
        return dashboardService.registerparcel(parcel);
    }

    @PutMapping("updatebyvendor/{parcelId}/{destinationvendorId}/{status}")
    public String updatebyvendor(@PathVariable("parcelId") int parcelId, @PathVariable("destinationvendorId") int destinationvendorId, @PathVariable("status") String status){
        return dashboardService.updateparcel(parcelId,destinationvendorId,status);
    }

    @GetMapping("/parcels")
    public List<DashBoard> getparcels(){
        return dashboardService.getallparcels();
    }

    @PutMapping("/updateuser/{parcelId}/{userId}/{status}")
    public String updateUser(@PathVariable("parcelId") int parcelId,@PathVariable("userId") int userId,@PathVariable("status") String status){
        return dashboardService.updateuserstatus(parcelId,userId, status);
    }





}
