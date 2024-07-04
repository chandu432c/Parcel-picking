package com.BY.DashBoradMS.Config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parcel {
    public int parcelid;
    public String name;
    public String email;
    public String phonenumber;
    public String parcelsource;
    //public String sourcepincode;
    //public String destinationpincode;
    public String parceldestination;
    public String parceltype;
    public double parcelweight;
    public String parcelstatus;
    public long price;
    public int vendorid; //fk
    public int destvendorid;

}
