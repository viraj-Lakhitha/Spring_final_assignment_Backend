package lk.ijse.gdse.VehicleService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Vehicle_Service")
public class Vehicle{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleId;
    private String vehicleBrand;
    private String category;
    private String fuelType;
    private String hybridOrNonHybrid;
    private String fuelUsage;
    private String seatCapacity;
    private String vehicleType;
    private String transmissionType;
    private String driverName;
    private String driverContactNo;
    private String remarks;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] frontViewImage;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] rearViewImage;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] sideViewImage;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] frontInteriorImage;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] rearInteriorImage;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] licenseFrontImage;

    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] licenseRearImage;

}
