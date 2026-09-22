package pe.edu.upc.trabajoavance_kevin.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "climate_record")
public class ClimateRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "climate_id")
    private Long idClimate;

    @Column(name = "site_id", nullable = false)
    private Long idSite;

    @Column(name = "climate_date_time", nullable = false)
    private LocalDateTime climateDateTime;

    @Column(name = "temperature", precision = 10, scale = 2, nullable = false)
    private BigDecimal temperature;

    @Column(name = "humidity", precision = 10, scale = 2, nullable = false)
    private BigDecimal humidity;

    @Column(name = "climate_condition", length = 100, nullable = false)
    private String climateCondition;

    @Column(name = "wind_speed", precision = 10, scale = 2)
    private BigDecimal windSpeed;

    @Column(name = "thermal_sensation", precision = 10, scale = 2)
    private BigDecimal thermalSensation;

    public ClimateRecord() {}

    public Long getIdClimate() { return idClimate; }
    public void setIdClimate(Long idClimate) { this.idClimate = idClimate; }
    public Long getIdSite() { return idSite; }
    public void setIdSite(Long idSite) { this.idSite = idSite; }
    public LocalDateTime getClimateDateTime() { return climateDateTime; }
    public void setClimateDateTime(LocalDateTime climateDateTime) { this.climateDateTime = climateDateTime; }
    public BigDecimal getTemperature() { return temperature; }
    public void setTemperature(BigDecimal temperature) { this.temperature = temperature; }
    public BigDecimal getHumidity() { return humidity; }
    public void setHumidity(BigDecimal humidity) { this.humidity = humidity; }
    public String getClimateCondition() { return climateCondition; }
    public void setClimateCondition(String climateCondition) { this.climateCondition = climateCondition; }
    public BigDecimal getWindSpeed() { return windSpeed; }
    public void setWindSpeed(BigDecimal windSpeed) { this.windSpeed = windSpeed; }
    public BigDecimal getThermalSensation() { return thermalSensation; }
    public void setThermalSensation(BigDecimal thermalSensation) { this.thermalSensation = thermalSensation; }
}
