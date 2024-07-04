package com.BY.DashBoradMS.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashBoard {

    @Id
    private int parcelId;
    private int vendorId;
    private int destinationVendorId;
    private String Source;
    private String Destination;
    private int userId;
    private String status;

}
