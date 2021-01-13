package com.CW_IIT.orbit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orbit {

    @Id
    private long satelliteId;
    private float elevation;
    private float azimuth;

    public long getSatelliteId() {
        return satelliteId;
    }
    public void setSatelliteId(long satelliteId) {
        this.satelliteId = satelliteId;
    }
    public float getElevation() {
        return elevation;
    }
    public void setElevation(float elevation) {
        this.elevation = elevation;
    }
    public float getAzimuth() {
        return azimuth;
    }
    public void setAzimuth(float azimuth) {
        this.azimuth = azimuth;
    }

}
